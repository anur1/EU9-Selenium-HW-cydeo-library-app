package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import io.cucumber.java.sl.In;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {//In this class we will store WebElements that are common to all pages (ie: common left pane)

    //STEP1:constructor
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }//endconstructor

    //every page contains a logout button
    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logoutButton;

}//endclass
