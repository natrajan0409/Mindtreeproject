@tag
Feature: Go to The petStore 
  Create a new user account if we dont have exising  username  password in property file

  @tag1
    Scenario Outline: Jpetstore account creation  
    Given I want to goto Jpetstore 
    And  Click on Sighin button
    Then Verify  that sighin page displayed 
    When Click on  need a  new username and password regirester Link 
    Then Verify  that registration page displayed
    And Enter the <userID>
    And Enter the <newpassword> 
    And Enter the <Repeatpassword> 

 Examples: 
      | userID  | newpassword | Repeatpassword  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step
    
    Examples: 
      | name | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
    