Feature: [US_011] As a user, I want a "Complaints" section on the website where I can submit my requests and complaints.

  Background:

    Given Go to homepage

  @Test
  Scenario: [TC_001 --> US_011] .

    And Go down end of the homepage
    And Verify that Complain heading and icon are visible
    When Click on Complain heading or icon
    And Relevant complain page is opened
    Then Close the browser
  @Test
  Scenario: [TC_002 --> US_011] .

    And Go down end of the homepage
    And Verify that Complain heading and icon are visible
    When Click on Complain heading or icon
    Then Relevant complain page is opened
    And Confirm that there are text boxes for Name, Email, Contact No. and Description
    And Wait for 15 seconds
    And Close the browser
  @Test
  Scenario: [TC_003 --> US_011] .

    And Go down end of the homepage
    And Verify that Complain heading and icon are visible
    When Click on Complain heading or icon
    Then Relevant complain page is opened
    And Confirm that there are text boxes for Name, Email, Contact No. and Description
    And Wait for 15 seconds
    When Enter data into the Name, Email, Contact No. and Description boxes
    And Wait for 15 seconds
    And Click on Submit button
    Then Verify that complaint is succesfully submitted
    And Close the browser