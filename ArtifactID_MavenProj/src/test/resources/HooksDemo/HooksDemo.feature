Feature: check login fumctionality
																								*as we are given @smoke tag for both scenarios the step definition with same tag willrun for both scenarios

@smoke																										
  Scenario: 
    Given User is on login page
    When User enters valid username and password
    And Clicks on login button
    Then User is navigated to Home page

 @smoke   
  Scenario: 
    Given User is on login page
    When User enters valid username and password
    And Clicks on login button
    Then User is navigated to Home page