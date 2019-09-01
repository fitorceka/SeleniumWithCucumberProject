Feature: SignIn Feature

  Scenario: Check table and signin
    Given Navigate to the main address
    #Then I check if we see the following
      #| Home | Interactions | Widgets | Tooltip and Double click |
    And I click on the button Widgets
    And I click on the Html contact form
    And I enter the following information
      | Fitor | Çeka | Albania | I am 23 years old |
    And I click on the submit button
    Then I check for the displayed message