package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to https://www.saucedemo.com/
        //Login using username and password.
        //Click on the login button,
        //click on the "add to cart" button of any product (Add only one item)
        //click the cart icon on the top right.
        //Click on checkout.  USE ONLY XPATH LOCATION STRATEGY
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //after setting you create the object of the webdriver as seen below
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://www.saucedemo.com/");
        //is advisible to introduce wait as seen below //input[@id='login-button']
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(5000);



    }
}
