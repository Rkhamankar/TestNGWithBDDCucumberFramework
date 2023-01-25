package com.page;

import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pageObjectRepo.CustomerAddRepo;
import com.utility.PageUtility;

public class CustomerAddPage extends CustomerAddRepo {
	
	
	//initializing webElement by using constructor
	public CustomerAddPage()
	{
		PageFactory.initElements(BaseClass.webDriver.get(), this);
	}
	
	//for accessing customize method from page utility class
	PageUtility pUtils = new PageUtility(BaseClass.webDriver.get());
	
	//Utilization of webElement
	
	public void clickOnCustomerMenu()
	{
		pUtils.click(lnkCustomers_menu, BaseClass.webDriver.get());
	}
	
	public void clickOnCustomerMenuItem()
	{
		pUtils.click(lnkCustomers_menuitem, BaseClass.webDriver.get());
	}
	
	public void clickOnAddnew()
	{
		pUtils.click(btnAddnew, BaseClass.webDriver.get());
	}
	
	public void setEmail(String email)
	{
		pUtils.sendKeys(txtEmail, email);
	}
	
	public void setPassword(String pass)
	{
		pUtils.sendKeys(txtPassword, pass);
	}
	
	public void setFName(String fName)
	{
		pUtils.sendKeys(txtFname, fName);
	}
	
	public void setLName(String lName)
	{
		pUtils.sendKeys(txtLname, lName);
	}
	
	
	public void setManagerOfVendor(String value)
	{
		pUtils.selectOptionFromDropDown(drpmgrOfVendor, value);
	}
	
	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			pUtils.click(rdMaleGender, BaseClass.webDriver.get());
		}
		
		else if(gender.equals("Female"))
		{
			pUtils.click(rdFemaleGender, BaseClass.webDriver.get());
		}
		
		else
		{
			pUtils.click(rdMaleGender, BaseClass.webDriver.get());//default
		}
		
	}
	
	public void setDob(String dob)
	{
		pUtils.sendKeys(txtDob, dob);
	}
	
	public void setCompanyName(String cmpnm)
	{
		pUtils.sendKeys(txtCompanyName, cmpnm);
		
	}
	
	public void setAdminContent(String content)
	{
		pUtils.sendKeys(txtAdminContent, content);
		
	}
	
	public void clickOnSave()
	{
		pUtils.click(btnSave, BaseClass.webDriver.get());
	}
}
