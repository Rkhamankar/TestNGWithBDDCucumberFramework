package com.stepDef;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.BaseClass;
import com.page.CustomerAddPage;

import io.cucumber.java.en.*;

public class CustomerAddStep extends BaseClass {
	
	//Implementing all d step from feature file
	CustomerAddPage cap= new CustomerAddPage();
	
	@When("User click on customers menu")
	public void user_click_on_customers_menu() {
	    
	   cap.clickOnCustomerMenu();
	   
	   log.info("Title of the page :- "+webDriver.get().getTitle());
	}

	@When("Click on customer menu item")
	public void click_on_customer_menu_item() {
	    
	   cap.clickOnCustomerMenuItem();
	}

	@When("Click on Add new button")
	public void click_on_add_new_button() {
	    
	   cap.clickOnAddnew();
	   
	   log.info("Title of the page :- "+webDriver.get().getTitle());
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	    
		 Assert.assertEquals(webDriver.get().getTitle(), "Add a new customer / nopCommerce administration");
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws Exception {
	    
	   cap.setEmail("Abc@gmail.com");
	   
	   cap.setPassword("Ra12345");
	   
	   Thread.sleep(3000);
	   
	   cap.setManagerOfVendor("Vendor 2");
	   cap.setGender("Male");
	   cap.setFName("Shahrukh");
	   cap.setLName("Pathan");
	   cap.setDob("12/31/1996");//formate:- mm/dd/yyyy
	   cap.setCompanyName("India Pvt Ltd");
	   cap.setAdminContent("This is for automation");
	}

	@When("Click on save button")
	public void click_on_save_button() throws Exception {
	    
		cap.clickOnSave();
		Thread.sleep(3000);
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String message) throws Exception {
	    
		String actMsg=webDriver.get().findElement(By.tagName("body")).getText();
		
		log.info("Actual message is display :- "+actMsg);
		
		Assert.assertTrue(webDriver.get().findElement(By.tagName("body")).getText()
				.contains(message));
		
		Thread.sleep(5000);
	   
	}


}
