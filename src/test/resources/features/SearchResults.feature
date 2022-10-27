Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials
  to different accounts

  Background: Assuming   user is on the login page
    Given user is on the login page
    When user enters username "librarian1@library" and password "qU9mrvur"

  @task5
  Scenario: Login as librarian in the same line
    When user clicks on "Users" link
    Then table should have the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |