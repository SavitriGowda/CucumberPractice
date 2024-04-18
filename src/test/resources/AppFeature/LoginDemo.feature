Feature: Test Login functionality

  Scenario Outline: Check login functionality with credentials
  
    Given Browser is open
    And User on login page
    When user enter <username> and <password>
    And user click on login button
    Then navigate to the homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Savitri  | 123as    |
