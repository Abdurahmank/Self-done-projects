@smoketest
Feature: feature to test login functionality

  Scenario: check login is sucessful
    
    Given user is on login page
    When enters login name and pswd
    And Clicks on login button
    Then user is navigated to home page

