@cip
Feature: As a user, I want to access and modify the "Apply Leave" page and view leave details in the Student Panel after logging in.

  Background:

    Given User goes to Login page
    And Click on the Student Login button
    And Enter the username and password, then click on the Sign In button.
    And Click on the Apply Leave link in the sidebar.


  @[US_049_TC_001]
  Scenario:[TC_001-->US_049] Verify Visibility of Leave List Header Text and Column Fields for the User.
    Then Verify that the Leave List header is visible on the opened page.
    And User quit browser

  @[US_049_TC_002]
  Scenario: [TC_002-->US_049] Verify Visibility of Column Fields in the "Leave List" Page for the User.
    Then Verify that the Class, Section, Apply Date, From Date, To Date, Reason, Status, and Action columns are visible on the opened page.
    And User quit browser
  @[US_049_TC_003]
  Scenario: [TC_003-->US_049] User should be able to access and update a pending leave detail page from the "Action" section.
    And Click on the Edit button under the Action section on the opened page.
    And Make updates in the textbox below the Reason in the opened window, then click on the Save button.
    Then Verify that the Record Saved Successfully alert message is visible.
    And User quit browser

  @[US_049_TC_004]
  Scenario: [TC_004-->US_049] User should be able to delete a leave from the "Action" section and view the "successfully deleted" message.
    And Click on the Delete button under the Action section on the opened page.
    And Click on the OK button in the opened alert.
    Then Verify that the message Successfully Deleted is visible.
    And User quit browser

  @[US_049_TC_005_TC_006]
  Scenario: [TC_005-->US_049] User should be able to add a new leave by clicking on the "Add" button and view the "successfully added" message.
    And Click on the Add button located at the top right corner.
    And Enter the required information in the opened window, then click on the Save button.
    Then Verify the Record Saved Successfully alert message and the added leave request in the Leave table.
    And User quit browser


