package org.example.Task.Task19b;

import org.example.Task18.SauceDemoCart;
import org.example.Task18.SauceDemoLogin;
import org.example.Task18.SauceDemoProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task18 {
    //Using your knowledge of POM, organize your order item test case below:
    //Navigate to saucedemo.com
    //Login with the username and password on the Login screen.
    //Add to items to cart. Click on the cart icon on the top right.
    //assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page.
    //Click on the checkout button. 6. Input first name last name and postal code and click on continue.
    //Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
    //Click on the "Finish" button. Assert that user sees an success message "THANK YOU FOR YOUR ORDER".
    WebDriver driver = null;
    @Test
    public void sauceTest () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //lunch browser
        driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        //navigate url
        driver.get("https://www.saucedemo.com/");
        //object of the sauceDemoLogin
        SauceDemoLogin Login = new SauceDemoLogin(driver);
        SauceDemoProduct Product = new SauceDemoProduct(driver);
        SauceDemoCart Cart = new SauceDemoCart(driver);

        Login.getUsername().sendKeys("standard_user");
        Login.getPassword().sendKeys("secret_sauce");
        Login.getLoginbtn().click();
        Product.getProduct1().click();
        Product.getProduct2().click();
        Product.goTocart().click();


    }
}
