import time
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import StaleElementReferenceException

class ProductsPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 20)
        self.cart_item_names = []

    def get_title(self):
        return self.wait.until(
            EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.TextView[@text="Products"]'))).text

    def sort_by_price_ascending(self):
        ascending_btn = self.wait.until(EC.element_to_be_clickable(
            (AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="sort button"]/android.widget.ImageView')))
        ascending_btn.click()
        price_ascending = self.wait.until(
            EC.element_to_be_clickable((AppiumBy.XPATH, '//android.widget.TextView[@text="Price - Ascending"]')))
        price_ascending.click()

    def add_all_items_to_cart(self):
        item_xpaths = [
            '(//android.view.ViewGroup[@content-desc="store item"])[1]/android.view.ViewGroup[1]/android.widget.ImageView',
            '(//android.view.ViewGroup[@content-desc="store item"])[2]/android.view.ViewGroup[1]/android.widget.ImageView',
            '(//android.view.ViewGroup[@content-desc="store item"])[3]/android.view.ViewGroup[1]/android.widget.ImageView',
            '(//android.view.ViewGroup[@content-desc="store item"])[4]/android.view.ViewGroup[1]/android.widget.ImageView',
            '(//android.view.ViewGroup[@content-desc="store item"])[5]/android.view.ViewGroup[1]/android.widget.ImageView',
            '(//android.view.ViewGroup[@content-desc="store item"])[6]/android.view.ViewGroup[1]/android.widget.ImageView'
        ]

        add_to_cart_button_xpath = '//android.view.ViewGroup[@content-desc="Add To Cart button"]'

        for item_xpath in item_xpaths:
            item = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, item_xpath)))
            item_name = item.get_attribute("content-desc")  # Assuming item name is stored in content-desc

            item.click()
            add_to_cart_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, add_to_cart_button_xpath)))
            add_to_cart_button.click()
            self.driver.back()
            time.sleep(3)

            # Store item name in the list
            self.cart_item_names.append(item_name)

    def get_cart_item_names(self):
        return self.cart_item_names

    def give_five_star_review(self):
        first_item = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[1]/android.view.ViewGroup[1]/android.widget.ImageView')))
        first_item.click()
        five_star_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '(//android.widget.TextView[@text="󰓏"])[5]')))
        five_star_button.click()
        close_modal_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.ACCESSIBILITY_ID, "Close Modal button")))
        close_modal_button.click()
