import time

from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class CheckoutPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)
    def fill_login_details(self, username, password):
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]'))).send_keys(username)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Password input field"]'))).send_keys(password)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Login button"]'))).click()
        time.sleep(3)

    def fill_shipping_details(self, name, address, address2, city, state, zip_code, country):
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Full Name* input field"]').send_keys(name)
        self.driver.find_element(AppiumBy.ACCESSIBILITY_ID, '//android.widget.EditText[@content-desc="Address Line 1* input field"]').send_keys(address)
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Address Line 1* input field"]').send_eys(address2)
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="City* input field"]').send_keys(city)
        self.driver.find_element(AppiumBy.ACCESSIBILITY_ID, '//android.widget.EditText[@content-desc="State/Region input field"]').send_keys(state)
        self.driver.find_element(AppiumBy.ACCESSIBILITY_ID, '//android.widget.EditText[@content-desc="Zip Code* input field"]').send_keys(zip_code)
        self.driver.find_element(AppiumBy.ACCESSIBILITY_ID, '//android.widget.EditText[@content-desc="Country* input field"]').send_keys(country)
        self.driver.find_element(AppiumBy.ACCESSIBILITY_ID, '//android.view.ViewGroup[@content-desc="To Payment button"]').click()
