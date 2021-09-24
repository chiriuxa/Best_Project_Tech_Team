@OrangePage
Feature: Login and Admin verification feature

#    Examples:
#      |username| |password|
#      |Admin| |admin123|

  Scenario: Orange HRM page
Given I am on Orange page
  When I insert login
    And I insert password
    And I click to Login
    And I click to Marketplace
    And I click request for Claim LDAP
    And I insert my email
    And I insert number
    And Organization
    And I click to Ok
    Then I should see OrangeHRM

    Scenario: Orange HRM home page
      Given I click to Buzz
      And I put like on Garry White post
      And I add comment
      And I share his post
      And I click to Share
      Then I should see Success !

      Scenario:Orange HRM home Page
        Given  I click to Directory
        And I insert Odis Adalwin in name place
        And I click to search
        Then I should see Odis Adalwin

        Scenario: Orange HRM Home Page
          Given I click to Maintenance
          And I insert password in Verify Password
          And I click to verify
          And I look past record for Odis Adwalin
          And I click to search
          Then I should see Select Records to Delete



          Scenario: Orange Home page
            Given I click To Buzz
            And I click to Share Video
            And I insert the link of video
            And I click to Save Video
            Then I should see the video that I posted

            Scenario:









