Feature:[US_045] User information change test

  Background:
    Given user goes to "wonderUrl"
    Then Click the login button.
    And The user enters the valid values in the username and password box on the left
    And clicks the "Sign In" button.
    And User clicks on profile image
    Then User clicks Change Password on Profile Image.
    And the user clicks the Change Username tab


  Scenario:[TC_001->US_045] When changing the username, the user should not be able to choose a username with less than 5 characters.

    And User enters new username with less than 5 characters.
    And User clicks the save button
    Then "username must contain a minimum of 5 characters." Verifies that the text appears.
    And The user closes the page

  @us045
  Scenario: If the user has entered a new user with the correct combination, the username should change successfully.
    Given The user enters the new username with the correct combination.
    And User clicks the save button
    Then Username has been changed successfully. Verifies that the text is visible.
    And The user closes the page
