Feature: [US_008] As a user, I would like to see the school's achievements on the homepage.

  Background:

    Given Go to homepage

  @Test
  Scenario: [TC_001 --> US_008] Verification of Achievements section displaying.

    And Hover to Achievements section
    Then Display Achievements section under the heading Achievements
    And Display boards in Achievements section with 237 Graduates, 167 Certified Teachers, 57 Student Campuses, 6852 Students informations
    And Close the browser



