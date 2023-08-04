Feature: [US_006] As a user, I want a "Course" page on the website where I can access detailed information about the courses offered at the school.
@us6
  Scenario: [TC_001-->US_006] Course Menu and Course Details Validation

  Given The user goes to the WonderWorldCollege homepage.
  When Click on the Course menu on the top bar and the user should be redirected to the Course page
  Then the course headings should be visible
  And there should be a Details button below each course heading
  And the user should be redirected to the detailed page of the English and Literature
  And the user should be redirected to the detailed page of the Mathematics
  And the user should be redirected to the detailed page of the Sciences
  And the user should be redirected to the detailed page of the Social Sciences
  And the user should be redirected to the detailed page of the History
  And the user should be redirected to the detailed page of the Arts and Music
  And the user should be redirected to the detailed page of the Healts and Exercise Sciences
  And the user should be redirected to the detailed page of the Foreign Language
  And the user should be redirected to the detailed page of the Computer Science
  And The user closes the page