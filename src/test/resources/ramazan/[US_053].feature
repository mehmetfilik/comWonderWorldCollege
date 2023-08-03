@ss
Feature: [US_053] As a user, I should be able to log into the Parent Panel with a username and password.

  Background:
    Given User is on the Login page

  @[US_053_TC_001_TC_002_TC_003_TC_004]
  Scenario:[TC_001-->US_053] User should see the username and password forms on the login page.
    Then User should see the username and password fields in the form
    And User should be able to enter username and password in the respective fields
    And User should see the login-submit button in the Login form
    And User quit browser

  @[US_053_TC_005_TC_007]
  Scenario: [TC_005-->US-053] If the username and password combination is incorrect, the user should receive an error message indicating that the credentials are invalid.
    And Enter incorrect username and password and click on the submit button.
    Then Then User should see the error message The username or password incorrect on the Login page
    And User quit browser

  @[US_053_TC_006]
  Scenario: [TC_006-->US_053] If a user forgets the password, they should be redirected to the "Forgot Password" page.
    And User clicks on the Forgot password link on the login page.
    Then Verify that the user is redirected to the Forgot Password page.
    And User quit browser

  @[US_053_TC_008]
  Scenario: [TC_008-->US_053] The user should be able to log into the system with the correct username and password.
    And Enter the correct username and password, then click on the Sign In button.
    Then Verify that the user has successfully logged in.
    And User quit browser


