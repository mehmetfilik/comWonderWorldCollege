
Feature: [US_033] As an administrator (teacher), I want to access students' exam results.

  Background:
    Given Teacher Logs in with "validFilikTeacherEmail" and "validFilikTeacherPassword"
    When Go to Exam Result Page in the Teacher Panel

  @test2
  Scenario: [TC_001-->US_033] Verification of "Exam Result" Page Link in the Teacher Panel's Sidebar

    Given Verification of Select Criteria
    When Close the browser

  @test2
  Scenario: [TC_002-->US_033] Verification of Search Results in the "Exam Result" Section

    Given Verification of the list of Exam Result
    When Close the browser

  @test
  Scenario: [TC_003-->US_033] Redirection to Respective Student's Profile Page from the 'Exam Result' Section

    Given Verification of User Redirection to Student's Profile Page
    When Close the browser

