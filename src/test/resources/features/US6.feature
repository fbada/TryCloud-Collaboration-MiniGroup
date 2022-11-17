Feature: As a user, I should be able to remove files from favorites and upload a file directly
  Story: As a user, I should be able to edit favorites files.
  #WAIITING ON MUSA for Favorites Logic
  Scenario Outline: Verify users to remove files to Favorites

    Given user on the login page
    When user types username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the "Files" module
    When the users click action-icon from any file on the page to remove
    And user choose the "Remove from favorites" option
    And user click the "Favorites" sub-module on the left side
    Then verify that the file is removed from the Favorites sub-module’s table

    Examples:
      | username | password    |
      | User4    | Userpass123 |
  #    | User34   | Userpass123 |
    #  | User64   | Userpass123 |
     # | User94   | Userpass123 |

  @US6
  Scenario Outline: verify users to upload a file from Files Given user on the dashboard page
    Given user on the login page
    When user types username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the "Files" module
    And user uploads file with the "Upload" file option
    Then verify the file is displayed on the page

    Examples:
      | username | password    |
      | User4    | Userpass123 |