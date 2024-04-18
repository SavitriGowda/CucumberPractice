Feature: Check homepage functionality

  Background: user is logged in
    Given user is on login page
    When user enter username and password
    Then user click on login button
    And user is navigated to homepage

  Scenario: Check logout link
    When User click on welcome link
    Then logout link is displayed

  Scenario: Verify quick launch toolbar is present
    When user click on dashboard link
    Then Quick launch toolbar is displayed
