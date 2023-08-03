Feature: [US_44] As a user, I should be able to change my password from the student page When entering the Student Panel


  Scenario: [TC_001-->US_44] User can access "Change Password" button from Profile Picture.
  Access the page by clicking the "Change Password" button


    When The user navigates to the "adminLoginUrl" page
    Then Click the studend login buttonn
    Then User should be able to access Profile Image button
    Then User accesses change password button
    Then User clicks change password button



  Scenario: [TC_002-->US_44]

    When The user navigates to the "adminLoginUrl" page
    Then Click the studend login buttonn
    Then User should be able to access Profile Image button
    Then User clicks change password button
    Then User enters new password with at least six characters


  Scenario: [TC_003-->US_44] The user's new password must contain at least one uppercase letter and one special character.
    When The user navigates to the "adminLoginUrl" page
    Then Click the studend login buttonn
    Then User should be able to access Profile Image button
    Then User clicks change password button
    Then User incorrectly enters new password with at least six characters
    And User receives message on incorrect password entries


  Scenario: [TC_004-->US_44] When the user enters the correct password, "password has been changed successfully

    When The user navigates to the "adminLoginUrl" page
    Then Click the studend login buttonn
    Then User should be able to access Profile Image button
    Then User clicks change password button
    Then User enters new password with at least six characters
    And User receives message on incorrect password entries


  Scenario: [TC_005-->US_44] The password is invalid." when the user enters wrong password combinations. receives your message

  Scenario: [TC_006-->US_44] Password changed successfully." when user enters correct password combinations.


