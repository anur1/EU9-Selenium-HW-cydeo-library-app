package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Login_StepDefinitions {

    //initializations
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage= new DashboardPage();
    UsersPage usersPage = new UsersPage();


    //stepdefinitions

    //task2, task3----------------------------------
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        //loginPage.usernameBox.sendKeys("student111@library");
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("studentUsername"));
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("studentPassword"));
    }


    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        loginPage.signInButton.click();
    }


    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("librarianUsername"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

        Thread.sleep(5000);
        //https://library1.cydeo.com/#dashboard
        //way1
        wait.until(ExpectedConditions.urlContains("dashboard"));
        //way2
        System.out.println("getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

        String expectedResult = "Test Librarian 1";
        Assert.assertEquals(expectedResult, dashboardPage.accountName.getText());
    }





    //task4--------------------------------
    @When("user enter username {string}")
    public void user_enter_username(String string) {
        loginPage.usernameBox.sendKeys(string);
    }
    @When("user enter password {string}")
    public void user_enter_password(String string) {
        loginPage.passwordBox.sendKeys(string);
    }

    @When("librarian enter username {string}")
    public void librarian_enter_username(String string) {
        loginPage.usernameBox.sendKeys(string);
    }
    @When("librarian enter password {string}")
    public void librarian_enter_password(String string) {
        loginPage.passwordBox.sendKeys(string);
    }


    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {
        loginPage.usernameBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);

    }
    @Then("user should see {int} users")
    public void user_should_see_users(Integer int1) {
        BrowserUtils.waitForVisibility(dashboardPage.userCount, 5);

        String expectedResult = "173";
        String actualResult = dashboardPage.userCount.getText();
        System.out.println("actualResult (__ users)= " + actualResult);

        Assert.assertEquals(expectedResult, actualResult);
    }



    //task5---------
    @When("user clicks on {string} link")
    public void user_clicks_on_link(String string) {
        dashboardPage.usersLink.click();
    }


    @Then("table should have the following column names:")
    public void table_should_have_the_following_column_names(List<String> expectedTitles) {

        List<WebElement> titles = new ArrayList<>();
        usersPage.getColumnTitles(titles);

        System.out.println("expectedTitles = " + expectedTitles);

        for (int i = 0; i < expectedTitles.size(); i++) {
            Assert.assertEquals(expectedTitles.get(i), titles.get(i).getText());

            System.out.println( i + " - titles.get(i).getText() = " + titles.get(i).getText());
        }



    }


    //task6-------------
    @When("user logins using {string} and {string}")
    public void user_logins_using_and(String string, String string2) {
        loginPage.usernameBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);
    }
    @Then("user should see his-her account name {string}")
    public void user_should_see_his_her_account_name(String string) throws InterruptedException {
        System.out.println("account name = " );
        Thread.sleep(1000);

        dashboardPage.profileNameDropdown.click();
        Thread.sleep(1000);

        dashboardPage.logoutButton.click();
        Thread.sleep(1000);

    }


}//endclass
