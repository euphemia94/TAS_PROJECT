package org.example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        Thread.sleep(5000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
        //fill user input:name
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")).sendKeys("euphemia");
        Thread.sleep(5000);
        //fill email
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")).sendKeys("euphemiauc94@gmail.com");
        Thread.sleep(5000);
        //sign in //input[@id='id_gender2']
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();



    }
}
