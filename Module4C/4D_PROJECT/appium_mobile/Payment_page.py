import time

from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


class PaymentPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)

    def assert_you_are_on_PaymentPage(self):
        return self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.TextView[@text="Enter a payment method"]'))).text
    def fill_payment_details(self, fullName, CardNumber, expirationDate, securityCode ):
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Full Name* input field"]'))).send_keys(fullName)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Card Number* input field"]'))).send_keys(CardNumber)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Expiration Date* input field"]'))).send_keys(expirationDate)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Security Code* input field"]'))).send_keys(securityCode)
        self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Review Order button"]'))).click()

        time.sleep(3)






