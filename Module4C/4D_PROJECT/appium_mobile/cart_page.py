import time
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from urllib3.util import wait


class CartPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 20)

    def view_cart(self):
        cart_icon = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart badge"]/android.widget.ImageView')))
        cart_icon.click()
        time.sleep(3)

    def get_cart_item_names(self):
        # Wait for all items to be present
        cart_items = self.wait.until(EC.presence_of_all_elements_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart badge"]/android.widget.ImageView')))

        # Extract text from each element and store in a list
        item_names = [item.text for item in cart_items]
        return item_names

    def remove_items(self):
        first_remove_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[1]')))
        first_remove_button.click()
        second_remove_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[2]')))
        second_remove_button.click()

    def get_remaining_items_count(self):
        cart_items = self.wait.until(EC.presence_of_all_elements_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart item"]//android.widget.TextView[@content-desc="item name"]')))
        remaining_count = len(cart_items)
        return f"{remaining_count} items"
        time.sleep(3)


    def remaing_cart_item(self):
        remaining_cart_item = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '//android.widget.TextView[@content-desc="total number"]')))

    def proceed_to_checkout(self):
        proceed_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.ACCESSIBILITY_ID, "Proceed To Checkout button")))
        proceed_button.click()
