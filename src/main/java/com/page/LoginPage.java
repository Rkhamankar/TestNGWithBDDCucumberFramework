package com.page;


import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;
import com.pageObjectRepo.LoginRepo;
import com.utility.CustomizeMethod;


public class LoginPage extends LoginRepo {
	
	//initializing webElement by using constructor
	
	public LoginPage()
	{
		//here I take <BaseClass.webDriver.get()> reference object for (return)
		//getting  <driver> object we store in local thread class means <webdriver.set(driver)>  
		
		PageFactory.initElements(BaseClass.webDriver.get(), this);
		
	}
	

	//for accessing customize method from page utility class
	
	//PageUt pUtils= new PageUtility(BaseClass.webDriver.get());
	
	CustomizeMethod method= new CustomizeMethod(BaseClass.webDriver.get());
	
	//Utilization of webElement
	
	public void setUserName(String uname)
	{
		 setTxtEmail(getTxtEmail());//storing webElement
		 method.sendKeys(getTxtEmail(), uname);
		
	}
	
	public void setUserPassword(String pass)
	{
		
		setTxtPassword(getTxtPassword());
		method.sendKeys(getTxtPassword(), pass);
	}
	
	public void clickLogin()
	{
		
		method.click(btnLogin, BaseClass.webDriver.get());
		
	}
	
	public void clickLogout()
	{
		method.click(btnLogout, BaseClass.webDriver.get());
		
	}

}
