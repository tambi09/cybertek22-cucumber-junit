Feature: Google search functionality
  Agile Story: As a user, when I am on thw google search page, i should be able to search whatever I want, and see relevant information


  Scenario: Search page title verification
    Given User is on Google home page
    Then  User should see title is Google


  Scenario: User search title verification
    Given User is on Google home page
    When User searches for apple
    Then User should see apple in the title
