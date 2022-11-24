@US2 @smoketest
Feature: As a user, I should be able to log in.

  Scenario Outline: Verify user login fail with invalid credentials
    Given user on the login page
    When user types invalid username "<username>" and password "<password>"
    And user click the login button
    Then verify "<message>" message should be displayed

    Examples:
      | username  | password | message                     |
      | UserWrong | Wrong    | Wrong username or password. |