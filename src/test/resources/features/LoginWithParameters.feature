Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials
  to different accounts

  Background: Assuming   user is on the login page
    Given user is on the login page

  @task4
  Scenario: Login as librarian in the same line
    When user enters username "librarian1@library" and password "qU9mrvur"
    Then user should see the dashboard
    And there should be 23 'users'
    #number can be what ever  you have there
