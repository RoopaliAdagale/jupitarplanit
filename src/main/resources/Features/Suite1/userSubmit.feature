#Author Roopali Adagale
@Regression
Feature: Validate successful submission message
  As a User
  I want to fill all the details on contact page
  So that the mandatory field will be  fill up correctly and will check successfully submit form

  Scenario Outline: Validate and Verify errors messages
    Given I am already on "<Header>" application Home screen
    When I navigate to Screen Contact
    Then I assert Submit button is presented on screen Contact
    When I set Forename "<uname>" Email "<uemail>" Message "<umsg>"
    And I click button Submit on screen contact
    Then I verify successful message on screen contact


    Examples:
      | uname   | Header       | uemail        | umsg       |
      | Roopali | Jupiter Toys | abc@gmail.com | Hello Test |