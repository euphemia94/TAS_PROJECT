package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to https://idorenyinankoh.github.io/loginPage/
        //check if the " create account" button is enabled"
        //fill all the fields
        //check if the "create account"is enabled
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //after setting you create the object of the webdriver as seen below
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        //is advisible to introduce wait as seen below //input[@id='login-button']
        Thread.sleep(3000);
        //check if the create account is enabled
        boolean state = driver.findElement(By.xpath("//button[@id=\"create\"]")).isEnabled();
        System.out.println(state);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Euphemia");
        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Nnaemeka");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("euphemiauc94@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"female\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("12345a");
        driver.findElement(By.xpath("//input[@id=\"confirmPass\"]")).sendKeys("12345a");
        driver.findElement(By.xpath("//input[@id=\"xpLevel\"]")).sendKeys("i am a student of testify academy");
        boolean state2 = driver.findElement(By.xpath("//button[@id=\"create\"]")).isEnabled();
        System.out.println(state2);
    }
}
