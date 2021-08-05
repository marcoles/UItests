Feature: Adding a product to the cart

  Scenario: Searching for a PS5 and adding it to the cart
    Given User is on the home page 'https://allegro.pl/'
    And has cookies accepted
    When User searches for a "PS5"
    And selects the first product with "PlayStation 5" in its name
    And adds that product to the cart
    Then the "PlayStation 5" should be in the cart