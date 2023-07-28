Feature:Admin (Teacher) - Prepare & Assign Homework

  @Test1
  Scenario:[TC_001-->US-039] Verify "Add Homework" Link in Teacher Panel
    Given the teacher navigates to "https://qa.wonderworldcollege.com/login.html"
    And clicks on the "Teacher Login" button
    And enters the username and password
    And clicks on the "Sign In" button
    And clicks on the "Homework" page link in the sidebar
    And clicks on the "Add Homework" page link
    Then the teacher should be redirected to the "Add Homework" page successfully





