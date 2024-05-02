package org.example.Task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task15 {
    WebDriver driver;
    //Structure your TestNG file to run Naviagte to google and search for testify.
    //close the browser
    //Naviagate to https://www.mcdonalds.com/us/en-us.html . print out the colour - code of the order now button.
    // All test should be done in one class and utilize your knowldge of tesNG annotation)
   @BeforeClass
   public void beforeClass(){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
       //executable property of the chrome driver
       //lunch browser
       driver = new ChromeDriver();
       //to maximize the page
       driver.manage().window().maximize();
   }
   @Test
   public void googleNav() {
       //to navigate to google, search for testify ltd
       driver.get("https://www.google.com/");
       driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
       driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/*[1]")).click();

   }
   @Test
    public void mcDonald() {
        //to navigate to McDonald, search for testify ltd
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        //to print out colour on the order now button
        WebElement orderNowBtn =  driver.findElement(By.xpath("//a[@id='button-ordernow-mobile']"));
       // Print out the color code
       String buttonColor = orderNowBtn.getCssValue("background-color");
        System.out.println("Color code of the Order Now button: " + buttonColor);

    }
    @AfterClass
    public void close() {
        driver.quit();

    }
}
