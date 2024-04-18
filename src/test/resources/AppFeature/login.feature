@
Feature: feature to testlogin functionality
	@smoketest
  Scenario: Check login is successfully valid credentials
    Given user is on login page
    When user enetrs username and password
    And click on login button
    Then user is navigated to the homepage
