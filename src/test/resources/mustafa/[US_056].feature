
Feature: [US_056]All fields test in parent panel

  Background:
    Given User goes to wonderWorld website
    And  Clicks the Login button.
    And The user enters the valid values in the username and password box on the left and clicks the "Sign In" button.
    And User clicks "My Profile" button

  Scenario: [TC_001-->US_056] Student's name, Admission No, Class, Section, and Gender should be visible. The Profile, Fees, Exam, and Documents tabs should be visible.
    And Student's name, Admission No, Class, Section, and Gender. Verifies that elements are visible
    And The user closes the page

  Scenario:[TC_002-->US_056] Profile, Fees, Exam, and Document tabs should be visible
    And Verifies that the Profile, Fees, Exam, and Documents tabs are visible.
    And The user closes the page


  Scenario: [TC_003-->US_056] The headings under the profile tab should be visible
    And  User clicks profile tab
    And Verifies that the headers appear under the profile tab
    And The user closes the page
