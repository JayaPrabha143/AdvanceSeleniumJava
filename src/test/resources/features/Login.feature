Feature: login User

  Scenario: user is able to login with valid credentials

    Given user enters valid username field in email field
    And user enters valid password in password field
    When user clicks on the login button
    Then user is logged in successfully in to Application

  Scenario: user is not able to login with invalid credentials

    Given user enters invalid username field in email field
    And User enters invalid password in password field
    When user clicks on the login button
    Then user is not logged into the application

