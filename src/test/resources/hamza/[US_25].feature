Feature: Admin Payment Management

  Background:
    Given User goes to "adminLoginUrl"
    When User clicks on the "Admin Login" button
    Then The user enters the email and password
    And User clicks on the Admin Sign In button

  @testHamza[US_025-->TC_01]
  Scenario: Verify the functionality of Fees Master in Student Information section

    And User clicks on the Fees Collection link
    Then User verifies that the Fees Master page link is visible under the Fees Collection menu heading
    When User clicks on the Fees Master link
    Then User verifies that the feesmaster page is opened
    And User verifies the presence of "Add Fees Master" and "Fees Master List" sections on the "feesmaster" page
    And User verifies the presence of the search box for filtering on the "feesmaster" page
    And User selects "hamzatest" from the "Fees Group" dropdown menu in the "Add Fees Master" window
    And User selects "hamzatesttype" as the "Fees Type" in the "Add Fees Master" window
    And User enters "10000.00" in the "Amount" field in the "Add Fees Master" window
    And User clicks the "save" button in the "Add Fees Master" window and verifies successful saving
    And User clicks the edit icon for the last item in the "Fees Master List" section
    And User enters "200.00" in the "Amount" field in the edit window
    And User clicks the "save" button in the edit window and verifies successful update
    And User clicks the delete icon for the last held item in the "Fees Master List" section
    Then User verifies that the last item in the "Fees Master List" section is deleted
