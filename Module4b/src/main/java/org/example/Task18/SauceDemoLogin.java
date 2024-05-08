package org.example.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLogin {
    WebDriver Sdriver= null;
    public SauceDemoLogin(WebDriver driver){
        //to help access all the webdriver we use this speciall class "pageFactory"
        PageFactory.initElements(Sdriver, this);

    }
    @FindBy (xpath = "//input[@id='user-name']") //this is a value tied to the username below
    private WebElement username;
    public WebElement getUsername(){
        return username;
    }
    @FindBy (xpath = "//input[@id='password']") //this is a value tied to the password below
    private WebElement password;
    public WebElement getPassword(){
        return password;
    }
    @FindBy (xpath = "//input[@id='login-button']") //this is a value tied to the login below
    private WebElement loginbtn;
    public WebElement getLoginbtn(){
        return loginbtn;
    }
}
