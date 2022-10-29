package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    //constructor
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //webelements
    @FindBy (xpath = "//span[.='Users']")
    public WebElement usersLink;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksLink;

    @FindBy(xpath = "//img[@id='user_avatar']")
    public WebElement profileNameDropdown;

    @FindBy(xpath = "//a[@class = 'dropdown-item']")
    public WebElement logoutButton;
    //a[@id='navbarDropdown']/span

    @FindBy (xpath = "//a[@id='navbarDropdown']/span")
    public WebElement accountName;
    //a[@id='navbarDropdown']/span
    //a/img/following-sibling::span

    @FindBy (xpath = "//h2[@id='user_count']")
    public WebElement userCount;


    /*


    @FindBy
    public WebElement bookCount;



    @FindBy
    public WebElement dashboardLink;
     */



}//endclass
