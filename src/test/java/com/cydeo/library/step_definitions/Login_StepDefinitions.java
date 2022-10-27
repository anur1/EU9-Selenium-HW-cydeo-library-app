package com.cydeo.library.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");

    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }




    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user enters student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("user enters username {string} and password {string}");

    }
    @Then("there should be {int} {string}")
    public void there_should_be(Integer int1, String string) {
        System.out.println("there should be {int} {string}");
    }



    @When("user clicks on {string} link")
    public void user_clicks_on_link(String string) {
        System.out.println("user clicks on {string} link");

    }
    @Then("table should have the following column names:")
    public void table_should_have_the_following_column_names(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("table should have the following column names:" +
                " Actions \n" +
                " UserID \n" +
                " Full Name \n" +
                " Email \n" +
                " Group \n" +
                " Status");
    }



}//endclass
