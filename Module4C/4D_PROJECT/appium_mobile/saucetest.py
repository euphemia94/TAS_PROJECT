import time
from appium import webdriver
from appium.options.android import UiAutomator2Options

from loginPageObj import LoginPage
from product_page import ProductsPage
from cart_page import CartPage

def setup_driver():
    options = UiAutomator2Options()
    options.device_name = "Android Emulator"
    options.platform_name = "Android"
    options.platform_version = "6"
    options.app = "C:/Users/USER/Downloads/Android-MyDemoAppRN.1.1.0.build-226.apk"
    options.appPackage = "com.saucelabs.mydemoapp.rn"
    options.no_sign = True

    driver = webdriver.Remote(command_executor="http://127.0.0.1:4723/wd/hub", options=options)
    return driver

def my_demo():
    driver = setup_driver()
    loginPageObj = LoginPage(driver)
    products_page = ProductsPage(driver)
    cart_page = CartPage(driver)


    # login with invalid username
    loginPageObj.login("wrong-name", "10203040")
    loginPageObj.get_error_message().is_displayed()
    loginPageObj.clear_inputs()

    # login with invalid password
    loginPageObj.login("bob@example.com", "102eeeeee")
    loginPageObj.get_error_message().is_displayed()
    loginPageObj.clear_inputs()

    # login with valid credentials
    loginPageObj.login("bob@example.com", "10203040")

    # Assert that am on PRODUCTS page
    products_page.get_title().is_displayed()
    assert "PRODUCTS" in products_page.get_title()

    # Sort by "Price - Ascending"
    products_page.sort_by_price_ascending()

    # Add all items to cart
    products_page.add_all_items_to_cart()

    # Give 5 star rating
    products_page.give_five_star_review()

    # Get cart items
    cart_page.get_cart_items()

    #assert  cart items
    assert cart_page.get_cart_items() is 6

    # Remove item from cart
    cart_page.remove_items()

    # proceed to checkout
    cart_page.proceed_to_checkout()







if __name__ == '__main__':
    my_demo()
