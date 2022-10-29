Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials
  to different accounts

  Background: Assuming   user is on the login page
    Given user is on the login page
    When user enters username "librarian1@library" and password "rs4BNN9G"
    And user clicks sign in button


  @task5
  Scenario: Verify table name of columns is correct
    When user clicks on "Users" link
    Then table should have the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |