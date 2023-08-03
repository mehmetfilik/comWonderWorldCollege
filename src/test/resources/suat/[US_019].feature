Feature: [US_019] As an administrator (admin), I want to access and update my profile information.

  Background:

    Given Navigate to admin login url
    And Provide admin login enterance


  @Test
  Scenario: [TC_001 --> US_019] The profile icon visibility on the top bar.
    Then Confirm that the profile icon on the top bar is visible
    And Close the browser

  @Test
  Scenario: [TC_002 --> US_019] Profile icon test which opens a window displaying informations and links.
    Then Click on the profile icon
    And Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    And Close the browser

  @Test
  Scenario: [TC_003 --> US_019] Working test of links and displaying test transition of informations on the profile page.
    And Click on the profile icon
    When Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on Profile Page link
    And Click on to the Payroll, Leaves, Attendance, and Documents pages to verify transition is possible
    And Verify that  the General Information, Address Details, Bank Account Details, and Social Media Link information are displaying on Profile page
    And Close the browser

  @Test
  Scenario: [TC_004 --> US_019] The visibility of info boards and Payslip List on the Payroll page .
    And Click on the profile icon
    When Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on Profile Page link
    And Click on to the Payroll page
    Then Confirm the visibility of Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction info boards
    And Display Payslip list with Month-Year, Date, Mode, Status, Net Salary, Action columns
    And Close the browser

  @Test
  Scenario: [TC_005 --> US_019] Checking "View Payslip" link to see related payslip .
    And Click on the profile icon
    When Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on Profile Page link
    And Click on to the Payroll page
    Then Click on View Payslip link under the Action column
    And Display related payslip for that period
    And Close the browser

  @Test
  Scenario: [TC_006 --> US_019] Verification of the search textBox which filters with menu headings .
    And Click on the profile icon
    When Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on Profile Page link
    And Click on to the Payroll page
    And Confirm that there is a search textBox
    And Verify that filtering within Paylist by using headings is possible
    And Close the browser

  @Test
  Scenario: [TC_007 --> US_019] Screening the Leave List on the Leaves page and checking "view" icon under the Action column .
    And Click on the profile icon
    When Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on Profile Page link
    And Click on Leaves page
    Then Display Leave List with Leave Type, Leave Date, Days, Apply Date, Status, Action columns
    When Click on view icon under Action column
    And  View the relevant leave information
    And Close the browser

  @Test
  Scenario: [TC_008 --> US_019] Confirm that info boards are visible, a selectable attendance year is available on the Attendance page.
    And Click on the profile icon
    When Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on Profile Page link
    And Click on Attendance page
    And Approve the visibility of info boards including Total Present, Total Late, Total Absent, Total Half Day, Total Holiday
    And Check availibility of selectable attendance year
    Then Close the browser

  @Test
  Scenario: [TC_009 --> US_019] Attendance marking letters explanation and staff's Attendance List should be displayed.
    And Click on the profile icon
    When Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on Profile Page link
    And Click on Attendance page
    Then Get the explanation of Attendance marking letters
    And Display staff's Attendance List
    And Close the browser

  @Test
  Scenario: [TC_010 --> US_019] Controlling Password link .
    And Click on the profile icon
    And Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    When Click on the Password link
    Then Link a page that involves Current Password, New Password, Confirm Password text boxes, and a Change Password button
    And Close the browser

  @Test
  Scenario: [TC_011 --> US_019] Changing Password test .
    And Click on the profile icon
    And Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    When Click on the Password link
    And Link a page that involves Current Password, New Password, Confirm Password text boxes, and a Change Password button
    Then Enter valid values to Current, New and Confirm Password text boxes
    When Click on the Change Password button
    And Verify that Password is changed
    And Close the browser
  @Test
  Scenario: [TC_012 --> US_019] Changing Password test .
    And Click on the profile icon
    And Open a window that displays the name of the account owner, role and links to Profile, Password and Logout
    Then Click on the Logout link
    And Approve that the admin is logged out
    And Close the browser







