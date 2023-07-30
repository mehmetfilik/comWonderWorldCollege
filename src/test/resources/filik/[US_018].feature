
Feature: [US_018] As an administrator (admin), I want an admin panel to be available for performing administrative tasks, and I want to be able to log in to the admin panel with registered email and password.

  Background:
    Given Navigate to adminLoginUrl page
    Then Click on the Admin Login Button

  @test1
  Scenario: [TC_001-->US_018] Verification of Accessible URL for School Panels

    When Verification of User Redirection to the Admin Login Page upon Clicking the Login Button
    Then Close the browser
  @test1
  Scenario: [TC_002-->US_018] Verification of Email TextBox and Submit Button on "Forgot Password" Page

    And Admin Logs in with "validFilikAdminEmail" and "validFilikAdminPassword"
    And verify Admin Dashboard Page
    Then Close the browser
  @test1
  Scenario: [TC_003-->US_018] Redirecting to 'sitelogin' Page from 'Forgot Password' Page

    And Admin Logs in with "invalidFilikAdminEmail" and "invalidFilikAdminPassword"
    Then Close the browser

  @test1
  Scenario: [TC_004-->US_018] Verification of Returning to the Front Site (Homepage) Link on 'sitelogin' Page and Verification of Access to the Relevant Panel After Entering Registered Email and Password on 'sitelogin' Page

    And Verify and Click on the Forgot Password Button on the Admin Login Page
    And Verify Password Reset Functionality on the Admin Forgot Password Page
    Then Close the browser
  @test1
  Scenario: [TC_005-->US_018] Verification of No Access to the Panel with Unregistered Email and Password on 'sitelogin' Page

    Given Verify and Click on the Front Site Button on the User Login Page
    Then Close the browser




