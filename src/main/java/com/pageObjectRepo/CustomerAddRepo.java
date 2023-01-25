package com.pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class CustomerAddRepo {
	// Declaring the element by @FindBy notation
	
	@FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
	public WebElement lnkCustomers_menu;
	
	@FindBy(xpath = "//p[text()=' Customers']")
	public WebElement lnkCustomers_menuitem;
	
	@FindBy(xpath = "//i[@class='fas fa-plus-square']")
	public WebElement btnAddnew;
	
	
	// i am declaring the all element in by class for taking in driver.findelement method
	
	public By txtEmail=By.id("Email");
	public By txtPassword=By.id("Password");
	public By txtFname=By.id("FirstName");
	public By txtLname=By.id("LastName");
	
	// Declaring the element by @FindBy notation
	// using here css selector for finding the web element
	@FindBy(css ="div[class='k-widget k-multiselect k-multiselect-clearable k-state-hover'] div[role='listbox']" )
	public WebElement txtCustomerRole;
	
	@FindBy(xpath = "//li[contains(text(),'Administrators')]")
	public WebElement listItemAdministrators;
	
	@FindBy(xpath = "//li[contains(text(),'Registerd')]")
	public WebElement listItemRegisterd;
	
	@FindBy(xpath = "//li[contains(text(),'Guest')]")
	public WebElement listItemGuest;
	
	@FindBy(xpath = "//li[contains(text(),'Vendors')]")
	public WebElement listItemVendors;
	
	// here I m using id locator
	
	@FindBy(id = "VendorId")
	public WebElement drpmgrOfVendor;
	
	@FindBy(id = "Gender_Male")
	public WebElement rdMaleGender;
	
	@FindBy(id = "Gender_Female")
	public WebElement rdFemaleGender;
	
	@FindBy(id = "DateOfBirth")
	public WebElement txtDob;
	
	@FindBy(id = "Company")
	public WebElement txtCompanyName;
	
	@FindBy(xpath = "//textarea[@id='AdminComment']")
	public WebElement txtAdminContent;
	
	//by using name locator
	@FindBy(name = "save")
	public WebElement btnSave;
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

}
