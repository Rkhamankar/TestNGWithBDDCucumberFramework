package com.hook;

import com.base.BaseClass;
import com.utility.Util;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	//every test scenario execution before this method is executed

	//just like @beforeMethod
	@Before
	public void beforeScenario(Scenario scenario)
	{
		launchDriver();
		log.info("Scenario Executing Start :-"+scenario.getName());
		
	}

	//just like @afterMethod
	@After
	public void afterScenario(Scenario scenario)
	{
		 //validate if scenario has failed
        if(scenario.isFailed()) {
		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
        }
        log.info("Scenario Executing Finish :-"+scenario.getName());
		tearDown();
	}
}
