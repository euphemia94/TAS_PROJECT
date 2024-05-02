package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task14 {
    public static void main(String[] args) {
        //Navigate to https://www.toolsqa.com/
        //close the dialogue box that pops up after a few seconds
        //Click on the tutorial button on the top left corner of the page
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://www.toolsqa.com/");
        //call the wait class,and  to close the dialogue box
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[id='accept-cookies-policy']")));
        //click the tutorial
        driver.findElement(By.cssSelector("span.navbar__tutorial-menu--menu-bars")).click();

    }
}
