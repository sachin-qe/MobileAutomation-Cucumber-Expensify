Feature: Add an expense
  Scenario: Add an expense for any type
    Given user is at Dashboard screen
    When user clicks on Expense button
    And user types in necessary fields
    Then an expense entry should get created
    And the balance amount should get updated
