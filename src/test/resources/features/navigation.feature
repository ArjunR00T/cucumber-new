Feature: Product Navigation and Sorting

  Background:
    Given user open website
    Then verify user is on login page
    When user login username "standard_user" and password "secret_sauce"
    Then verify user is on home page

  Scenario: Sort products by price (low to high)
    When the user sorts products by "Price (low to high)"
    Then the product list should be sorted in ascending price order

  Scenario: Sort products by name (Z to A)
    When the user sorts products by "Name (Z to A)"
    Then the product list should be sorted in descending alphabetical order

  Scenario: View product details
    When the user clicks on first item
    Then the product detail page should be displayed

  Scenario: Navigation back to inventory from detail
    Given the user clicks on first item
    Then the product detail page should be displayed
    When the user clicks the back button
    Then verify user is on home page
