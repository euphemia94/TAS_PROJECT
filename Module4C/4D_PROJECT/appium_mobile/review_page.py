import time
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

class ReviewPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 20)

    #def scroll_to_bottom(self):
     #   self.driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")

    def place_order(self):
        time.sleep(3)
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Place Order button"]').click()

    def get_success_message(self):
        time.sleep(3)
        return self.driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Thank you for your order"]').text
