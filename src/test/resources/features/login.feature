Feature: User Login Functionality

  Background:
    Given user open website
    Then verify user is on login page

  Scenario Outline: Login with valid credentials
    When user login username "standard_user" and password "secret_sauce"
    Then verify user is on home page

    Examples:
      | username         | password
      | standard_user    | secret_sauce

  Scenario Outline: Login with in-valid credentials
    When user login username "standard_user" and password "standard_user"
    Then verify error message is shown

    Examples:
      | username         | password
      | standard_user_invalid    | secret_sauce

  Scenario: Access inventory without login
    When user open inventory page
    Then verify user is on login page
