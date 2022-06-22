Feature: Check home page functionality

  Background: user is logged in
    Given user is loginpage
    When enters username and paswd
    And click login
    Then navigated to home page

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When user clicks on dashboard link
    Then quick launch toolar is displayed
