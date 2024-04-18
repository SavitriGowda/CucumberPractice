Feature: feature to test Google Search Functionality

Scenario: Validate Google Search Working

Given browser is open
And user is on google search page
When user enter text in search box
And hits enter
Then user navigated to the serach results page