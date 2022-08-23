@tag
Feature: Application Login
  I want to use this template for my feature file

  @sanity
  Scenario: User is able to ogin with valid credentials
    Given User is on Netbanking landing page
    When user logs in with "usrnm" and "pswd"
    Then Home page is populated
    And cards are displyed as "true"

  @smoke
  Scenario: User is able to ogin with valid credentials
    Given User is on Netbanking landing page
    When user signup with following details
      | jenny | pswd | 95abdurahman@gmail.com | India | 7896458596 |
    Then Home page is populated
    And cards are displyed as "false"

