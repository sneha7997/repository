Feature: Login Action

Scenario Outline: successfull login with valid credentials
    Given user will open the application
    And user click on signin link
     When user enters "<username>" and "<password>"
    Then Message displayed login successfully
    
Examples:
    | username | password    |
    | lalitha  | password123 |
    | admin    | password456 |