Feature: [US_032] As an administrator (teacher), I want to crate student's exam groups
Background: 
  Given Teacher Logs in with "validFilikTeacherEmail" and "validFilikTeacherPassword"
  @test1
  Scenario:[TC_001 --> US_032]
  In the teacher panel's sidebar, under the "Examination" menu, the "Exam Group" page link
  should be displayed, and when clicked, it should redirect to the "examgroup" page.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    Then Checks for the correct page result

  @test1
  Scenario:[TC_002 --> US_032]
  On the "examgroup" page, there should be an "Add Exam Group" section with Name and Description textboxes,
  and an Exam Type dropdown menu visible.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    Then On the Exam Group page check for the Add Exam Group section
    And Check Exam Type dropdown menu visiblity

  @test1
  Scenario:[TC_003 --> US_032]
  The "Save" button should be visible and active in the "Add Exam Group" section on the "examgroup" page.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    Then Checks for Save button

  @test1
  Scenario:[TC_004 --> US_032]
  After entering the Name and selecting an Exam Type in the "Add Exam Group" section,
  clicking the "Save" button should create a new exam group.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    Then Fill the section
    And Look for success text box

  @test1
  Scenario:[TC_005 --> US_032]
  The "Exam Group List" should display columns: Name, No Of Exams, Exam Type, and Action.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    Then Look for Exam Group List

  @test1
  Scenario:[TC_006 --> US_032]
  Clicking the (+) icon under the "Action" column in the "Exam Group List" should redirect to the "add exam" page.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    And Click + icon
  @test1
  Scenario:[TC_007 --> US_032]
  Clicking the "Edit" icon under the "Action" column in the "Exam Group List" should open the "Edit Exam Group" window
  for updating.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    Then Click pencil icon
  @test1
  Scenario:[TC_008 --> US_032]
  Clicking the "Delete" icon under the "Action" column in the "Exam Group List" should allow the deletion of the
  respective exam group.
    Given After log in as a teacher search for Exam Group button under the Examination menu
    And Click on the Exam Group button
    Then Click cross icon for delete exam
