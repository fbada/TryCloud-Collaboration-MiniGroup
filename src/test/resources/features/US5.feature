@US5
Feature: As a user, I should be able to access to Files module.

  Scenario Outline: Verify users to add files to Favorites

    Given user is on the login page
    When user enters "<username>" and "<password>"
    When user click the login button
    When the user clicks the "Files" module
    When the user clicks action-icon from any file on the page
    And user choose the "Add to favorites" option
    And user click the "Favorites" sub-module on the left side
    Then Verify the chosen file is listed on the table

    Examples:
      | username    | password    |
      | user94       | Userpass123 |