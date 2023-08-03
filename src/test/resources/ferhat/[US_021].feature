Feature: [US_021] As an administrator (admin), I want to be able to view online admission applications and
  complete the enrollment process for the applying students from the admin panel.


  Scenario: [TC_001-->US_21] In the admin panel's sidebar, under the "Student Information" menu,
  the Online Admission page link should be displayed

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link




  Scenario: [TC_002-->US_21] When clicking on "Online Admission," the "Student List" should display columns for Reference No,Student Name,
  Class, Father Name, Date Of Birth, Gender, Category, Student Mobile Number, Form Status, Enrolled, Created At, and Action

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then User verifies that the titles under students list are displayed
    Then Action header is validated




  Scenario: [TC_003-->US_21] On the "Online Admission" page,a search TextBox should be
  available to search within the "Student List"


    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Student selection is made in the Search section
    Then A new name Ali is entered in the search section




  Scenario: [TC_004-->US_21] Under the "Form Status" column on the "Student List,"students who have filled but not submitted the admission
  form should be listed as "Not Submitted, and students who have submitted the admission form should be listed as "Submitted"

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Student selection is made in the Search section
    Then Student name is written in the search section
    Then Search section is deleted
    Then A new name is entered in the search section



  Scenario: [TC_005-->US_21] Under the"Enrolled"column on the"Student List"students whose online applications have
  been evaluated and enrolled inthe school should be listed with a check icon,and students whose
  enrollment is notcompleted should be listed with a(-)


    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Student selection is made in the Search section
    Then Search e Erol name is entered
    Then Erol name written in search will be deleted
    Then Sign name is entered in the search button



  Scenario: [TC_006-->US_21] In the "Student List," the applications listed can be deleted by
  clicking the delete icon under the "Action" column"


    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Applications are deleted by clicking the delete icon under the action title



  Scenario: [TC_007-->US_21] When clicking on the "Edit and Enroll" icon under the "Action" column of the applications
  listed in the "Student List" the"Edit and Enroll"page for the online submitted application should be displayed"


    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Click the edit end enroll icon
    Then Verifies that it redirects to the Edit and Enroll page
    Then The information filled in by the student in the Online Admission form is displayed



  Scenario: [TC_008-->US_21] "On the "Edit and Enroll" page, the information filled by the
  student in the Online Admission form should be displayed

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Click the edit end enroll icon
    Then Verifies that it redirects to the Edit and Enroll page
    Then Edit Online Admission is displayed



  Scenario: [TC_009-->US_21] The total payment amount calculated automatically when entering the Fees Details
  information on the Edit and Enroll page is displayed

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Click the edit end enroll icon
    Then Verifies that it redirects to the Edit and Enroll page
    Then Edit Online Admission is displayed
    Then The payment amount is automatically displayed when entering the Fees Details information.



  Scenario: [TC_0010-->US_21] After entering the student's information (Edit Online Admission,Fees Details,Transport Details,Parent
            Guardian Detail,Address Details,Miscellaneous Details),clicking the Save button should save the form

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Click the edit end enroll icon
    Then Verifies that it redirects to the Edit and Enroll page
    Then Edit Online Admission is displayed
    Then The information filled in by the student in the Online Admission form is displayed
    And Save button is pressed




  Scenario: [TC_0011-->21] The form, student information (Edit Online Registration, Fee Information, Transportation Information, Parent Information,
  Address Information, Miscellaneous Information) is entered and the save button is clicked.

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Student Information button is clicked
    Then Click on the Online Admission page link
    Then Verifies that Student List is visible
    Then Click the edit end enroll icon
    Then Verifies that it redirects to the Edit and Enroll page
    Then Edit Online Admission is displayed
    Then The information filled in by the student in the Online Admission form is displayed
    And Click the Save and Save and Enroll buttons