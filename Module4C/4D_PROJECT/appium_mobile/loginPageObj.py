import time
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

class LoginPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 30)  # Increased wait time

    def meue(self):
        time.sleep(3)
        open_menu = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView')))
        open_menu.click()
        time.sleep(5)
        products_screen = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="products screen"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]')))
        products_screen.click()
        time.sleep(5)

    def login(self, username, password):
        username_field = self.wait.until(EC.visibility_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]')))
        username_field.send_keys(username)
        password_field = self.wait.until(EC.visibility_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Password input field"]')))
        password_field.send_keys(password)
        login_button = self.wait.until(EC.element_to_be_clickable((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Login button"]')))
        login_button.click()
        time.sleep(3)

    def get_error_message(self):
        return self.wait.until(EC.visibility_of_element_located((AppiumBy.XPATH, '//android.widget.TextView[@text="Provided credentials do not match any user in this service."]'))).text

    def clear_inputs(self):
        username_field = self.wait.until(EC.visibility_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]')))
        username_field.clear()
        password_field = self.wait.until(EC.visibility_of_element_located((AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Password input field"]')))
        password_field.clear()
