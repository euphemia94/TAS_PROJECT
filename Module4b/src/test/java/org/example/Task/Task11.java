package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        //Go to google.
        //search for "testify ltd"
        //Click on the search that result with www.testifyltd.com
        //sroll down the testify website and click on the LinkedIn icon.
        //Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png )
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //to navigate to website
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/*[1]")).click();
        Thread.sleep(3000);
        // Click on the search result with www.testifyltd.com
        WebElement testifyLink = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/div[1]/div[1]/div[2]/cite[1]"));
        testifyLink.click();
        //to scroll, import js executor
        JavascriptExecutor scrolling = (JavascriptExecutor) driver ;
        //to click LinkedIn
        List<WebElement> linkedInIcons =  driver.findElements(By.xpath("//body/div[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/aside[1]/div[1]/a[4]/span[1]/span[1]"));
        //to switch to new LinkedIn tab
        for (String newWindow: driver.getWindowHandles() ){
            driver.switchTo().window(newWindow);
            //to get description
            WebElement description = driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/main[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/p[1]"));
            String descriptionText = description.getText();
            System.out.println(descriptionText);
        }

    }
}
