#Author Roopali Adagale
@sanity
Feature: Validate and Verify Product
  As a User
  I want to add product in to cart
  So that the verify product quantity and check total price

  Scenario Outline: Validate and Verify product and price
    Given I am already on "<Header>" application Home screen
    When I navigate to Screen Shop
    And I buy Stuffed Frog in to cart
    And I buy Fluppy Bunny in to cart
    And I buy Valentine Bear in to cart
    And I click on cart
    Then I assert Check out button is presented on cart
    When I set Stuffed Frog "<quantity>" quantity
    Then I assert sub total for Stuffed Frog is presented on cart
    And I set Fluppy Bunny "<bunnyquantity>" quantity
    Then I assert sub total for Fluppy Bunny is presented on cart
    And I set Valentine Bear "<bearquantity>" quantity
    Then I assert sub total for Valentine Bear is presented on cart
    And I assert price for Stuffed Frog
    And I assert price for  Fluffy Bunny
    And I assert price for Valentine Bear


    Examples:
      | Header       | quantity | bunnyquantity | bearquantity |
      | Jupiter Toys | 2        | 5             | 3            |