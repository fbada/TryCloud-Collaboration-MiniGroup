@US4
Feature: As a user, I should be able to access to Files module.

  @smoketest
  Scenario Outline: verify users can access to Files module
    Given user on the login page
    When user types username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud"

    Examples:
      | username    | password    |
      | user34       | Userpass123 |


  @smoketest
  Scenario Outline: verify users can access to Files module
    Given user on the login page
    When user types username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected

    Examples:
      | username    | password    |
      | user4       | Userpass123 |
