from appium import webdriver
from appium.options.android import UiAutomator2Options
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def main():
    options = UiAutomator2Options()
    options.device_name = "Android Emulator"
    options.platform_name = "Android"
    options.platform_version = "6"
    options.app = "C:/Users/USER/Downloads/Android-MyDemoAppRN.1.1.0.build-226.apk"
    options.appPackage: "com.saucelabs.mydemoapp.rn"
    options.no_sign = True
    #options.android_install_timeout = 120000  # Increase install timeout to 2 minutes

    driver = webdriver.Remote(command_executor="http://127.0.0.1:4723/wd/hub", options=options)
    # loggin
    driver.find_element(AppiumBy.XPATH,'//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView').click()
    driver.find_element(AppiumBy.XPATH,'//android.view.ViewGroup[@content-desc="products screen"]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]').click()
    driver.find_element(AppiumBy.XPATH,'//android.widget.EditText[@content-desc="Password input field"]')
    driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]').send_keys("bob@example.com")

    def get_cart_item_names(self):
        item_names = []
        cart_items = self.wait.until(EC.presence_of_all_elements_located(
            (AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart item"]')))
        for item in cart_items:
            item_name = item.find_element(AppiumBy.XPATH, '//android.widget.TextView[@content-desc="item name"]').text
            item_names.append(item_name)
        return item_names

    def get_cart_item_names(self):
        # Wait for all items to be present
        cart_items = self.wait.until(EC.presence_of_all_elements_located((AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart item"]/android.widget.TextView[@content-desc="item name"]')))

        # Extract text from each element and store in a list
        item_names = [item.text for item in cart_items]
        return item_names

    def my_cart_page_is_complete(self):
        my_cart_page = wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.TextView[@text="My Cart"]')))
        assert my_cart_page.text == "My Cart", "My Cart page is incomplete"
        print("My Cart page is complete")



if __name__ == '__main__':
    main()
