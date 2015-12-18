package com.cucumber.sales;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.cucumber.sales.util.Webconnector;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginsales extends Webconnector {
	
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
	
	
	
	

	//Step file 
	@Given("^the \"([^\"]*)\"$")
	public void I_Go_To_Salesforce(String URL){
		APPLICATION_LOGS.debug("launching" + URL );
		//System.out.println("I am going to "+ URL +" on  "+ browser);
		//Selenium.openBrowser();
		//Selenium.navigate(URL);
		driver.get(CONFIG.getProperty(URL));
		
	}
	@Then("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String object){
		
		APPLICATION_LOGS.debug("clicking on " + object);
		//System.out.println("clicking on"+ object);
		//Selenium.click(object);
		driver.findElement(By.id(OR.getProperty(object))).click();
		
		
		
	}
	@Then("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	
	public void I_enter_username(String object, String email){
		APPLICATION_LOGS.debug("enterning" + email + "in "+ object);
		//System.out.println("enter username in "+ object+ "as"+ email);
		driver.findElement(By.id(OR.getProperty(object))).sendKeys(email);
		
		
		}
	@Then("^I enter \"([^\"]*)\" password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String object, String password)  {
		APPLICATION_LOGS.debug("enterning" + password + "in "+ object);
	    //System.out.println("Entering password in "+ object + "as" + password);
	    driver.findElement(By.id(OR.getProperty(object))).sendKeys(password);
	   
	}
	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on_SubmitButton(String object) {
		APPLICATION_LOGS.debug("clicking on "+ object);
	//System.out.println("clicking on " + object);
	driver.findElement(By.id(OR.getProperty(object))).click();
	
	}
	
	@Then("^I am successfuly logged in as \"([^\"]*)\"$")
	public void i_am_successfuly_logged_in(String object){
		//APPLICATION_LOGS.de( object + "logged in ");
		System.out.println("logged in as " + object );
		driver.findElement(By.cssSelector(OR.getProperty("profile_link"))).click();
		String actual = driver.findElement(By.xpath(OR.getProperty("profile_textElement"))).getText();
		String expeced = object;
		if(actual.equals(expeced)){
			System.out.println(object + " logged in successfully");
		}else{
			System.out.println("Error");
		}
		APPLICATION_LOGS.info( object + "logged in ");
		
		

}
	
	@Then("^I should get \"([^\"]*)\"$")
	public void i_should_get( String errorMessage) throws Throwable {
		APPLICATION_LOGS.debug("Executing invalid login ");
		
		String actual = driver.findElement(By.xpath(OR.getProperty("login_error"))).getText();
		String expected = errorMessage;
		
		
		if(actual.equals(expected)){
			System.out.println(actual);
		}else{
			System.out.println(" ERROR not able to get error message");
		}
	}
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	  
		APPLICATION_LOGS.debug("Executing logout function");
		String afterLogin = driver.getTitle();
	   //driver.findElement(By.cssSelector(OR.getProperty("profile_link"))).click();
	   driver.findElement(By.linkText("Log Out")).click();
	   String actual = "Login | Salesforce";
	  String title = driver.getTitle();
	   System.out.println(title);
	  // Login | Salesforce

	  if(!afterLogin.equals(title)){
		  System.out.println("log out successful");
	  }else{
		  System.out.println("Error");
		  
		  
		  
	  }

	   
	   
	 //throw new PendingException();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		APPLICATION_LOGS.debug("Executing logout function");
		   driver.findElement(By.cssSelector(OR.getProperty("profile_link"))).click();		    
	    throw new PendingException();
	}
	
	@Given("^logged in \"([^\"]*)\"$")
	public void loginSales(String object){
	    //Selenium.navigate(CONFIG.getProperty("prodUrl"));
	    driver.get(CONFIG.getProperty("prodUrl"));
		Selenium.ValidLogin("bharathi.ramapatnam@gmail.com", "Testing@2015");
	}
		
	@Then("^click on Tasks Menu$")
	public void click_on_Tasks_Menu() throws Throwable {
		 APPLICATION_LOGS.debug("Executing create new task --- clicking on tasks links");

	    driver.findElement(By.xpath(OR.getProperty("tasks_link"))).click();
	    
	}
   @And("^click on New Task button$")
   public void click_on_New_Task_button() throws Throwable {
	APPLICATION_LOGS.debug("Executing create new task --- clicking on New task button");
	Thread.sleep(3000);
	driver.findElement(By.xpath(OR.getProperty("newTask_button"))).click();
		
	  
	}

   @Then("^fillout Tasks Information fields$")
   public void fillout_Tasks_Information_fields(DataTable table) throws Throwable {
	   APPLICATION_LOGS.debug("Executing create new task --- enterning data in form");
		/*
		Subject = //*[@id='40:22580;a']
				DueDate=//*[@id='141:22580;a']
				Name=//*[@id='526:22580;a']
				RelatedTo=//*[@id='654:22580;a']
				Comments=//*[@id='962:22580;a']
				Priority=//*[@id='1007:22580;a']
				Status=//*[@id='1034:22580;a']
				AssignedTo=//ul[@data-aura-rendered-by='123:22580;a']
				*/
				System.out.println(table);
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(2));
		//List<WebElement> inputBoxes = driver.findElements(By.tagName("input"));
		//System.out.println(inputBoxes.size());
		//for(int i = 0; i<inputBoxes.size(); i++){
			//System.out.println(inputBoxes.get(i).getLocation());
			//System.out.println(inputBoxes.get(i).getAttribute("id"));
			driver.findElement(By.xpath(("//input[starts-with(@id,'40')]"))).sendKeys(data.get(1).get(2));
		}
   
	/*
		driver.findElement(By.xpath(("//input[starts-with(@id,"40")]"))).sendKeys(data.get(1).get(2));
		driver.findElement(By.id(OR.getProperty("DueDate"))).sendKeys(data.get(1).get(3));
		driver.findElement(By.id(OR.getProperty("Name"))).click();
		driver.findElement(By.xpath("//*[@id='3785:c']/div/div/a/span[1]")).click();
		driver.findElement(By.linkText(("Contact"))).click();
		
		driver.findElement(By.id(OR.getProperty("RelatedTo"))).click();
		//*[@id='3473:c']/div/div/a/span[1]
		driver.findElement(By.xpath("//*[@id='3473:c']/div/div/a/span[1]")).click();
		driver.findElement(By.linkText("Opportunity")).click();
		
		driver.findElement(By.id(OR.getProperty("Comments"))).sendKeys(data.get(1).get(4));
		driver.findElement(By.id(OR.getProperty("Priority"))).sendKeys(data.get(1).get(5));
		driver.findElement(By.id(OR.getProperty("Status"))).sendKeys(data.get(1).get(6));
		//driver.findElement(By.xpath("AssignedTo")).sendKeys();
		 * */
		 
	    	   
	
	@Then("^Save the Task$")
	public void save_the_Task() throws Throwable {
		APPLICATION_LOGS.debug("Executing create new task --- clicking on save button");
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		
	  
		
	    throw new PendingException();
	}

}
