Feature: saucedemo.com Login verification

  Scenario Outline: check login with valid credentials
    Given user is on login page
    When user enters valid <usrnm1> and <pswd1>
    And clicks on login button
    Then user is navigated to home page

    Examples:
      | usrnm1        | pswd1        |
      | standard_user | secret_sauce |

  Scenario Outline: check login with invalid credentials
    Given user is on login page
    When user enters invalid <usrnm2> and <pswd2>
    And clicks on login button
    Then error message displayed
    
     Examples:
      | usrnm2        | pswd2        |
      | standard| secret |

  Scenario: Test1
    Given Test1
    When Test1
    And Test1
    Then Test1
