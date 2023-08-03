Feature: [US_23] Student Details and Student Search Test in the admin panel

  @testHamza[US_023]
Scenario: [TC_001-->US_023] Verify Student Details and Search Page

  Then User goes to "adminLoginUrl"
  Given User clicks on the "Admin Login" button
  Then The user enters the email and password
    And User clicks on the Admin Sign In button
  When User verifies that the Student Details link is visible under the Student Information section in the admin page
  And User clicks on the Student Details link
  Then User is redirected to the search page
  And Search page displays Class and Section dropdowns and two search buttons which are visible and active
    Given User performs a search in the Class 2 and Section "A" dropdowns based on pre-condition
    Then A list with headers Admission No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Mobile Number, Action is displayed
    And User verifies that the student name in the list is clickable and opens the student's profile page
    And User goes back to the previous Student Search page
    Then User verifies that the view icon under the Action column is visible and active
    And User clicks on the view icon
    Then User verifies that the student's profile page opens in a new window
    And User goes back to the previous Student Search page
    Then User verifies that the edit icon under the Action column is visible and active
    And User clicks on the edit icon
    Then User verifies that the student's edit page is opened
    And User can edit the information in the Edit Student, Transport Details, Fees Details, Parent Guardian Detail, Address-Details, and Miscellaneous Details sections
    And User verifies that the edited information is saved by clicking the save button on the Edit page
    And User goes back to the previous Student Search page
    Given User verifies that the add fees icon under the Action column is visible and active
    And User clicks on the add fees icon
    Then User is redirected to the relevant student's add fee page




