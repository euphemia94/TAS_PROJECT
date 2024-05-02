package org.example.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_Class1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //after setting you create the object of the webdriver as seen below
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        //to navigate to google page, you will use this: driver.navigate() or driver.get()
        driver.get("https://www.google.com/");

    }
}
