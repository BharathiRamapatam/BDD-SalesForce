@invlidLogin
Feature: Invalid Logging into Salesforce
  On enterning invalid enteries 
  login should be not possible
  
    Scenario Outline: Invalid Log into Salesforce
    Given the "prodUrl" 
    Then I click on "login_button" button
    Then I enter "username_input" as "<username>"
    And I enter "password_input" as "<password>"
    When I click on "login_submitButton" 
    Then I should get "<errorMessage>"
  
  Examples: 
  |username|                        |password|      |errorMessage|
  |bharathi.ramapatnam@gmail.com|   ||				|Please enter your password.|
  ||								|Testing@2015|	|Please enter username.|
  |bharathi|						|Testing@2015|  |Please check your username and password. If you still can't log in, contact your Salesforce administrator.|