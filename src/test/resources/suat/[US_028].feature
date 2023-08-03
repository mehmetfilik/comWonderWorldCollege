Feature: [US_028] As an administrator (admin), I want to add new sources of income to the system to increase school revenues.

  Background:

    Given Navigate to admin login url
    And Provide admin login enterance

  @Test
  Scenario: [TC_001 --> US_028] The visibility of "Add Income" page under the "Income" menu and redirection to income page.
    And Click on the Income menu on the sidebar
    And Confirm that Add Income page link is displayed
    When Click on the Add Income page link
    Then Link to the income page
    And Close the browser

  @Test
  Scenario: [TC_002 --> US_028] "Add Income" section content test
    And Click on the Income menu on the sidebar
    When Click on the Add Income page link
    Then Link to the income page
    And Confirm the existence of Add Income section with the Income Head dropdown menu, Name, Invoice Number, Date, Amount, and Description fields.
    And Approve the possibility of uploading document
    Then Close the browser

  @Test
  Scenario: [TC_003 --> US_028] Creation of a new Income by saving valid datas entered in the "Add Income" window.
    And Click on the Income menu on the sidebar
    When Click on the Add Income page link
    Then Link to the income page
    And Enter valid information to the text boxes in Add income section
    When Click on the Save button
    Then Confirm the creation of a new Income record
    And Close the browser

  @Test
  Scenario: [TC_004 --> US_028] Verifying "Income List" section content
    And Click on the Income menu on the sidebar
    When Click on the Add Income page link
    Then Link to the income page
    And See that Income list has Name, Description, Invoice Number, Date, Income Head, and Amount
    And Verify the existence of search box to enable searching specific data
    And Close the browser

  @wip
  Scenario: [TC_005 --> US_028] The amount of records that was seen in one page in "Income List" has to be changeable
    And Click on the Income menu on the sidebar
    When Click on the Add Income page link
    Then Link to the income page
    And Confirm that in one page the amount of records seen is changeable
    And Close the browser






