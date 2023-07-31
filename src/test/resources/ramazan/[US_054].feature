Feature: As a user, I should be able to change my password from the Parent page  When entering the Parent Panel

  Background:
    Given User logs in to the parent panel
    And Click on the profile photo in the top right corner.
    And User should see the Change Password link is visible in the menu.
    And Click on the Change Password link.

  @[US_054_TC_001]
  Scenario: User should be able to access Change Password link and be redirected to the relevant page upon clicking.
    Then Verify that the password change page is displayed.

    @[US_054_TC_002]
    Scenario: User should receive an error message when entering a password that does not meet the criteria. (Min 6 characters, at least 1 uppercase letter, and 1 special character)
      And The user enters a new password that is less than 6 characters long.
      And The user enters a new password without any uppercase letters or special characters.
      Then Verify that the user encounters an error message indicating the inability to change the password.



  @[US_054_TC_003]
    Scenario: [TC_003-->US_054] User should be able to successfully change the password when meeting the criteria. (Min 6 characters, at least 1 uppercase letter, and 1 special character)
      And The user enters a new password that is at least 6 characters long and contains at least one uppercase letter and one special character.
      Then Verify that the user encounters the message Password has been changed successfully.

