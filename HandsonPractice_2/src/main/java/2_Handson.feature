

Feature: SauceDemo.com purchasing verification
  

  
  Scenario Outline: User is ableto login or not
    Given U is in login page
    When U enters <usrnm1> and <pswd1>
    And click on login
    Then U is able to login

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
