Feature: [US_004] As a student, I want a page on the website where I can view my exam results.

  Background:

    Given Go to homepage


  @Test
  Scenario: [TC_001 --> US_004] Redirected to the 'Exam Result' page.

    And Click on the 'Exam Result' menu title
    And Redirected to the 'Exam Result' page
    Then Close the browser

  @Test
  Scenario: [TC_002 --> US_004] Verification of Admission No and Exam text box are visible and mandatory.

    And Click on the 'Exam Result' menu title
    And Redirected to the 'Exam Result' page
    And Verify that Admission No and Exam text box are visible and are mandatory fields for data input.
    Then Close the browser

  @Test
  Scenario: [TC_003 --> US_004] Verification of the existance and the usage of Search button.
    And Click on the 'Exam Result' menu title
    And Redirected to the 'Exam Result' page
    And Verify the existance of Search button
    And Enter data in Admission No text box and select Exam from Exam text box
    And Wait for visibility of element
    And Click on the Search button to verify usage of the Search button
    Then Close the browser

  @Test
  Scenario: [TC_004 --> US_004] Opening a window that shows the student's exam results
    And Click on the 'Exam Result' menu title
    And Redirected to the 'Exam Result' page
    And Enter data in Admission No text box and select Exam from Exam text box
    And Wait for visibility of element
    When Click on the Search button to verify usage of the Search button
    Then Open a window that shows the student's exam results
    And Close the browser

  @Test
  Scenario: [TC_005 --> US_004] Verify that Student Name, Roll Number and Admission No are displayed
    And Click on the 'Exam Result' menu title
    And Redirected to the 'Exam Result' page
    And Enter data in Admission No text box and select Exam from Exam text box
    And Wait for visibility of element
    When Click on the Search button to verify usage of the Search button
    Then Open a window that shows the student's exam results
    And Verify that Student Name, Roll Number and Admission No is displayed in open window.
    Then Close the browser

  @Test
  Scenario: [TC_006 --> US_004] Confirmation of list that shows exam results with headings Subject, Max Marks, Min Marks, Marks Obtained, and Note
    And Click on the 'Exam Result' menu title
    And Redirected to the 'Exam Result' page
    And Enter data in Admission No text box and select Exam from Exam text box
    And Wait for visibility of element
    When Click on the Search button to verify usage of the Search button
    Then Open a window that shows the student's exam results
    And Confirm that exam results are listed with the headings Subject, Max Marks, Min Marks, Marks Obtained, and Note
    Then Close the browser

  @Test
  Scenario: [TC_007 --> US_004] Verify calculated Perfcentage, Rank, Result, Division, Grand Total, and Total Obtain Marks are correctly displayed
    And Click on the 'Exam Result' menu title
    And Redirected to the 'Exam Result' page
    And Enter data in Admission No text box and select Exam from Exam text box
    And Wait for visibility of element
    When Click on the Search button to verify usage of the Search button
    Then Open a window that shows the student's exam results
    And Verify correct displaying of calculated Percentage, Rank, Result, Division, Grand Total, and Total Obtain Marks based on exam results
    Then Close the browser



