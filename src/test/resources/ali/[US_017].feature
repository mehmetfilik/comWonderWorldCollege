Feature: [US_017] As a user, I want a page that introduces the teachers working at the school


  Scenario: [TC_001-->US_017] Verifying that in the Academics dropdown in the top bar of the homepage, there is a link for the "Teachers" page and its functions

    Given The user goes to the WonderWorldCollege homepage.

    When I click on the Academics dropdown menu

    Then I should see the menu options

    When I select teachers from the menu

    Then the selected option should be displayed



    And The user closes the page