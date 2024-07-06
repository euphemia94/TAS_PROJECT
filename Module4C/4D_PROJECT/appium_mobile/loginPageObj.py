import time

from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

class LoginPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 20)

    def login(self, username, password):
        time.sleep(3)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView'))).click()
        time.sleep(3)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="products screen"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]'))).click()
        time.sleep(3)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]'))).send_keys(username)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Password input field"]'))).send_keys(password)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Login button"]'))).click()
        time.sleep(3)

    def get_error_message(self):
        return self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.TextView[@text="Provided credentials do not match any user in this service."]')))

    def clear_inputs(self):
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]'))).clear()
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Password input field"]'))).clear()
