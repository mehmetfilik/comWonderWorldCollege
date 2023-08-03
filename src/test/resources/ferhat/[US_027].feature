Feature:  [US_027] As an administrator (admin), I want to view and update fee types in the system.

  Scenario:[TC_001-->US_27] In the admin panel's sidebar, under the "Fees Collection" menu, the "Fees Type" page link should be displayed,
  and when clicked, it should redirect to the "feetype" page.

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Clicks the fee collection button
    Then Click the Fee type button
    Then Verified that it was redirected to the fare collection page


  Scenario:[TC_002-->US_27] On the "feetype" page, there should be an "Add Fees Type" section with the following fields:
  Name, Fees Code, Description, and a "Save" button. Additionally, there should be a "Fees Type List" section with the columns:
  Name, Fees Code, and Action.

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Clicks the fee collection button
    Then Click the Fee type button
    Then Name, Rate Code, Description text Boxes and Save button are validated
    Then In the Fees Type List window, the titles Name, Fees Code, Action are visible and verified.



  Scenario:[TC_003-->US_27] Valid data should be able to be entered in the "Add Fees Type" window, and when clicking the "Save" button,
  a new Fees Type record should be created.

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Clicks the fee collection button
    Then Click the Fee type button
    Then In the Add Fees Type window, data is entered in the Name, Fees Code and Description textBoxes.
    And  Save click button


  Scenario:[TC_004-->US_27] By clicking the edit icon in the "Fees Type List" section, the "Edit Fees Type" window should open,
  allowing the data to be updated. When clicking the "Save" button, the changes should be saved, and the Fees Type should be updated.

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Clicks the fee collection button
    Then Click the Fee type button
    And Click the edit icon under Actions
    And The entered data is updated.



  Scenario:[TC_005-->US_27] By clicking the delete icon in the "Fees Type List" section, the selected Fees Type should be able to be
  deleted from the list.

    When The user navigates to the "adminLoginUrl" page
    Then Admin clicks login button
    Then Clicks the fee collection button
    Then Click the Fee type button
    And Click the delete icon under actions
    And Agree by clicking on the warning




