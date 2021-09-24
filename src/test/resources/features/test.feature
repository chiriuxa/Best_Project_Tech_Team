
Feature: Time And Recruitment feature


  Background: Login
  Scenario: Singin to Orange HRM Web Page
    Given I am in the Login page
    When enter username in the input box
    And enter password in the input box
    And click on the Login button
    Then verify that i am logged in


    @PunchInOutTest
    Scenario: Punch In/Out test
      Given Click on time header link
      When Hover over Attendance drop down
      And Selecting Punch In Out
      And Verifying Punch In text Is displayed
      And Adding a note
      And Click on In button


