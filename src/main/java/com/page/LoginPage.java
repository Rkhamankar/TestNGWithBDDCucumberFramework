package com.page;


import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;
import com.pageObjectRepo.LoginRepo;
import com.utility.PageUtility;

public class LoginPage extends LoginRepo {
	
	public LoginPage()
	{
		//here I take <BaseClass.webDriver.get()> reference object for (return)
		//getting  <driver> object we store in local thread class means <webdriver.set(driver)>  
		PageFactory.initElements(BaseClass.webDriver.get(), this);
		
	}
	
	public void setUserName(String uname)
	{
		 setTxtEmail(getTxtEmail());//storing webElement
		 PageUtility.sendKeys(getTxtEmail(), uname);
		
	}
	
	public void setUserPassword(String pass)
	{
		
		setTxtPassword(getTxtPassword());
		PageUtility.sendKeys(getTxtPassword(), pass);
	}
	
	public void clickLogin()
	{
		
		PageUtility.click(btnLogin, BaseClass.webDriver.get());
		
	}
	
	public void clickLogout()
	{
		PageUtility.click(btnLogout, BaseClass.webDriver.get());
		
	}

}
