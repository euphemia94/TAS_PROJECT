from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

class ProductsPage:
    def __init__(self, driver):
        self.driver = driver
        self.wait = WebDriverWait(driver, 10)

    def get_title(self):
        return self.wait.until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.TextView[@text="Products"]'))).text

    def sort_by_price_ascending(self):
        assending_btn = self.driver.find_element(AppiumBy.XPATH,'//android.view.ViewGroup[@content-desc="sort button"]/android.widget.ImageView')
        price_assending = self.driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Price - Ascending"]')
        assending_btn.click()
        price_assending.click()

    def add_all_items_to_cart(self):
        self.driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[1]/android.view.ViewGroup[1]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH,'//android.view.ViewGroup[@content-desc="Add To Cart button"]').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]').click()
        self.driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[2]/android.view.ViewGroup[1]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Add To Cart button"]').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]').click()
        self.driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[3]/android.view.ViewGroup[1]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Add To Cart button"]').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]').click()
        self.driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[4]/android.view.ViewGroup[1]/android.widget.ImageView')
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Add To Cart button"]')
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]').click()
        self.driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[5]/android.view.ViewGroup/android.widget.ImageView')
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Add To Cart button"]')
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]').click()
        self.driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[6]/android.view.ViewGroup/android.widget.ImageView')
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="Add To Cart button"]')
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '//android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]').click()

    def give_five_star_review(self):
        self.driver.find_element(AppiumBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[1]/android.view.ViewGroup[1]/android.widget.ImageView').click()
        self.driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="󰓏"])[5](//android.widget.TextView[@text="󰓏"])[5]').click()
        self.driver.find_element(AppiumBy.ACCESSIBILITY_ID, "Close Modal button").click()

    def view_cart(self):
        self.driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart badge"]/android.widget.ImageView').click()








