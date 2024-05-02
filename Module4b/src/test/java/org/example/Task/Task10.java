package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to https://jqueryui.com/
        //click on the dialog menu from the left pane
        //click on the close icon to close the dialogue box in the middle
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //object of the webdriver as seen below
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //to navigate to web page, either by driver.navigate() or driver.get()
        driver.get("https://jqueryui.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        //switch to iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.xpath("//body/div[1]/div[1]/button[1]/span[1]")).click();


    }
}
