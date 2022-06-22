@GoogleSearch
#This is a Feature file
Feature: Feature to test Google search functionality

  Scenario: Validate Google Search is working
    Given browser is open
    And User is on search page
    When User enters a text in the sarch box
    And Hits enter
    Then User is navigated to the search results
