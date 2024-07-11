import time
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

class CheckoutPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)

    def fill_shipping_details(self, name, address, address2, city, state, zip_code, country):
        try:
            name_field = self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Full Name* input field"]')))
            name_field.send_keys(name)
            print("Filled name")

            address_field = self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Address Line 1* input field"]')))
            address_field.send_keys(address)
            print("Filled address")

            address2_field = self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Address Line 2 input field"]')))
            address2_field.send_keys(address2)
            print("Filled address2")

            city_field = self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="City* input field"]')))
            city_field.send_keys(city)
            print("Filled city")

            state_field = self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="State/Region input field"]')))
            state_field.send_keys(state)
            print("Filled state")

            zip_field = self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Zip Code* input field"]')))
            zip_field.send_keys(zip_code)
            print("Filled zip code")

            country_field = self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Country* input field"]')))
            country_field.send_keys(country)
            print("Filled country")

            to_payment_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="To Payment button"]')))
            to_payment_button.click()
            print("Clicked to payment button")

        except Exception as e:
            print(f"Error occurred: {str(e)}")
            raise
