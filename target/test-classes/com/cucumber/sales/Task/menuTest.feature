@menuTest
Feature: Logged in as Sales person
One should have access to menu tabs
  
    Scenario: access to Menu tag
    #Given logged in as user
    #Then user should have access to Home page
    #And Opportunity page
    #And Tasks page
    #And Leads page
    #And Notes page
    #And Accounts page
    #And Contacts page
    #And Dashboards page
    #And Reports page
    #And Groups page
    #And Calendar page
    #And People page
    #And Cases page
    
 
Scenario: From Feeds Page user can upload a file

Given logged in as user
Then navigate to "Feed_link" Page
Then click on "File_button"
And click on upload button to upload a "C:\\Users\\bharathi.ramapatnam\\Documents\\Admin\\CERTS\\createNewTaskSalesForce.PNG" 
Then upload file


    
    
    
