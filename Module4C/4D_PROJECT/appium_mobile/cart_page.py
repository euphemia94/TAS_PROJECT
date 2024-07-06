from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class CartPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)

    def get_cart_items(self):
        return self.driver.find_elements(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart badge"]/android.widget.ImageView').click()

    def remove_items(self, count):
        self.driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[1]').click()
        self.driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[2]').click()

    def proceed_to_checkout(self):
        self.driver.find_element(AppiumBy.ACCESSIBILITY_ID, "Proceed To Checkout button").click()
