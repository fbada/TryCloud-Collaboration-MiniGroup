@US8

Feature: As a user, I should be able to access to Files module.



  Scenario Outline: Verify users delete a file/folder

    Given user is on the login page

    When  user enters "<username>" and "<password>"

    When  the user clicks the "Files" module

    And   user click action-icon from any file on the page

    And   user choose the "Delete f" option

    When  the user clicks the "Deleted files" sub-module on the left side

    Then  Verify the deleted file is displayed on the page.

    Examples:
      | username | password    |
      | user2   | Userpass123 |