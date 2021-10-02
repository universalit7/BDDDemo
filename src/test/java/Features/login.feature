
Feature: Login Action

  Scenario Outline: Successful Login with valid Credentials
    Given User is on the home page
    When User is on login page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully

    Examples:
      |username  | password