Feature: Parameters at work

  Scenario: String Parameters
    Given I am on the "login" page
    When I enter "admin" and password "admin"
    And I can call row 4 column 3.0 data
    And I click login
    Then I should be navigated to homepage

  Scenario: Data Provider
    Given I am on the "apply" page
    When I enter the following data
      | Info 1 | Info 2 | Info 3  |
      | name   | DOB    | address |
