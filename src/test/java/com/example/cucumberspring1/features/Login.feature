Feature: Login Feature
  Background : This feature deal with the login functionality of the application

  Scenario: Login with correct username and password
    Given I click login Home Page
    And I enter the following for Login
      | username | password |
      | admin    | password |
    And I click login button
    Then I should see the userform page

#  Scenario: Login with correct username and password 2
#    Given I click login Home Page
#    And I enter the following for Login
#      | username | password |
#      | admin    | password |
#    And I click login button
#    Then I should see the userform page