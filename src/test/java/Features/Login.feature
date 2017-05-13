Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for login
      | Username | Password      |
      | admin    | adminPassword |
    And I click login button
    Then I should see the userform page