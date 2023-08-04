Feature: Admin Student Payment Management

  Background:
    Given User goes to "adminLoginUrl"
    When User clicks on the "Admin Login" button
    Then The user enters the email and password
    And User clicks on the Admin Sign In button

  @testHamza]US_024-->TC_01]
  Scenario: User navigates to the "Collect Fees" page from the admin panel

    And User clicks on the Fees Collection link
    Then User verifies that the Collect Fees page link is visible under the Fees Collection menu heading
    When User clicks on the Collect Fees link
    Then User verifies that the addfee page is opened is opened


  @testHamza]US_024-->TC_02]
  Scenario: Admin collects fees from a student and verifies payment status

    And User goes to the URL "studentfee" list
    Then Student Fees list should be displayed with columns Fees Group, Fees Code, Due Date, Status, Amount, Payment ID, Mode, Date, Discount, Fine, Paid, Balance, Action

  @testHamza]US_024-->TC_03]
  Scenario:Currency selection in admin bar
    When Admin selects the Euro symbol from the top bar in the admin panel
    Then Euro symbol should be visible in the Amount column of the Student Fees list

  @testHamza]US_024-->TC_04]
  Scenario:Payment in admin panel
    When Admin clicks on the + icon under the Action column for an unpaid payment
    And Admin enters the amount in the popup and clicks on the Collect Fees button
    Then The entered amount should be seen in the addfee page

  @testHamza]US_024-->TC_05]
  Scenario:Recovering the payment made in the admin panel
    When Admin clicks on the revert icon for the payment
    Then Confirmation is given by clicking the revert icon in the window that opens.
    Then "Unpaid" status should be displayed under the Status column

  @testHamza]US_024-->TC_06]
  Scenario:Deduction of the payment made in the admin panel from the total debt

    When Admin clicks on the + icon under the Action column for an unpaid payment
    And Admin enters the amount in the popup and clicks on the Collect Fees button
    Then Paid amount should be displayed in the Paid column
    And Remaining balance amount should be displayed in the Balance column


