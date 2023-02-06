package com.runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/features",
		glue={"com.stepDef","com.hook"},
	    dryRun=false,//Feature file compile and it is true then stepdef class is executed 
	   // tags = "@Single and not @Multiple ",// specific test case @tags name are use here
	    monochrome=true,
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	
		)


//implementation of cucumber and testng

public class RunnerClass extends AbstractTestNGCucumberTests {


	
}
