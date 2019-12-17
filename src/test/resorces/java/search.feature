
Feature: search in test me app

  
  Scenario: search item
    Given user should be in login page
    When user enters valid credintials
    And clicks the search tab & enters the first 4 characters
    And select product from the dropdown list
    And click on find details
    And add the product
    Then check oout page