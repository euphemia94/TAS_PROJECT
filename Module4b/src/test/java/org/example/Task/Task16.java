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
        WebElement emailEl =  driver.findElement(By.xpath("//div[@id='sc_content_777378833']/p[contains(text(),'EMAIL: info@testifyltd.co.uk')]"));
        WebElement locationEl =  driver.findElement(By.xpath("//div[@id='sc_content_777378833']/p[contains(text(),'LOCATION: Nigeria')]"));
        WebElement phoneEl = driver.findElement(By.xpath("//div[@id='sc_content_777378833']/p[contains(text(),'PHONE: (+234)904-882-0971')]"));
        //call assert class to assert if element contain actual text

        Assert.assertTrue(emailEl.isDisplayed(), "Email is not displayed correctly");
        Assert.assertTrue(locationEl.isDisplayed(), "Location is not displayed correctly");
        Assert.assertTrue(phoneEl.isDisplayed(), "Phone number is not displayed correctly");
    }
    @AfterClass
    public void close() {
        driver.quit();

    }
}
