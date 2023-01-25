package com.page;


import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;
import com.pageObjectRepo.LoginRepo;
import com.utility.PageUtility;

public class LoginPage extends LoginRepo {
	
	//initializing webElement by using constructor
	public LoginPage()
	{
		//here I take <BaseClass.webDriver.get()> reference object for (return)
		//getting  <driver> object we store in local thread class means <webdriver.set(driver)>  
		PageFactory.initElements(BaseClass.webDriver.get(), this);
		
	}
	

	//for accessing customize method from page utility class
	PageUtility pUtils= new PageUtility(BaseClass.webDriver.get());
	
	//Utilization of webElement
	public void setUserName(String uname)
	{
		 setTxtEmail(getTxtEmail());//storing webElement
		 pUtils.sendKeys(getTxtEmail(), uname);
		
	}
	
	public void setUserPassword(String pass)
	{
		
		setTxtPassword(getTxtPassword());
		pUtils.sendKeys(getTxtPassword(), pass);
	}
	
	public void clickLogin()
	{
		
		pUtils.click(btnLogin, BaseClass.webDriver.get());
		
	}
	
	public void clickLogout()
	{
		pUtils.click(btnLogout, BaseClass.webDriver.get());
		
	}

}
