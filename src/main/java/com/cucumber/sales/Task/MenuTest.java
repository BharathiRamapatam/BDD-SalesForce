package com.cucumber.sales.Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.sales.util.Webconnector;
import com.thoughtworks.selenium.Selenium;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class MenuTest  extends Webconnector{
	Webconnector Selenium = new Webconnector();
	
	@Before
	public void lauchBrowser(){
		//System.out.println(CONFIG.getProperty("browserType"));
		String browserType = "Chrome";
		//Selenium.openBrowser(browser);
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
	@After
	public void closeBrowser(){
		//driver.close();
	}
	
	
	
	@Given("^logged in as user$")
	public void logged_in_as_user() {
		APPLICATION_LOGS.debug("Executing create Menu test --- login");
		Selenium.navigate("prodUrl");
		Selenium.ValidLogin("bharathi.ramapatnam@gmail.com", "Testing@2015");
		
		//Selenium.navigate("prodUrl");
		
		
		
		
	   
	}

	@Then("^user should have access to Home page$")
	public void user_should_have_access_to_Home_page() throws InterruptedException{
		APPLICATION_LOGS.debug("Executing create Menu test --- access to homepage");
	   //driver.findElement(By.linkText("Home")).click();
	   String homepage_title = driver.getCurrentUrl();;
	   System.out.println(homepage_title);
	   //Assert.assertEquals(expected, homepage_title);
	   Thread.sleep(5000);
	   
	   
	}

	@Then("^Opportunity page$")
	public void opportunity_page() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		APPLICATION_LOGS.debug("Executing create Menu test --- access to ");
		   driver.findElement(By.xpath(OR.getProperty("Opportunities"))).click();
		   String Opportunity_title = driver.getCurrentUrl();;
		   System.out.println(Opportunity_title);
		   Thread.sleep(5000);
		   
		   
	}

	

	@Then("^Tasks page$")
	public void tasks_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to homepage");
		   driver.findElement(By.xpath(OR.getProperty("Task_link"))).click();
		   String TaskPAge_title = driver.getCurrentUrl();;
		   System.out.println(TaskPAge_title);
		   Thread.sleep(5000);
	}

	@Then("^Leads page$")
	public void leads_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to LEads page");
		   driver.findElement(By.xpath(OR.getProperty("Leads_link"))).click();
		   String Leads_title = driver.getCurrentUrl();;
		   System.out.println(Leads_title);
		   Thread.sleep(5000);
		
			}

	@Then("^Notes page$")
	public void notes_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to Notes page");
		   driver.findElement(By.xpath(OR.getProperty("Notes_link"))).click();
		   String Notes_title = driver.getCurrentUrl();
		   System.out.println(Notes_title);
		Thread.sleep(5000);
	}

	@Then("^Accounts page$")
	public void accounts_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to Notes page");
		   driver.findElement(By.xpath(OR.getProperty("Accounts_link"))).click();
		   String Accounts_title = driver.getCurrentUrl();
		   System.out.println(Accounts_title);
		   Thread.sleep(5000);
	}

	@Then("^Contacts page$")
	public void contacts_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to contacts page");
		   driver.findElement(By.xpath(OR.getProperty("Contacts_link"))).click();
		   String contacts_title = driver.getCurrentUrl();
		   System.out.println(contacts_title);
		   Thread.sleep(5000);
		
	}

	@Then("^Dashboards page$")
	public void dashboards_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to Dashboard page");
		   driver.findElement(By.xpath(OR.getProperty("Dashboards_link"))).click();
		   String Dashboard_title = driver.getCurrentUrl();;
		   System.out.println(Dashboard_title);
		   Thread.sleep(5000);
		
	    
	}
	
	
	@Then("^Reports page$")
	public void reports_page() throws Throwable {
	    APPLICATION_LOGS.debug("Executing create Menu test --- access to Reports page");
		   driver.findElement(By.xpath(OR.getProperty("Feed_link"))).click();
		   String Feed_link_title = driver.getCurrentUrl();;
		   System.out.println(Feed_link_title);
		   Thread.sleep(5000);
	}

	@Then("^Groups page$")
	public void groups_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to groups page");
		   driver.findElement(By.xpath(OR.getProperty("Groups_link"))).click();
		   String Groups_link_title = driver.getCurrentUrl();;
		   System.out.println(Groups_link_title);
		   //scroll down 
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("scroll(0, 500)");
		   Thread.sleep(5000);
		
		
	}
	

	@Then("^Calendar page$")
	public void calendar_page() throws Throwable {
	    APPLICATION_LOGS.debug("Executing create Menu test --- access to Reports page");
		   driver.findElement(By.xpath(OR.getProperty("Calendar_link"))).click();
		   String Calendar_link_title = driver.getCurrentUrl();;
		   System.out.println(Calendar_link_title);
		   Thread.sleep(5000);
	}

	@Then("^People page$")
	public void people_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to Reports page");
		   driver.findElement(By.xpath(OR.getProperty("Peopele_link"))).click();
		   String Peopele_link_title = driver.getCurrentUrl();;
		   System.out.println(Peopele_link_title);
		   Thread.sleep(5000);
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("scroll(0, 250)");
		   Thread.sleep(5000);
	}

	@Then("^Cases page$")
	public void cases_page() throws Throwable {
		APPLICATION_LOGS.debug("Executing create Menu test --- access to cases page");
		   driver.findElement(By.xpath(OR.getProperty("Cases_link"))).click();
		   String Cases_link_title = driver.getCurrentUrl();;
		   System.out.println(Cases_link_title);
	}
	
	@Then("^navigate to \"([^\"]*)\" Page$")
	public void navigate_to_Page(String object) throws Throwable {
		APPLICATION_LOGS.debug("Navigating to Feeds page");
		driver.findElement(By.xpath(OR.getProperty(object))).click();
	    //Selenium.click(OR.getProperty(object));
	    
	}

	@Then("^click on \"([^\"]*)\"$")
	public void click_on(String object) throws Throwable {
		APPLICATION_LOGS.debug("clicking on feeds - file button");
		
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		
		
		  // Selenium.click(object);
	    
	}

	

	@Then("^click on upload button to upload a \"([^\"]*)\"$")
	public void click_on_to_upload_a(String file) throws IOException, InterruptedException{
		APPLICATION_LOGS.debug("click on upload button" );
		//javaScripttoClickOnElement(OR.getProperty("UploadFile_button"));
		driver.findElement(By.xpath("//ul[@class='oneActionsRibbon']/li")).click();
		//Thread.sleep(5000);
		//Runtime.getRuntime().exec("C:\\Users\\bharathi.ramapatnam\\Desktop\\AutoIT\\FileNew.exe");
		//driver.findElement(By.xpath("//ul[@class='oneActionsRibbon']/li")).sendKeys(file);
		
	}

@Then("^upload file$")
     public void uploadFile() throws IOException, InterruptedException, AWTException{
	APPLICATION_LOGS.debug("uploading file");
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\bharathi.ramapatnam\\Desktop\\AutoIT\\autoITFileUpload.exe");
	Thread.sleep(5000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	
}

	
	
	




}
