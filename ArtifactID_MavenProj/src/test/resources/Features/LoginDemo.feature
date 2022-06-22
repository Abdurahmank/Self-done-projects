@Demo
Feature: Login verification

  Scenario Outline: User is able to login with valid credentials
    Given User opens the brosweser
    And User navigates to the site
    When User enters <username> and <password>
    And Clicks on Login button
    Then User is abele to login to Home page

    Examples: 
      | username | password |
      | rahman   |    12345 |
      | shalu    |    12345 |
