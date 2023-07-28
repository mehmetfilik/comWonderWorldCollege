Feature: [US_016] As a registered user (student/parent), I want to have access to the login page from the homepage so that I can log in to my personal panel.

  @test
  Scenario: [TC_001-->US_016] Homepage Login Button Redirection

    Then User Should Navigate to the "userLoginUrl"
    Then Verification of "User Login" Window and "What's New In Wonder World College" Information on User Login Page
    Then Verification of Visibility of the Login Button on the Homepage
    When Verification of User Redirection to the "userlogin" Page upon Clicking the Login Button


  Scenario: [TC_002-->US_016] Verification of Login Window and 'What's New In Wonder World College' Information on User Login Page


  Scenario: [TC_003-->US_016] User Login Verification on the 'userlogin' Page


  Scenario: [TC_004-->US_016] User Login Validation for Incorrect, Missing, and Unregistered Information on the 'userlogin' Page


  Scenario: [TC_005-->US_016] Password Reset Functionality on 'userlogin' and 'ufpassword' Pages


  Scenario: [TC_006-->US_016] Navigation Links Verification on 'ufpassword' and 'userlogin' Pages


