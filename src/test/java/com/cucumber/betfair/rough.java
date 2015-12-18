package com.cucumber.betfair;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File pathBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//C:\\Program Files (x86)\\Mozilla Firefox
		//C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\firefox.exe
		//FirefoxBinary Binary = new FirefoxBinary(pathBinary);
		//FirefoxProfile firefoxPro = new FirefoxProfile();       
		//WebDriver driver = new FirefoxDriver(Binary, firefoxPro);
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharathi.ramapatnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
			
	}	
	}
