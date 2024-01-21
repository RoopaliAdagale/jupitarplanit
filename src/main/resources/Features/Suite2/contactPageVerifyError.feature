#Author Roopali Adagale
@sanity
Feature: Verify error message of contact page
  As a User
  I want to check all the error message of contact page
  So that the mandatory field will be populated and filled correctly and will check error will gone

  Scenario Outline: Validate and Verify errors messages
    Given I am already on "<Header>" application Home screen
    When I navigate to Screen Contact
    Then I assert Submit button is presented on screen Contact
    When I click button Submit on screen contact
    Then I assert Forename "<error>" Email "<emailerror>" Message "<msgError>" presented on screen Contact
    When I set Forename "<uname>" Email "<uemail>" Message "<umsg>"
    And I click button Submit on screen contact
    Then I assert Forename errors are not presented on screen Contact


    Examples:
      | uname   | error                | Header       | emailerror        | msgError            | uemail        | umsg       |
      | Roopali | Forename is required | Jupiter Toys | Email is required | Message is required | abc@gmail.com | Hello Test |
