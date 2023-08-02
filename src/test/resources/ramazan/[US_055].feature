Feature: User should change username from Student page in Parent Panel.

  Background:
    Given User logs in to the parent panel
    And Click on the profile photo in the top right corner.


  @[US_055_TC_001]
    Scenario: User accesses Change Username link and gets redirected to the relevant page.
    Then Verify that the Change Username button is visible in the menu.