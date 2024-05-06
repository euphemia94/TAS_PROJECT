package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        //Go to https://selenium08.blogspot.com/
        // search for "Demo dropdown" form the search field.
        // on the drop down page, select Nigeria from the country list
        // and select january february and march from the moths list. (image; https://i.imgur.com/sIgQwwG.png)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://selenium08.blogspot.com//");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Demo dropdown");
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/label[1]/div[1]/*[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[3]/div[1]/a[1]")).click();
        Thread.sleep(5000);
        WebElement country = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        country.click();
        Thread.sleep(5000);
        //using the select class
        Select select =new Select(country);
        select.selectByValue("NG");
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.xpath("//option[contains(text(),'Month...')]"));
        Select select2 =new Select(month);
        select2.selectByVisibleText("January");
        select2.selectByVisibleText("February");
        select2.selectByVisibleText("March");




    }

}
