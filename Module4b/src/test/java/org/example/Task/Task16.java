package org.example.Task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task16 {
    WebDriver driver;
    //Navigate to https://testifyltd.com/ .
    //Assert that Our contact column at the footer of the homepeage has the follwing correct details,
    // EMAIL: info@testifyltd.co.uk, LOCATION: Nigeria, PHONE: (+234)904-882-0971
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //executable property of the chrome driver
        //lunch browser.
        driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
    }
    @Test
    public void navTestify() {
        //to navigate to testify ltd,
        driver.get("https://testifyltd.com/");
        //get the footer element
        WebElement emailElement = driver.findElement(By.xpath("//footer//a[contains(@href, 'mailto:')]"));
        WebElement locationElement = driver.findElement(By.xpath("//footer//span[contains(text(),'Location:')]/following-sibling::span"));
        WebElement phoneElement = driver.findElement(By.xpath("//footer//span[contains(text(),'Phone:')]/following-sibling::span"));
       //call assert class to assert if element contain actual text
        String email = emailElement.getText();
        String location = locationElement.getText();
        String phone = phoneElement.getText();

        // Expected values
        String expectedEmail = "info@testifyltd.co.uk";
        String expectedLocation = "Nigeria";
        String expectedPhone = "(+234)904-882-0971";

        // Assert contact details
        Assert.assertEquals(email, expectedEmail, "Email is incorrect");
        Assert.assertEquals(location, expectedLocation, "Location is incorrect");
        Assert.assertEquals(phone, expectedPhone, "Phone number is incorrect");
    }
    @AfterClass
    public void close() {
        driver.quit();

    }
}
