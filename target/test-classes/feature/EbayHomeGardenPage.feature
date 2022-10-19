Feature: Testing the home-garden page

  Scenario: Check list format for item furniture on the home-garden page
    Given open home-garden page
    When choose item furniture
    And choose list format
    Then check opportunity to switch on gallery format

  @TestCase
  Scenario: Check filtering by new condition the home-garden page
    Given open home-garden page
    When choose item of category
    And choose filtering by condition
    Then check condition