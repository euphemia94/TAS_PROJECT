package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        //Navigate to https://jqueryui.com/
        //.click on the "resize" menu from the left pane
        //Drag the box to be bigger.(Resixe the box to be bigger)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://jqueryui.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
        Thread.sleep(5000);
        //to resize we use the Actions class
        //since element is inside iframe, navigate to iframe to access the object
        driver.switchTo().frame(0);
        //get element
        WebElement toBeResized = driver.findElement(By.xpath("//div[@id='resizable']"));
        Actions resizable = new Actions(driver);
        resizable.clickAndHold(toBeResized).moveByOffset(295, 278);

    }
}
