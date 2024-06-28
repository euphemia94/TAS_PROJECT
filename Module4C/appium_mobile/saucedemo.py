import time

from appium import webdriver
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def main():
    desired_caps = {
        "deviceName": "Android Emulator",
        "platformName": "Android",
        "platformVersion": "6",
        "app": "C:/Users/USER/Downloads/Android-MyDemoAppRN.1.1.0.build-226.apk",
        "appPackage": "com.saucelabs.mydemoapp.rn",
        "noSign": True,
        #"androidInstallTimeout": 120000  # Increase install timeout to 2 minutes (120000 ms)
    }
    driver = webdriver.Remote(command_executor="http://127.0.0.1:4723/wd/hub", desired_capabilities=desired_caps)
    time.sleep(5)
    driver.quit()

if __name__ == '__main__':
    main()
