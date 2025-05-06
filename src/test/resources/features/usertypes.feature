Feature: test for various types of user

  Scenario: user tries to login as locked user

    Given user open website
    Then verify user is on login page
    When user login username "locked_out_user" and password "secret_sauce"
    Then verify error message is shown

