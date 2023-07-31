Feature:[US_045] User information change test

  @us045
  Scenario: When changing the username, the user should not be able to choose a username with less than 5 characters.
    Given user goes to "wonderUrl"
    Then Click the login button.
    And The user enters the valid values in the username and password box on the left
    And clicks the "Sign In" button.
    And User clicks on profile image
    Then User clicks Change Password on Profile Image.
    And the user clicks the Change Username tab
    And User enters new username with less than 5 characters.
    And User clicks the save button
    Then "username must contain a minimum of 5 characters." Verifies that the text appears.