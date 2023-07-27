Feature: [US_016] As a registered user (student/parent), I want to have access to the login page from the homepage so that I can log in to my personal panel.
  @test
  Scenario: [TC_001-->US_016] Homepage Login Button Redirection

    Then User Should Navigate to the "userLoginUrl"
    Then Verification of Visibility of the Login Button on the Homepage
    When Verification of User Redirection to the "userlogin" Page upon Clicking the Login Button