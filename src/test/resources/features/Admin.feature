Feature: Login and Admin verification feature


  Background: Login
  Scenario Outline:
    Given I am in the Login page
    When enter "<username>" in the input box
    And enter "<password>" in the input
    And click on the Login button
    Then verify that i am logged in
    Examples:
      |username| |password|
      |Admin| |admin123|

    Scenario: adding username
      Given i click on Admin Header link
      When i click on the Add button
      And  i select user role from dropdown
      And i type employee name
      And  i type username
      And  i select status from dropdown
      And  i type the password
      And  i confirm the password
      And i click on the Save button
      Then i should verify newUserAdmin in the list

      Scenario: login with the new user name
        Given i click on Welcome Paul dropdown
        When i select Logout link
        And i should see home base login page again
        And i write new created username
        And  i write new created password
        And i click on the login button
        Then i should verify that i am logged in

        Scenario: find username and delete it
          Given i click on Admin header link
          When i write new admins name
          And i click on search button
          And i select Admin from the checkBox
          And i click on Delete button
          And i click on Ok button
          Then i should see verification message



          Scenario: find element by name and delete it
            Given i click on PIM link header
            When write the name of employee
            And i click on Search button
            And i should see the name on the search list
            And i select the check box for the name
            And i click on the delete button
            And i click on ok button
            Then i should verify delete message



            Scenario: find element by Id
              Given i click on PIM header link
              When i write an id on the ID input box
              And i click on the search button
              And i should see element appeared on the search list
              And i click on the Reset button
              Then i should see all employee list









