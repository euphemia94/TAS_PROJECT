from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

class LoginPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)

    def login(self, username, password):
        self.driver.find_element(AppiumBy.XPATH, "xpath-value").click()
        self.driver.find_element(AppiumBy.XPATH, "xpath-value").click()
        self.driver.find_element(AppiumBy.XPATH, "xpath-value").send_keys(username)
        self.driver.find_element(AppiumBy.XPATH, "xpath-value").send_keys(password)
        self.driver.find_element(AppiumBy.XPATH, "xpath-value").click()

    def get_error_message(self):
        return self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, "error message"))).text

    def clear_inputs(self):
        self.driver.find_element(AppiumBy.XPATH, "username input field").clear()
        self.driver.find_element(AppiumBy.XPATH, "password input field").clear() 
