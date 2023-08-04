
Feature: [US_003] As a user, I want an Online Admission page on the homepage so that I can enroll in the school online


  Scenario: [TC_001-->US_003] Verification of Redirecting to 'Online Admission' Page by Clicking on the "Online Admission

    Given The user goes to the WonderWorldCollege homepage.
    Then When clicked on the Online Admission title, it is redirected to the relevant page.
    And The user closes the page



  Scenario: [TC_002-->US_003] Verification of Displaying School Admission Criteria in the "Instructions" Window on the "Online Admission" Page.

    Given The user goes to the WonderWorldCollege homepage.
    Then Go to the Online Admission page
    And verify that the school admission criteria are displayed in the Instructions window.
    And The user closes the page


  Scenario: [TC_003-->US_003] Verification of Basic Details Section on the "Online Admission" Page

    Given The user goes to the WonderWorldCollege homepage.
    Then Go to the Online Admission page
    Then The visibility of the TextBoxes for class,firstname,last name,gender,date of birth,and email is tested.
    Then The test verifies that data can be entered into the class,firstname,last name,gender,date of birth and email boxes.
    And The user closes the page



  Scenario: [TC_004-->US_003] Verification of Father Name and Mother Name TextBoxes' Visibility and Editability in the "Parent Detail" Section on the "Online Admission" Page.

    Given The user goes to the WonderWorldCollege homepage.
    Then Go to the Online Admission page
    Then Father Name and Mother Name textboxes must be visible
    Then Data must be entered in the father name and mother name textboxes
    And The user closes the page


  Scenario: [TC_005-->US_003] Verification of Guardian Details Section on the "Online Admission" Page.

    Given The user goes to the WonderWorldCollege homepage.
    Then Go to the Online Admission page
    Then the guardian name, guardian relation, and guardian email TextBoxes should be visible
    Then guardian name, guardian relation and guardian email TextBoxes must be data accessible
    Then Father, Mother, Other buttons should be visible and selectable
    And The user closes the page



  Scenario: [TC_006-->US_003] The National Identification Number and Previous School Details textboxes must be visible and data can be entered

    Given The user goes to the WonderWorldCollege homepage.
    Then Go to the Online Admission page
    Then The National Identification Number and Previous School Details textboxes must be visible
    Then National Identification Number and Previous School Details textboxes must be data enterable
    And The user closes the page

@us3
    Scenario: [TC_007-->US_003] Online Admission Form Submission

      Given The user goes to the WonderWorldCollege homepage.
      Then Go to the Online Admission page
      Then The test verifies that data can be entered into the class,firstname,last name,gender,date of birth and email boxes.
      Then Data must be entered in the father name and mother name textboxes
      Then guardian name, guardian relation and guardian email TextBoxes must be data accessible
      Then Father, Mother, Other buttons should be visible and selectable
      Then National Identification Number and Previous School Details textboxes must be data enterable
      Then Click the submit button
      Then review entered details And Status page is verified
      Then Reference No, Form Status and Application Date should be visible
      Then I Agree To The Terms And Conditions button should be visible and clickable
      Then Click the submit button at the bottom
      Then Form Has Been Submitted Successfully..!! message should be visible
      Then submitted is verified
      And The user closes the page












