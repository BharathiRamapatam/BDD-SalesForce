@validLogin
Feature: Logging into Salesforce
  In order to work as a sales person
  I want to login as Salesperson
  
    Scenario: Log into Salesforce
    Given the "prodUrl" 
    Then I click on "login_button" button
    Then I enter "username_input" as "bharathi.ramapatnam@gmail.com"
    And I enter "password_input" as "Testing@2015"
    When I click on "login_submitButton" 
    Then I am successfuly logged in as "bharathi ram" 
    When User LogOut from the Application
    Then Message displayed LogOut Successfully    
    
