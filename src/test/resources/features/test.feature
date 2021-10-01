
Feature: Time And Recruitment feature


    @PunchInOutTest
    Scenario: Punch In/Out test
      Given I am in the Login page
      When enter username in the input box
      And enter password in the input box
      And click on the Login button
      Then verify that i am logged in
      Given Click on time header link
      When Hover over Attendance drop down
      And Selecting Punch In Out
      And Verifying Punch In text Is displayed
      And Adding a note
      And Click on In button
      And Check if note is displayed
      Then Check if Punch Out Text is displayed
     # And Click on Out button


  @TimesheetsTest
      Scenario: Employee Timesheets test
        Given I am in the Login page
        When enter username in the input box
        And enter password in the input box
        And click on the Login button
        Then verify that i am logged in
        And Click on time header link
        And Hover over Timesheets link
        And Press Employee Timesheets
        And Under Timesheets Pending Action Press first employee view link
        And Press edit button
        And Press Remove Rows Button
        And Adding in first row for tuesday two hours
        And Press save button
        When Check if two hours has been added to first row tuesday





