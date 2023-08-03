
Feature: [US_29] Complaints page test

  Background:

    Given User goes to "wonderUrl" page
    Then Click on the Admin Login Button.
    And Enter a valid E-mail and Password.
    And Enter valid email and password in the email and password boxes.
    And Click on the Sign in button.
    And Click on the Front Office button.
    And Click on the Complein link.


  Scenario:[TC_001->US_29] The complain page link should be displayed, and when clicked, it should redirect to the complaint page.
    Given Verifies that Complain Type, Source dropdown menus and Phone, Date, Description, Action Taken, Assigned, Note textBoxes appear.
    Then user closes browser


  Scenario: [TC_002->US_29] Document upload test
    Given The user clicks on the Drag and drop link and uploads the file.
    Then user closes browser


  Scenario: [TC_003->US_29] A new complaint record should be created.
    Given On the User Complaint page, enters data in the boxes in the Add Complaint window
    Then Click on the "Save" button.
    And verifies that a grievance record has been created.
    And The user closes the page


  Scenario:[TC_004->US_29] Complain, Complain Type, Name, Phone, Date, Action titles) should be displayed.
    Given The Copmlain List (with Complain, Complain Type, Name, Phone, Date, Action titles) should be displayed.
    Then user closes browser


  Scenario:[TC_005->US_29] Complaint details should be viewable.
    Given User, click on the View  icon under the Action heading.
    Then User Verifies that Complaint details are displayed.
    And The user closes the page


  Scenario:[TC_006->US_29] Admin should be able to update complaint information
    Given User, click on the Edit  icon under the Action heading.
    Then The user makes changes to the complaint data.
    And The user clicks the save button.
    Then The user should verify that the complaint information is updated.
    And The user closes the page


  Scenario:[TC_007->US_29] Admin should be able to delete the complaint
    Given The user clicks on the delete icon under Action.
    Then user confirms that the complaint has been deleted.
    And The user closes the page

