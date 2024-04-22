package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to http://demo.guru99.com/
        //Click on the security Project menu.
        // Input any text in the email and password find
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //after setting you create the object of the webdriver as seen below
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("http://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        //is advisible to introduce wait as seen below btnLogin
        Thread.sleep(5000);
        driver.findElement(By.name("uid")).sendKeys("euphemia");
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("123dd");
        Thread.sleep(5000);
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(5000);

    }
}
