Feature:[US_002] As a user, I want there to be menu titles on the top bar of the Homepage that will facilitate easy navigation within the site.

  Scenario: [TC_001-->US_002] Verification of Scrolling Latest News on the Homepage Top Bar

    Given The user goes to the WonderWorldCollege homepage.
    Then Testing the first latest news information"
    And waits for 10 seconds.
    Then Testing the second latest news information
    And waiting for 10 seconds
    Then Testing the third latest news information
    And  wait for 10 seconds
    Then Testing the fourth latest new information
    And The user closes the page


  Scenario: [TC_002-->US_002] Verification of Site Logo and Menu Titles on the Homepage Top Bar

  Given The user goes to the WonderWorldCollege homepage.

  Then The visibility of the site logo is tested
  And When the site logo is clicked, the page is refreshed

  Then the Home menu title should be visible
  And  When clicked on the Home title, it should be redirected to the relevant page

  Then The visibility of the Online Admission title is tested
  And When clicked on the Online Admission title, it is redirected to the relevant page.

  Then The visibility of the Exam Result title is tested
  And When clicked on the Exam Result title, it is redirected to the relevant page.

  Then The visibility of the About Us title is tested
  And When clicked on the About Us title, it is redirected to the relevant page.

  Then The visibility of the Academics title is tested

  Then The visibility of the Course title is tested
  And When clicked on the Course title, it is redirected to the relevant page.

  Then The visibility of the Gallery title is tested
  And When clicked on the Gallery title, it is redirected to the relevant page.

  Then The visibility of the News title is tested
  And When clicked on the News title, it is redirected to the relevant page.

  Then The visibility of the Contact title is tested
  And When clicked on the Contact title, it is redirected to the relevant page.

  And The user closes the page


    Scenario: [TC_003-->US_002] Verification of the Academics dropdown menu and accessing the respective pages when clicking on the links in the Academics dropdown menu.

  Given The user goes to the WonderWorldCollege homepage.

  When Click on the Academics title.
  Then The visibility of the Facilities title is tested
  And When clicked on the Facilities title, it is redirected to the relevant page.

  When Click on the Academics title.
  Then The visibility of the School Uniform title is tested
  And When clicked on the School Uniform title, it is redirected to the relevant page.

  When Click on the Academics title.
  Then The visibility of the Principal Message title is tested
  And When clicked on the Principal Message title, it is redirected to the relevant page.

  When Click on the Academics title.
  Then The visibility of the Know Us title is tested
  And When clicked on the Know Us title, it is redirected to the relevant page.

  When Click on the Academics title.
  Then The visibility of the Approach title is tested
  And When clicked on the Approach title, it is redirected to the relevant page.

  When Click on the Academics title.
  Then The visibility of the Teacher title is tested
  And When clicked on the Teacher title, it is redirected to the relevant page.

  When Click on the Academics title.
  Then The visibility of the Houses&Mentoring title is tested
  And When clicked on the Houses&Mentoring title, it is redirected to the relevant page.

  When Click on the Academics title.
  Then The visibility of the Student Council title is tested
  And When clicked on the Student Council title, it is redirected to the relevant page.

  And The user closes the page
















