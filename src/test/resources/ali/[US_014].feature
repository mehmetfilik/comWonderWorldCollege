Feature: [US_014] As a user, I want an 'OUR EXPERIENCED STAFF' section on the homepage to get to know the school's experienced staff


  Scenario: [TC_001-->US_014] Checking "OUR EXPERIENCED STAFFS" section

    Given The user goes to the WonderWorldCollege homepage.

    Then The user tests if "OUR EXPERIENCED STAFFS" section on the homepage is visible.

    Then The user tests if in the "OUR EXPERIENCED STAFFS" section Anthony Carter is displayed
    Then The user tests if in the "OUR EXPERIENCED STAFFS" section Ava Turner is displayed
    Then The user tests if in the "OUR EXPERIENCED STAFFS" section Davidson Morgan is displayed
    Then The user tests if in the "OUR EXPERIENCED STAFFS" section Lily Peterson is displayed


    And The user closes the page
