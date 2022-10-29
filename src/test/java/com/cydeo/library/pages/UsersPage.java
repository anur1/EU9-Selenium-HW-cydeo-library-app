package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class UsersPage {

    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//thead/tr/th)[1]")
    public WebElement actions;

    @FindBy(xpath = "(//thead/tr/th)[2]")
    public WebElement user_ID;

    @FindBy(xpath = "(//thead/tr/th)[3]")
    public WebElement full_Name;

    @FindBy(xpath = "(//thead/tr/th)[4]")
    public WebElement email;

    @FindBy(xpath = "(//thead/tr/th)[5]")
    public WebElement group;

    @FindBy(xpath = "(//thead/tr/th)[6]")
    public WebElement status;

    public List<WebElement> getColumnTitles (List<WebElement> columnTitles){
        columnTitles.addAll(Arrays.asList(actions,user_ID,full_Name,email,group,status));
        return columnTitles;
    }


}//endclass

