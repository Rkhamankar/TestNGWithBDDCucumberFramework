package com.stepDef;

import org.testng.Assert;

import com.base.BaseClass;
import com.page.LoginPage;
import com.utility.Util;
import io.cucumber.java.en.*;

public class LoginStep extends BaseClass {
	
	LoginPage lp = new LoginPage();
	
	//Implementing all d step from feature file
	
	@Given("User launch application")
	public void user_launch_application() {
	    
	    openPage(Util.readProperties("url"));//reading properties file for url
	}

	@When("User enters Email as {string}  and Password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pass) {
	    
	    lp.setUserName(uname);
	    lp.setUserPassword(pass);
	}

	@When("Click on Login")
	public void click_on_login() {
	    lp.clickLogin();
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expTitle) {
		String actTitle=webDriver.get().getTitle();
		
		log.info("After login Title is  :- "+actTitle);
		
		Assert.assertEquals(actTitle, expTitle);
	    
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws Exception {
	    
		Thread.sleep(3000);
        lp.clickLogout();
		
		String pageTitle=webDriver.get().getTitle();
		
		log.info("After logout Title is :- "+pageTitle);
	}

	

}
