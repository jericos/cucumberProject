Feature: LoginFeature
  This feature deals with the login functionality of the application

  @regression
  Scenario: Login with correct username and password
    Given I navigate to the login page
 #   And I enter the users email address as Email:admin@
 #   And I verify the count of my salary digits for Rs 1000
 #   And I just need to see how step looks for Cucumber-Java8
    And I enter the following for login
      | Username | Password      |
      | admin    | adminPassword |
    And I click login button
    Then I should see the userform page

  @sanity
#  Scenario Outline: Login with correct username and password using Scenario Outline
#    Given I navigate to the login page
#    And I enter <Username> and <Password>
#    And I click login button
#    Then I should see the userform page
#    Examples:
#      | Username | Password      |
#      | admin    | adminPassword |
#      | execute    | automation |
#      | testing    | qa |