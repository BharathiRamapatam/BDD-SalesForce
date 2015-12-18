package com.cucumber.sales.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webconnector {
	//Initialise properties file
	public static Properties OR = null;
	public static Properties CONFIG = null;
	public static WebDriver driver = null;
	public static Logger APPLICATION_LOGS;
	public static Webconnector Selenium;
	
	
	//create a contructor of webconnector class
	public Webconnector(){
		
		 APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		 APPLICATION_LOGS.debug("Hello from logger");
		 APPLICATION_LOGS.debug("initilising properties files ");
		 
		
		if(OR==null){
			try{
				// initialize OR
				OR = new Properties();
				FileInputStream fs  = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\cucumber\\sales\\config\\OR.properties");
				OR.load(fs);
				
				// initialize CONFIG to corresponding env
				CONFIG= new Properties();
				fs  = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\cucumber\\sales\\config\\prod_config.properties");
				CONFIG.load(fs);
				
				System.out.println(OR.getProperty("login_link"));
				System.out.println(CONFIG.getProperty("prodUrl"));
				
				
			}catch(Exception e){
				System.out.println("Error on intializing properties files");
			}
			
			
			
		}
		
	}
		
	//open browser
	public void openBrowser(){
		
		Object browserType = CONFIG.getProperty("browserType");
		if(browserType.equals("Mozilla")){
			driver = new FirefoxDriver();
		}else if(browserType.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharathi.ramapatnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			}else if(browserType.equals("IE")){
			// set the IE server exe path and initialize
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//IE//IEDriverServer.exe");	
		}
		// max
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		
		
	}
	//navigate to url
	public void navigate(String url){
		APPLICATION_LOGS.debug("Navigating to url");
		driver.navigate().to(CONFIG.getProperty(url));
		
	}
	public void click(String button){
		try{
		driver.findElement(By.id(OR.getProperty(button))).click();
		}catch (Exception  e){
			System.out.println(e);
		}
		}
		
		public void input(String input_box, String inputString){
			try{
			driver.findElement(By.id(OR.getProperty(input_box))).sendKeys(inputString);
			}catch (Exception  e){
				System.out.println(e);
			}
		}
		public String getText(String element){
			 driver.findElement(By.id(OR.getProperty(element))).getText();
			 return "";
			
		}
		public void ValidLogin(String Username, String Password){
			APPLICATION_LOGS.debug("execution login functiion from webconnector");
			try{
			driver.findElement(By.id(OR.getProperty("login_button"))).click();
			driver.findElement(By.id(OR.getProperty("username_input"))).sendKeys(Username);
			driver.findElement(By.id(OR.getProperty("password_input"))).sendKeys(Password);
			driver.findElement(By.id(OR.getProperty("login_submitButton"))).click();
			//driver.findElement(By.cssSelector(OR.getProperty("profile_link"))).click();
			//String actual = driver.findElement(By.xpath(OR.getProperty("profile_textElement"))).getText();
			//APPLICATION_LOGS.debug("logged in as " +" " +actual);
			}catch (Exception e ){
				System.out.println(e);
			}
			
		}
		public void logout(){
			APPLICATION_LOGS.debug("Executing logout function");
			String afterLogin = driver.getTitle();
		   driver.findElement(By.cssSelector(OR.getProperty("profile_link"))).click();
		   driver.findElement(By.linkText("Log Out")).click();
		   //String actual = "Login | Salesforce";
		  String title = driver.getTitle();
		   System.out.println(title);
		  // Login | Salesforce

		  if(!afterLogin.equals(title)){
			  System.out.println("log out successful");
		  }else{
			  System.out.println("Error");
		  }
			  
			  
		  }
	//wait 	  
		
  public static void waitUtilElementPresent(String element){
   WebDriverWait wait_iframe = new WebDriverWait(driver, 20000);

		  wait_iframe.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(element))));
		 // WebDriverWait wait = new WebDriverWait(driver, 15);
		  //wait.until(ExpectedConditions.titleContains(": MyTest"));
		  //- See more at: http://software-testing-tutorials-automation.blogspot.ie/2014/01/selenium-webdriver-wait-for-title-with.html#sthash.1OP6ZL3t.dpuf
		}
  //java script to execute click on element
  public static void javaScripttoClickOnElement(String element){
  WebElement ele = driver.findElement(By.xpath(element));
  JavascriptExecutor executor = (JavascriptExecutor)driver;
  executor.executeScript("arguments[0].click();", ele);	
  }
		
		
		
			
			
		
		
		
	
	
	
	

}
