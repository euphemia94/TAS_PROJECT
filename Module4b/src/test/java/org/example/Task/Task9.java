package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to saucedemo.com
        //Login with username and password
        //navigate back to login screen from the homepage
        //print out the Login button attribut "VALUE" to verify that you are back on the login screen
        //navigate forward to the homepage, print out a name of a product to verify that you are back on the homepage
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        //navigate back from home page
        driver.navigate().back();
        //print login button value
        String loginDetails = driver.findElement(By.xpath("//input[@id='login-button']")).getAttribute("value");
        System.out.println(loginDetails);
        //navigate forward
        driver.navigate().forward();

        String productName = driver.findElement(By.xpath("//div[@id='']")).getText();
        System.out.println("Product name: " + productName);
    }
}
