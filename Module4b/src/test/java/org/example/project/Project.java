package org.example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Project {
    public static void main(String[] args) throws InterruptedException {
        //Visit https://www.automationexercise.com/
        //Sign up as a new user by creating an account. Fill/select all the options on the 'Enter Account Information' page. That is both mandatory and optional , including the radio button for title and checkboxes.
        //Assert that your account was successfully created and then continue
        //Go to the products section of the site and purchase any top of your choice from under the women's section
        //Add the top to the cart and assert that the item has been successfully added to the cart.
        //Go to the 'cart' section and proceed to checkout
        //Fill the checkout information and complete your order
        //@channel
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://www.automationexercise.com/");
        //is advisible to introduce wait as seen below //input[@id='login-button']
        //signing up as new user
        Thread.sleep(3000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
        //fill user input: name and email
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")).sendKeys("euphemia");
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")).sendKeys("euphemiauc94@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        //select days, month, nd year
        WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
        days.click();
        Select select = new Select(days);
        select.selectByIndex(22);
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
        month.click();
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(2);
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
        month.click();
        Select selectYear = new Select(year);
        selectYear.selectByValue("1994");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        //fill address information form
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Euphemia");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Nnaemeka ");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Testify academy");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("testify ltd");
        WebElement country = driver.findElement(By.xpath("//select[@id='days']"));
        country.click();
        Select select1 = new Select(country);
        select1.selectByVisibleText("Canada");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Lagos");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("lagos city");
        driver.findElement(By.xpath(" //input[@id='zipcode']")).sendKeys("800111");
        driver.findElement(By.xpath(" //input[@id='mobile_number']")).sendKeys("07069029696");
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "ACCOUNT CREATED!");
        //go to product and purchase top











    }
}
