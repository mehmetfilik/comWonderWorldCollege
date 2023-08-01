Feature: Leave Request Management in the "Leaves List"


  Scenario: [TC_01-->US_38] Verify that the functions under the Communicate menu title in the sidebar.

    * Sign in on the Theacher Admin
    * Verify communicate menu on the sidebar
    * Verify email Template, titleBox and messageBox on the compose page
    * Verify selectability of checkboxes

  @omer
  Scenario: [TC_02-->US_38] Verify Verifying that the functions in the Individual section of the Send Main page

    * Sign in on the Teacher Admin and go to Individual
    * Verify that any student can be selected and deleted from the list again


  Scenario: [TC_03-->US_38] Verify that classes can be selected to send messages.

    * Sign in on the Teacher Admin and go to Class Menu
    * Verify that classes can be selected to send messages


  Scenario: [TC_04-->US_38] Verify that the Today's Birthday window automatically displays people born on that date registered in the system.

    * Sing in on the Teacher Admin and go to Todays Birthday window
    * Verify that messages can be sent to those who have a birthday today.



  Scenario: [TC_05-->US_38]  It should be verified that an instant message has been sent to a selected contact.

    * Select any Person and send to message an instant
    * Send a future date message to the selected person


