
Feature: [US_043] Login test with username and password in student panel.


  Scenario: [TC_001->US_043] Login should not be possible with the correct email and incorrect password
    Given User goes to "wonderUrl".
    Then Click the login button.
    And Enters valid username and invalid password in the username and password section on the left side.
    And Click the Sign In button.
    Then Verifies that the text "Your password or username is invalid" is visible.
    And The user closes the page


  Scenario: [TC_002->US_043] The user can click on the "forgot password" link and define a new password.
    Given User goes to wonderWorldUrl page
    Then Click the login button.
    And  clicks on the forgot password button.
    Then The user enters student email in the Email box on the Forgot Password page and clicks Submit.
    Then Verifies that you are directed to the relevant page.
    And The user closes the page
