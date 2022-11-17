@US14
Feature: As a user, I should be able to search any item/ users from the homepage.
  Story: As a user, I should be able to search any item/ users from the homepage.
  #prereq -> file/folder/user MUST EXIST

  Scenario Outline: Verify users can search any files/folder/users from the search box.
    Given user on the login page
    When user types username "<username>" and password "<password>"
    And user click the login button
    When the user clicks the magnifier icon on the right top
    And users search any existing "<search>"
    Then verify the app displays the expected result "<search>"

    Examples:
      | username | password    | search  |
      | User64   | Userpass123 | User34  |
  #    | User4    | Userpass123 | Jenkins |
