Feature: Testing the main page

  Scenario Outline: Check search of product item
    Given open main page
    When enter '<keyword>' and search
    Then check '<exp_item>' in list
    Examples:
      | keyword | exp_item |
      | Samsung | Samsung  |
      | Cisco   | Cisco    |
      | Sony    | Sony     |
      | Apple   | Apple    |
      | Mavic   | Mavic    |


  Scenario: Check shopping by categories
    Given open main page
    When open menu for shopping by categories
    And choose item of all categories
    Then check page with list of all categories


