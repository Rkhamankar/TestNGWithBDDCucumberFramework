package com.utility;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public abstract class MethodAbstract extends BaseClass {
	
	//for driver initializing
	public WebDriver driver=webDriver.get();
	
	public MethodAbstract(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//I m creating abstract method for achieving abstraction with the help of customize method class
	
	public abstract String getText(WebElement element);
	
	public abstract void sendKeys(WebElement element, String value);
	
	//Overloading concept are use here for achieving polymorphism 
	
	public abstract void sendKeys(By by, String value);
	
	public abstract void click(WebElement element , WebDriver driver);
	
	public abstract void selectOptionFromDropDown(WebElement dropdown, String option);

	public abstract void switchToWindow(WebDriver driver, String parentWin, Set<String> allWin, String title );
	
	public abstract void alertAccept(WebDriver driver) throws Exception;
	
	public abstract void radioButton(List<WebElement> radio, String text);
	
	public abstract void checkBox(List<WebElement> checkBox, List<String> listText);
}
