package org.example.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCart {

    WebDriver Sdriver= null;
    public SauceDemoCart(WebDriver driver){
        //to help access all the webdriver we use this speciall class "pageFactory"
        PageFactory.initElements(Sdriver, this);

    }
    @FindBy (xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]") //this is a value tied to the password below
    private WebElement cart;
    public WebElement goTocart(){
        return cart;
    }



}
