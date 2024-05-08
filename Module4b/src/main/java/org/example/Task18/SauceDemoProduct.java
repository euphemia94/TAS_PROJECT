package org.example.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoProduct {

    WebDriver Sdriver= null;
    public SauceDemoProduct(WebDriver driver){
        //to help access all the webdriver we use this speciall class "pageFactory"
        PageFactory.initElements(Sdriver, this);

    }
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") //this is a value tied to the product below
    private WebElement product1;
    public WebElement getProduct1(){
        return product1;
    }
    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") //this is a value tied to the password below
    private WebElement product2;
    public WebElement getProduct2(){
        return product2;
    }
    @FindBy (xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]") //this is a value tied to the password below
    private WebElement cart;
    public WebElement goTocart(){
        return cart;
    }

}
