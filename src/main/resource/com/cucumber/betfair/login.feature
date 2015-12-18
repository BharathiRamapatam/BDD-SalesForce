Feature : Logging into Salesforce

In order to work
As a sales person
I want to login

Scenario:Logging in Salesforce

Given I go to "http://www.salesforce.com/eu/" on "Mozilla"
And I enter "username" as "bharathi.ramapatnam@gmail.com"
And I enter "password" as 'Testing@2015'
And I click on Submit
Then I should have logged in 


