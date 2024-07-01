from appium import webdriver
from appium.options.android import UiAutomator2Options
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def main():
    options = UiAutomator2Options()
    options.device_name = "Android Emulator"
    options.platform_name = "Android"
    options.platform_version = "12"
    options.app_package = "C:/Users/USER/Downloads/Android-MyDemoAppRN.1.1.0.build-226.apk"
    options.appPackage: "com.saucelabs.mydemoapp.rn"
    options.no_sign = True
    #options.android_install_timeout = 120000  # Increase install timeout to 2 minutes

    driver = webdriver.Remote(command_executor="http://127.0.0.1:4723/wd/hub", options=options)
    #loggins
    
    driver.quit()

if __name__ == '__main__':
    main()
