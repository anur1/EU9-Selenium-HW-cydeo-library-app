package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //constructor
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //webelements
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[. = 'Sign in']")
    public WebElement signInButton;




}//endclass
