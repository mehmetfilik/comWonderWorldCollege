Feature:Admin (Teacher) - Prepare & Assign Homework

  Background:

    Given User goes to wonderUrl page
    Then Click on the Teacher Login Button.
    And Enter the username and password, then click on the "Sign In" button.
    And clicks on the Homework page link in the sidebar
    And clicks on the Add Homework page link

    @[US_039_TC_001]
    Scenario: [US_039-->TC_001] Verify "Add Homework" Link in Teacher Panel
    Then the teacher should be redirected to the Add Homework page successfully

    @[US_039_TC_002]
    Scenario: [US_039-->TC_002] Verify 'Select Criteria' Section Elements on Homework Page
    Then Verify that Class, Section, Subject Group,Subject Dropdown menus and Search button are visible and enabled.

    @[US_039_TC_003]
    Scenario: [US_039-->TC_003] Verify Homework List Display with Selected Criteria and Columns.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Verify that the Homework List is visible in the opened menu.
      And Click on the Evaluation icon under the Action heading.
      Then Verify that the Evaluate Homework page is opened.

    @[US_039_TC_004]
    Scenario: [US_039-->TC_004] Verify Homework Summary Display and Saving Note in "Evaluate Homework" Window for the Teacher.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Click on the Evaluation icon under the Action heading.
      And Verify that the Summary text is visible in the Evaluate Homework window.
      And Write a note in the textbox below the message and click on the Save button.
      Then Verify that the Homework Evaluation Completed Successfully. alert message is visible.

    @[US_039_TC_005]
    Scenario: [US_039-->TC_005]Verify Editing and Saving Homework in "Edit Homework" Window from the Edit Icon under Homework List.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Click on the Edit icon under the Action heading.
      And Write your message in the text box under Description and click on the Save button.
      Then Verify that the Record Saved Successfully alert message is visible.

    @[US_039_TC_006]
    Scenario: [US_039-->TC_006] Verify Homework Deletion from the Delete Icon under Homework List.
      And The teacher makes selections from the dropdown menus, then clicks on the Search button.
      And Click on the delete icon under the Action heading.
      And Click on the OK button in the opened alert.
      Then Verify that the message No data available in the table is displayed in the Homework List.

   @[US_039_TC_007]
   Scenario: [US_039-->TC_007] Verify Add Homework Functionality and Data Entry on "Add Homework" Window.
     And Add button should be visible and enable.
     And Fill in the mandatory fields on the Add Homework window and click on the Save button.
     Then Verify that the Record Saved Successfully alert message is visible.

   @[US_039_TC_008]
   Scenario: [US_039-->TC_008] Verify Display of Two Separate Lists - Upcoming Homework and Closed Homework in Homework List.
     Then Verify that there are two separate lists, Upcoming Homework and Closed Homework displayed on the opened page.

   @[US_039_TC_009]
   Scenario: [US_039-->TC_009] Ability to Perform Bulk Deletion in Closed Homework List.
     And Make selections from the dropdown menus under Select Criteria, then click on the Search button
     And Click on the Closed Homework element below the Homework List.
     And Select the Select All icon to mark all homework entries, then click on the Delete button.
     And Click on the OK button in the opened alert.
     Then Verify that the message Record deleted successfully is displayed.













