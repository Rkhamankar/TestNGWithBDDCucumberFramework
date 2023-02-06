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

public class CustomizeMethod extends MethodAbstract {

	
	
	//explicit wait for find out the element maximum time is 
	public  WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public CustomizeMethod(WebDriver driver) {
		
		super(driver);
		
	}

	//Overriding concept are use because of i m giving here body definition to 
	//the abstract method here for achieving polymorphism 
	
	@Override
	public String getText(WebElement element) {
		
	    wait.until(ExpectedConditions.visibilityOf(element));
		String text=element.getText();
		return text;
	}

	@Override
	public void sendKeys(WebElement element, String value) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
		
	}

	@Override
	public void sendKeys(By by, String value) {
		
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(value);
		
	}

	@Override
	public void click(WebElement element, WebDriver driver) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		
	}

	@Override
	public void selectOptionFromDropDown(WebElement dropdown, String option) {
		
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		Select select= new Select(dropdown);
		select.selectByVisibleText(option);
		log.info("Dropdown Total element count :- "+select.getOptions().size());
		
	}

	@Override
	public void switchToWindow(WebDriver driver, String parentWin, Set<String> allWin, String title) {
		
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

	@Override
	public void alertAccept(WebDriver driver) throws Exception {
		
		Alert al=driver.switchTo().alert();
		log.info("Alter message is display :- "+al.getText());
		Thread.sleep(2000);
		al.accept();
		
	}

	@Override
	public void radioButton(List<WebElement> radio, String text) {
		
		wait.until(ExpectedConditions.visibilityOfAllElements(radio));
		
		for (WebElement  element: radio) {
			
			if(element.getAttribute("Value").equals(text))
			{
				element.click();
				break;
			}
			
		}
		
	}

	@Override
	public void checkBox(List<WebElement> checkBox, List<String> listText) {
		
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
