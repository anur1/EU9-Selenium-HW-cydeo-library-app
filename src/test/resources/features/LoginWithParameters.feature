Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials
  to different accounts

  Background: Assuming   user is on the login page
    Given user is on the login page

  @task4  #signin as librarian
  Scenario: Login as librarian in the same line
    When user enters username "librarian1@library" and password "rs4BNN9G"
    And user clicks sign in button
    Then user should see the dashboard
    And user should see 173 users
    #number can be what ever  you have there

  @task4_0
  #task4-a signin as student
  Scenario: User should be able to login with valid credentials as a student
    When user enter username "student13@library"
    And user enter password "rgZJqF9N"
    And user clicks sign in button
    Then user should see the dashboard

  @task4_1
  #signin as librarian
  Scenario: User should be able to login with valid credentials as a librarian
    When librarian enter username "librarian15@library"
    And librarian enter password "czIccsem"
    And user clicks sign in button
    Then user should see the dashboard


