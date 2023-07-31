Feature:Admin (Teacher) - Prepare & Assign Homework

  Background:

    Given User goes to wonderUrl page
    Then Click on the Teacher Login Button.
    And Enter the username and password, then click on the "Sign In" button.
    And clicks on the Homework page link in the sidebar
    And clicks on the Add Homework page link

    @Test1
    Scenario: [TC_001-->US-039] Verify "Add Homework" Link in Teacher Panel
    Then the teacher should be redirected to the Add Homework page successfully

    @Test2
    Scenario: [TC_002-->US-039] Verify 'Select Criteria' Section Elements on Homework Page
    Then Verify that Class, Section, Subject Group,Subject Dropdown menus and Search button are visible and enabled.

    @Test3
    Scenario: [TC_003-->US-039] Verify Homework List Display with Selected Criteria and Columns.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Verify that the Homework List is visible in the opened menu.
      And Click on the Evaluation icon under the Action heading.
      Then Verify that the Evaluate Homework page is opened.

    @Test4
    Scenario: [TC_004-->US-039] Verify Homework Summary Display and Saving Note in "Evaluate Homework" Window for the Teacher.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Click on the Evaluation icon under the Action heading.
      And Verify that the Summary text is visible in the Evaluate Homework window.
      And Write a note in the textbox below the message and click on the Save button.
      Then Verify that the Homework Evaluation Completed Successfully. alert message is visible.

    @Test5
    Scenario: [TC_005-->US_039]Verify Editing and Saving Homework in "Edit Homework" Window from the Edit Icon under Homework List.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Click on the Edit icon under the Action heading.
      And Write your message in the text box under Description and click on the Save button.
      Then Verify that the Record Saved Successfully alert message is visible.

    @Test6
    Scenario: [TC_006-->US_039] Verify Homework Deletion from the Delete Icon under Homework List.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Click on the delete icon under the Action heading.
      And Click on the OK button in the opened alert.
      Then Verify that the message No data available in the table is displayed in the Homework List.

   @Test7
   Scenario: [TC_007-->US-039] Verify Add Homework Functionality and Data Entry on "Add Homework" Window.
     And Add button should be visible and enable.
     And Fill in the mandatory fields on the Add Homework window and click on the Save button.
     Then Verify that the Record Saved Successfully alert message is visible.

   @Test8
   Scenario: [TC_008-->US-039] Verify Display of Two Separate Lists - Upcoming Homework and Closed Homework in Homework List.
     Then Verify that there are two separate lists, Upcoming Homework and Closed Homework displayed on the opened page.

   @Test9
   Scenario: [TC_009-->US-039] Ability to Perform Bulk Deletion in Closed Homework List.
     And Make selections from the dropdown menus under Select Criteria, then click on the Search button
     And Click on the Closed Homework element below the Homework List.
     And Select the Select All icon to mark all homework entries, then click on the Delete button.
     And Click on the OK button in the opened alert.
     Then Verify that the message Record deleted successfully is displayed.











