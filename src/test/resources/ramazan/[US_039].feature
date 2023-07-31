Feature:Admin (Teacher) - Prepare & Assign Homework

  Background:

    Given User goes to wonderUrl page
    Then Click on the Teacher Login Button.
    And Enter the username and password, then click on the "Sign In" button.

  @Test
  Scenario:[TC_001-->US-039] Verify "Add Homework" Link in Teacher Panel

    And clicks on the Homework page link in the sidebar
    And clicks on the Add Homework page link
    Then the teacher should be redirected to the Add Homework page successfully






