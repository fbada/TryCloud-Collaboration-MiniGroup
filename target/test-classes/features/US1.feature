@US1 @smoketest
Feature: As a user, I should be able to log in.

  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user types username "<username>" and password "<password>"
    And user click the login button
    Then verify the user should be at the dashboard
    Examples:
      | username | password    |
      | user64   | Userpass123 |
     # | user4    | Userpass123 |