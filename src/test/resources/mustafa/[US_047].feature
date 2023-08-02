Feature: [US_047]  As a user, I should be able to access the "Homework" page and make changes to my assignments  When entering the Student Panel

  Background:
    Given The user goes to the "wonderWorld" website.

    And The user enters the valid values in the username and password box on the left and clicks the Sign In button.
    And The user clicks on the Homework page on the left.


  Scenario:[TC_001,TC_002->US_047]When you enter the "Homework" page, the "Upcoming Homework" tab should be visible and you should be able to send a message from the "Action" section.

    And Column fields in the Upcoming Homework segment must be visible.
    And Click on the menu under the Action section and after typing a message in the message box, click the save button.
    Then The Action section should be accessible and a message can be sent.
    And The user closes the page

  Scenario: [TC_003->US_047] User should be able to add new assignment.
    And User clicks Daily Assignment button
    And Click on the +Daily Assignment button
    And Creates a new daily assignment by entering the necessary information in the Subject , Title , Description, Attach Document fields and clicks the Save button.
    Then Verifies that a new assignment has been added.
  @us047
    Scenario: [TC_004-->US_047] Assignments can be updated from the "Action" section.
      And User clicks Daily Assignment button
      And Click on the +Daily Assignment button
      And Creates a new daily assignment by entering the necessary information in the Subject , Title , Description, Attach Document fields and clicks the Save button.
      And The user clicks the Edit icon under the Action section
      And Changes the information on the Edit Daily Assignment page and clicks the "Save" button.
      And Verifies that assignment information has been updated.
      And Click the Delete icon under the Action section
      Then verifies that the assignment was deleted.


