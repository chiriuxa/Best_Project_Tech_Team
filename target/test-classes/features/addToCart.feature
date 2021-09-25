@MyScenarios
Feature: Verify the carts price

  @yourLogo
  Scenario: Verify the carts price
  Given I am in the Your Logo web page
    And Faded Short Sleeve T-shirts to hover over it
    When i click on Add to cart button
    And i click on proceed to checkout  button
    Then i should see the total price is correct

    @email
    Scenario: Verify links and confirm email
      Given navigating to the Home page
      When click the header WOMEN link
      And click on the dropdown and select index 2
      And Click on the Grid view
      And Click on the object with the name Blouse
      And Click to quantity increase
      And Select the medium size from drop down
      And click on the color white box
      And click on Add to cart button
      And click on the continue shopping button
      And click to the send to friend link text
      And write the name of a friend in the input
      And write the email of the friend
      And click on the send button
      Then confirm the message appears on the screen








