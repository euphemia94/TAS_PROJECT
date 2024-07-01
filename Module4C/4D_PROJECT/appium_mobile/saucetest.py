import time
from appium import webdriver
from loginPageObj import LoginPage

from pages.products_page import ProductsPage

def setup_driver():
    desired_caps = {
        "deviceName": "Android Emulator",
        "platformName": "Android",
        "platformVersion": "6",
        "app": "C:/Users/USER/Downloads/Android-MyDemoAppRN.1.1.0.build-226.apk",
        "appPackage": "com.saucelabs.mydemoapp.rn",
        "appActivity": ".MainActivity",
        "noSign": True
    }
    return webdriver.Remote(command_executor="http://127.0.0.1:4723/wd/hub", desired_capabilities=desired_caps)

def test_login():
    driver = setup_driver()
    loginPageObj = LoginPage(driver)
    products_page = ProductsPage(driver)

    #login with Invalid username
    LoginPage.login("invalidname", "10203040")
    assert loginPageObj.get_error_message() == "Invalid username or password."
    LoginPage.clear_inputs()

    #login with Invalid password
    loginPageObj.login("bob@example.com", "102eeeeee")
    assert loginPageObj.get_error_message() == "Invalid username or password."
    LoginPage.clear_inputs()

    # login with Valid login
    LoginPage.login("bob@example.com", "10203040")

    # Assert that am on PRODUCTS page
    assert products_page.get_title() == "PRODUCTS"

    # Sort by "Price - Ascending"
    products_page.sort_by_price_ascending()

    # Add all items to cart
