
Feature: [US_013] As a user, I want the contact information of the school to be available on the homepage for easy access


  Scenario: [TC_001-->US_013] On the homepage navbar,it should be verified that the school's email address is visible

    Then The user navigates to the "wonderUrl" page
    And The user goes to the navbar section



  Scenario: [TC_002-->US_013] In the footer of the homepage, it should be verified that the school's phone number,
  email address, and school address information are visible

    Given The user navigates to the "wonderUrl" page
    Then The user goes to the footer section.
    Then Verify that there is a phone number in the footer section
    Then Verify that there is an email in the footer section
    Then Verify that there is address information in the footer section




  Scenario: [TC_003-->US_013] On the homepage top bar, it should be verified that
  the school's phone information is visible as "Call Us

    Given The user navigates to the "wonderUrl" page
    Then Confirmation that call us appears







