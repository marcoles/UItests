Feature: Adding a product to the cart

  Scenario: Searching for a PS5 and adding it to the cart
    Given User is on the home page 'https://allegro.pl/'
    And has cookies accepted
    When User searches for a PS5
    And selects one of the listed products
    And adds the product to the cart
    Then the product should be in the cart