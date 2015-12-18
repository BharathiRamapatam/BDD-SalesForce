package com.cucumber.sales.Task;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



//runner class

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:output"},
dryRun = false, // dry run the tests
monochrome = true,//set clean format for test result

tags = {"@menuTest"})//what tags to include(@)/exclude(@~)
public class MenuRunner {
	

}
