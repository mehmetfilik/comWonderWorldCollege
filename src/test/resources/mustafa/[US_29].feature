@tc1
Feature: [US_29] Complaints page test

  Background:

    Given User goes to "wonderUrl" page
    Then Click on the Admin Login Button.
    And Enter a valid E-mail and Password.
    And Enter valid email and password in the email and password boxes.
    And Click on the Sign in button.

  Scenario:[US_29->TC_001] The complain page link should be displayed, and when clicked, it should redirect to the complaint page.

    And Click on the Front Office button.
    And Click on the Complein link.
    And Verifies that Complain Type, Source dropdown menus and Phone, Date, Description, Action Taken, Assigned, Note textBoxes appear.
    Then user closes browser


    Scenario: [US_29->TC_002] Document upload test



