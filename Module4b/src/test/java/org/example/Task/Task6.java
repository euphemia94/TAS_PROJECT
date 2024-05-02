package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to https://www.saucedemo.com/
        //Login using username and password.
        //Click on the login button,
        //click on the "add to cart" button of any product (Add only one item)
        //click the cart icon on the top right.
        //Click on checkout.  USE ONLY CSS LOCATION STRATEGY
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //after setting you create the object of the webdriver as seen below
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://www.saucedemo.com/");
        //is advisible to introduce wait as seen below //input[@id='login-button']
        Thread.sleep(5000);
        //enter username and password, and login
        driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[id=login-button")).click();
        Thread.sleep(5000);
        //add item to cart
        driver.findElement(By.cssSelector("button[id=add-to-cart-sauce-labs-bike-light]")).click();
        Thread.sleep(5000);
        //click cart
        driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link")).click();
        Thread.sleep(5000);
        //checkout
        driver.findElement(By.cssSelector("button[id=checkout]")).click();
        Thread.sleep(5000);


    }
}
