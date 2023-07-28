Feature: [US_016] As a registered user (student/parent), I want to have access to the login page from the homepage so that I can log in to my personal panel.

  @test
  Scenario: [TC_001-->US_016] Homepage Login Button Redirection

    Then User Should Navigate to homepage
    Then Verify and Click on the Login Button on the Homepage
    When Verification of User Redirection to the User Login Page upon Clicking the Login Button
    Then Close the browser

  @test
  Scenario: [TC_002-->US_016] User Login Verification on the 'userlogin' Page

    Then User Should Navigate to homepage
    Then Verify and Click on the Login Button on the Homepage
    And User Logs in with "validFilikEmail" and "validFilikPassword"
    Then Close the browser

  @test
  Scenario: [TC_003-->US_016] User Login Validation for Incorrect, Missing, and Unregistered Information on the 'userlogin' Page
    Then User Should Navigate to homepage
    Then Verify and Click on the Login Button on the Homepage
    And User Logs in with "invalidFilikEmail" and "invalidFilikPassword"
    Then Close the browser

  @test
  Scenario: [TC_004-->US_016] Password Reset Functionality on 'userlogin' and 'ufpassword' Pages
    Then User Should Navigate to homepage
    Then Verify and Click on the Login Button on the Homepage
    And Verify and Click on the Forgot Password Button on the User Login Page
    And Verify Password Reset Functionality on the Forgot Password Page
    Then Close the browser

  @test
  Scenario: [TC_005-->US_016] Navigation Links Verification on 'ufpassword' and 'userlogin' Pages

    Given Verify and Click on the Front Site Button on the User Login Page
    Then Close the browser

