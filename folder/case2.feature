Feature: Login Action
Scenario Outline: Successful Login with valid credentials

Given user open the application
When user click on sign in link
And user enters "<username>" and "<password>"
Then Message displayed Login successfully

Examples:
      | username | password   |
      | jiuiocnioc  | cemndi897|
      | admin    | password456|
      
      