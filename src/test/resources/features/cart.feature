Feature: Shopping Cart Functionality

  Background:
    Given user open website
    Then verify user is on login page
    When user login username "standard_user" and password "secret_sauce"
    Then verify user is on home page

  Scenario: Add single item to cart
    When user click on add to cart button of the first item
    Then verify cart icon displays quantity one

  Scenario: Remove item from cart
    When user click on add to cart button of the first item
    Then verify cart icon displays quantity one
    When user click on cart icon
    Then verify user is on cart page
    When user click on remove item
    Then verify cart is empty

  Scenario: Add multiple items to cart
    When the user adds multiple items to the cart
    Then the cart should contain 2 items

  Scenario: View cart contents with multiple items
    When the user adds multiple items to the cart
    When user click on cart icon
    Then verify cart contain multiple item

  Scenario: Reset app state
    When user click on add to cart button of the first item
    Then verify cart icon displays quantity one
    When user click on hamburger button
    Then user click on reset button
    And verify cart icon displays quantity one
