package com.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.utility.Util;




public class BaseClass {
	// I use LocalThread class for storing WebDriver and using set() and get () method
   public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
  
   public static WebDriver driver=null;
   
   public final static int TIMEOUT = 40;
   
   public static Logger log=Logger.getLogger(BaseClass.class);
	
	public static void launchDriver()
	{
		if(Util.readProperties("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		
		log.info("::::Maximizing Window::::");
		driver.manage().window().maximize();
		
		//page is fully loaded then wait for before throwing the exception wait until time
		
		log.info(":::::Applying Waits::::");
		driver.manage().timeouts().implicitlyWait(TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
		
		
		webDriver.set(driver);
		
		}
		
		else
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			log.info("::::Maximizing Window::::");
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			
			log.info(":::::Applying Waits::::");
			driver.manage().timeouts().implicitlyWait(TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
			webDriver.set(driver);
		}
		
		}
	
	public static void openPage(String url) {
       
		webDriver.get().get(url);
		
        }
	
	
	
	
	public static void tearDown()
	{
		log.info("::::Active Browser is close::::");
		
		webDriver.get().close();
		
		log.info("::::All Browser is quit::::");
		
	    webDriver.get().quit();
	}


}
