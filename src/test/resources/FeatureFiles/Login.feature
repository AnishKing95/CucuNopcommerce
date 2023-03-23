Feature: Verify the login Funtionality

Background: open facebook page
 Given user enters into facebook page

  Scenario: Verify the login funtionality with valid credentials
  Given user enter valid username
  And user enter valid password
  When user selects login button
  Then facebook opens sussesfully
  
  Scenario Outline: Verify the login funtionality with Invalid credentials
   
    Given user enter invalid username as '<username>'
    And user enter invalid password as '<password>'
    When user selects login button
    Then user can see the warning message
    
    Examples:
    |username       |password|
    |Test@gmail.com |test123 |
    |demo@gmail.com |demo123 |
