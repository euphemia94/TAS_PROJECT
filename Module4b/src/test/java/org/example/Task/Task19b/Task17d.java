package org.example.Task.Task19b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task17d {
    WebDriver driver;
    //Navigate to the homepage and click on the Interactions tile
    //Assert that you are on the Interactions page
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //executable property of the chrome driver
        //lunch browser
        driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
    }
    @Test
    public void interactions() {
        //select element title
        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/svg[1]/path[1]")).click();
        String interactionPage = driver.getTitle();
        Assert.assertEquals(interactionPage, "Forms");
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}