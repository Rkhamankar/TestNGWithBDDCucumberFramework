package com.page;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pageObjectRepo.CustomerAddRepo;
import com.utility.CustomizeMethod;


public class CustomerAddPage extends CustomerAddRepo {
	
	
	//initializing webElement by using constructor
	public CustomerAddPage()
	{
		PageFactory.initElements(BaseClass.webDriver.get(), this);
	}
	
	//for accessing customize method from page utility class
	CustomizeMethod method= new CustomizeMethod(BaseClass.webDriver.get());
	
	//Utilization of webElement
	
	public void clickOnCustomerMenu()
	{
		method.click(lnkCustomers_menu, BaseClass.webDriver.get());
	}
	
	public void clickOnCustomerMenuItem()
	{
		method.click(lnkCustomers_menuitem, BaseClass.webDriver.get());
	}
	
	public void clickOnAddnew()
	{
		method.click(btnAddnew, BaseClass.webDriver.get());
	}
	
	public void setEmail(String email)
	{
		method.sendKeys(txtEmail, email);
	}
	
	public void setPassword(String pass)
	{
		method.sendKeys(txtPassword, pass);
	}
	
	public void setFName(String fName)
	{
		method.sendKeys(txtFname, fName);
	}
	
	public void setLName(String lName)
	{
		method.sendKeys(txtLname, lName);
		
	}
	
	
	public void setManagerOfVendor(String value)
	{
		method.selectOptionFromDropDown(drpmgrOfVendor, value);
	}
	
	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			method.click(rdMaleGender, BaseClass.webDriver.get());
		}
		
		else if(gender.equals("Female"))
		{
			method.click(rdFemaleGender, BaseClass.webDriver.get());
		}
		
		else
		{
			method.click(rdMaleGender, BaseClass.webDriver.get());//default
		}
		
	}
	
	public void setDob(String dob)
	{
		method.sendKeys(txtDob, dob);
	}
	
	public void setCompanyName(String cmpnm)
	{
		method.sendKeys(txtCompanyName, cmpnm);
		
	}
	
	public void setAdminContent(String content)
	{
		method.sendKeys(txtAdminContent, content);
		
	}
	
	public void clickOnSave()
	{
		method.click(btnSave, BaseClass.webDriver.get());
	}
}
