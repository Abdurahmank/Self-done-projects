Feature: search and place the order for product

@offersPage
  Scenario Outline: Search Experience for product search in both home and offers page
    Given User is on GreenCart Landing page
    When user searched with Shortname <name> and extracted actual name of product
    And user clicks on deals link and switching window 
    Then user searched for same short name <name> in offers page
    And Comparing both prodcuts are same

    Examples: 
      | name |
      | beet |
