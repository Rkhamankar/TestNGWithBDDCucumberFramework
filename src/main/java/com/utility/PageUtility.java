package com.utility;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;


//method class
public class PageUtility extends BaseClass  {
	
	
	//for driver initializing
	public  WebDriver driver=webDriver.get();
	
	//explicit wait for find out the element maximum time is 
	public  WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public PageUtility(WebDriver driver)
	{
		this.driver=driver;
		
		}
	
	
	public String getText(WebElement element)
	{

		wait.until(ExpectedConditions.visibilityOf(element));
		
		String text=element.getText();
		return text;
		
		
	}
	
	public void sendKeys(WebElement element, String value)
	{

		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
	}
	
	public void sendKeys(By by, String value)// method overloading
	{
		
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(value);
	}
	public void click(WebElement element , WebDriver driver)
	{
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void selectRadioButton(List<WebElement> element, String value)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		for(WebElement ele:element)
		{
			if(ele.getAttribute("value").equalsIgnoreCase(value))
			{
				ele.click();
				break;
			}
		}
		
		
	}
	
	public void selectOptionFromDropDown(WebElement dropdown, String option)
	{
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		Select select= new Select(dropdown);
		select.selectByVisibleText(option);
		log.info("Dropdown Total element count :- "+select.getOptions().size());
		
		
	}
	
	public void switchToWindow(WebDriver driver, String parentWin, Set<String> allWin, String title )
	{

		for(String windows:allWin)
		{
			if(!windows.equals(parentWin))
			{
	             driver.switchTo().window(windows);
	             if(driver.getTitle().equalsIgnoreCase(title))
	            	
	            	System.out.println("Title:- "+driver.getTitle());
				    System.out.println("Title:- "+driver.getCurrentUrl());
				    System.out.println("Title:- "+driver.getWindowHandle());
				    driver.close();
				}
			
			driver.switchTo().window(parentWin);
			}
		}
	
	public void alertAccept(WebDriver driver) throws InterruptedException
	{
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
	}
	
	public void radioButton(List<WebElement> radio, String text)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(radio));
		for (WebElement  element: radio) {
			
			if(element.getAttribute("Value").equals(text))
			{
				element.click();
				break;
			}
			
		}
	}
	
	public void checkBox(List<WebElement> checkBox, List<String> listText)
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(checkBox));
			
          for(String text:listText) {
			
			 for (WebElement  element: checkBox){
					
				if(element.getAttribute("Value").equals(text))
				{
					element.click();
					break;
				}
				
				}
				
			}
	}
	
	
}
			


