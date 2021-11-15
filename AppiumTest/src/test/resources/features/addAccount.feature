Feature: Add a new account
  Scenario: Add a new account for any type
    Given Dashboard screen is open
    When user clicks on Settings button
    And user clicks on Accounts option
    And user clicks on Add account
    And user types in account fields
    Then a new account type should get created
    And the created account type should get listed
