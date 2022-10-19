Feature: Testing the electronics page

  Scenario: Check auction_s buying format
    Given open electronics page
    When choose Camera-Drones in left menu shop by Category
    And choose Auction in main menu
    Then check buying format

  Scenario: Check item of category
    Given open electronics page
    When choose item See all in Smart Home Devices in menu of category
    Then check page Smart Home Devices
