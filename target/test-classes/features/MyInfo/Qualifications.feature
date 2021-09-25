Feature: Login
  As I student,I should be able to apply




@Quality
  Scenario: Create an account in Contact Details
    Given I am on the login page
    When I enter username
    And I enter password
    And click the Login button
    Given I am in the OrangeHRM Web page
    And i navigate My Link and click
  And i navigate Qualifications and click
  And I navigate Languages and click
  Then I navigate Add button and click
  And I navigate back and click Language then select English from drop down selection
  Then Click the Save button
