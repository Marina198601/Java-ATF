Feature: Login functionallity
  @UI @Run
  Scenario:Valid login functionallity
    Given user insert username
    And user insert password
    When user clicks on Login button
    Then user is redirect to homepage
    And user clicks on logOut button


  Scenario: Invalid login functionallity