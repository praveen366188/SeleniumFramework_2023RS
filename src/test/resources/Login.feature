Feature: Instagram Automation
  Automating instagram and verifying some scenarios

  Scenario: Login with valid username and password
    Given User Enter Username
    And User Enter Password
    When User Click Login Button
    Then User See Home Page
    And We are sending mail to the user