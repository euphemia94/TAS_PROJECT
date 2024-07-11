import time
from appium import webdriver
from appium.options.android import UiAutomator2Options

from loginPageObj import LoginPage
from product_page import ProductsPage
from cart_page import CartPage
from checkout_page import CheckoutPage
from Payment_page import PaymentPage
from review_page import ReviewPage

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
    checkout_page = CheckoutPage(driver)
    Payment_page = PaymentPage(driver)
    review_page = ReviewPage(driver)


    # login with invalid username
    loginPageObj.meue()
    loginPageObj.login("wrong-name", "10203040")
    #loginPageObj.get_error_message().is_displayed()
    assert 'Provided credentials do not match any user in this service.' in loginPageObj.get_error_message()
    loginPageObj.clear_inputs()

    time.sleep(3)
    # login with invalid password
    loginPageObj.login("bob@example.com", "102eeeeee")
    assert 'Provided credentials do not match any user in this service.' in loginPageObj.get_error_message()
    loginPageObj.clear_inputs()

    time.sleep(3)
    # login with valid credentials
    loginPageObj.login("bob@example.com", "10203040")

    # Assert that am on PRODUCTS page
    products_page.get_title()
    #assert "PRODUCTS" in products_page.get_title()

    # Sort by "Price - Ascending"
    products_page.sort_by_price_ascending()

    # Add all items to cart
    products_page.add_all_items_to_cart()

    # Give 5 star rating
    products_page.give_five_star_review()

    # Get cart items
    cart_page.view_cart()

    #Assert items added to cart are displayed correctly
    #cart_page.my_cart_page_is_complete()
    #  products_cart_names = products_page.get_cart_item_names()
    # cart_cart_names = cart_page.get_cart_item_names()
    # Assert that the items you added to cart are displayed correctly on the "My Cart" page

    # Remove item from cart
    cart_page.remove_items()

    #remaining_items = cart_page.get_remaining_items_count()
    #assert remaining_items == '4 items', f"Expected '4 items', but found '{remaining_items}'"

    #assert cart_page.remaing_cart_item() == '4 items'

    time.sleep(3)
    # proceed to checkout
    cart_page.proceed_to_checkout()

    checkout_page.fill_shipping_details("Uche", "govt. land", "road 9", "Cornwell", "Truo", "89706", "UK")

    # assert that you are payment page
    assert "Enter a payment method" in Payment_page.assert_you_are_on_PaymentPage()
    Payment_page.fill_payment_details("Rebecca Mia", "2314 6790 8754 234", "02/26", "313")

    # scrool down
    #review_page.scroll_to_bottom()
    review_page.place_order()
    review_page.get_success_message()


if __name__ == '__main__':
    my_demo()
