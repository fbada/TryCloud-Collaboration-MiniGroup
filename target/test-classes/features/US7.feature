Feature: As a user, I should be able to remove files from the favorites and upload a file directly
Story: As a user, I should be able to manage folders.
@US7
 Scenario Outline: Verify users can add the folder

   Given user on the login page
   When user types username "<username>" and password "<password>"
   And user click the login button
   When the user clicks the "Files" module
    And user clicks on "New folder" option
    And user write a folder name
    When the user click submit icon
    Then Verify the folder is displayed on the page

   Examples:
     | username | password    |
     | User4    | Userpass123 |

  @smoketest
  Scenario Outline: Scenario: Verify users can upload a file inside a folder

    Given user on the login page
    When user types username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the "Files" module
    When user choose a folder from the page
    And user uploads file with the "Upload" file option
    Then verify the file is displayed on the page

    Examples:
      | username | password    |
      | User94    | Userpass123 |