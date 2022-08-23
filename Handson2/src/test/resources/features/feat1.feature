Feature: test1

  Scenario Outline: Test 2
    Given U open browser
    When U enters <pas> and <usnm>
    And U click on login button
    Then u is in hom

    Examples: |pas|usnm|
      | standard_user | secret_sauce |
 