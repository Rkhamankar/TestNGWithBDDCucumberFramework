package com.hook;

import com.base.BaseClass;
import com.utility.Util;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	

	@Before
	public void beforeScenario(Scenario scenario)
	{
		launchDriver();
		log.info("Scenario Executing Start :-"+scenario.getName());
		
	}

	
	@After
	public void afterScenario(Scenario scenario)
	{
		 //validate if scenario has failed
        if(scenario.isFailed()) {
		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
        }
        System.out.println("Scenario Executing Finish :-"+scenario.getName());
		tearDown();
	}
}
