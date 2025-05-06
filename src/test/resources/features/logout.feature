Feature: User Logout

  Scenario: Logout functionality
    Given user open website
    Then verify user is on login page
    When user login username "standard_user" and password "secret_sauce"
    Then verify user is on home page
    When user click on hamburger button
    Then user click on logout button
    And verify user is on login page
