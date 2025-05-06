Feature: Checkout Process

  Background:
    Given user open website
    Then verify user is on login page
    When user login username "standard_user" and password "secret_sauce"
    Then verify user is on home page

  Scenario: Checkout - information step
    When user click on add to cart button of the first item
    Then user click on cart icon
    And verify user is on cart page
    When user click on checkout button
    And user fill all checkout details
    Then click on Continue button
    And verify user is on review page

  Scenario: Checkout - overview step
    When user click on add to cart button of the first item
    Then verify cart icon displays quantity one
    When user click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fill all checkout details
    And click on Continue button
    Then verify user is on review page

  Scenario: Checkout - completion
    When user click on add to cart button of the first item
    Then verify cart icon displays quantity one
    When user click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fill all checkout details
    And click on Continue button
    Then verify user is on review page
    When user click on Finish button
    Then verify user is on order confirmation page

  Scenario: Attempt checkout with empty cart
    When user click on cart icon
    Then user click on checkout button
    And verify user is not on checkout page
