@createNewTask
Feature: as a sales person
I should be able to create new Tasks

Scenario: Crate new Tasks
Given  logged in "user"
Then click on Tasks Menu
And click on New Task button
Then fillout Tasks Information fields
|Fields|                |Values|
|Subject| 			    |Test data forms|
|DueDate|				|15/12/2015|
|Comments|				|Test|
|Priority|				|Normal|
|Status|				|Open|

Then Save the Task