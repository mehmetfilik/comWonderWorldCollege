Feature: [US_043] Login test with username and password in student panel.
  @us043
  Scenario: [TC_001->US_043] Login should not be possible with the correct email and incorrect password
    Given User goes to "wonderUrl".
    Then Click the login button.
    And Enters valid username and invalid password in the username and password section on the left side.
    And Click the Sign In button.
    Then Verifies that the text "Your password or username is invalid" is visible.
    And The user closes the page