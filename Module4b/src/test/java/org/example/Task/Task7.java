package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task7 {
    public static <list> void main(String[] args) throws InterruptedException {
        //Navigate to https://worldweather.wmo.int/en/home.html.
        //Search for your city in the search field. When the result loads, print the
        // days and weather description for each of the days shown in a readable and
        // understandable manner.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://worldweather.wmo.int/en/home.html");
        //is advisible to introduce wait as seen below //input[@id='login-button']
        Thread.sleep(3000);
        // get the locators fo the box and type city, state etc
        driver.findElement(By.cssSelector("input[id=q_search]")).sendKeys("Lagos Nigeria");
        //click on the search icon
        driver.findElement(By.cssSelector("div.wrapper:nth-child(1) div.row.shortcut_n_searchbox:nth-child(6) div:nth-child(1) div:nth-child(5) div:nth-child(1) form:nth-child(1) > input.top_searchbox_submit:nth-child(4)n")).click();
        Thread.sleep(5000);
        //to get the all date
        List<WebElement> daysElement = driver.findElements(By.cssSelector("div.city_fc_date.fs0"));
        System.out.println(daysElement);
        Thread.sleep(5000);
        //get all weather description
        List<WebElement> weatherDescription = driver.findElements(By.cssSelector("div.city_fc_desc.fs0"));
        System.out.println(weatherDescription);
        //to print date and weather, loop through the array of element return
        for (int i = 0; i <= daysElement.size(); i++) {
            String day = daysElement.get(i).getText();
            String weather = weatherDescription.get(i).getText();

            System.out.println(day + ":" + weather);
        }
    }
}