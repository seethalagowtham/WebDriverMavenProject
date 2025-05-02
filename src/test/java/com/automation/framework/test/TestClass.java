package com.automation.framework.test;

import org.apache.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.framework.projectObjectModel.ProjectObjectModel;
import com.automation.framework.projectObjectModel.ProjectObjectModelOne;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
  
	WebDriver driver;
	
	
	
	@BeforeMethod
	//@Parameters()
	public void launchUrl(String browser) {
		
		
		switch (browser) {
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
        case "edge":
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            break;
            default:
		}
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/login");
		
		driver.manage().window().maximize();		
	}
	
	@Test(priority=1) 
	public void getPOMClass() {
		
		ProjectObjectModel po = new ProjectObjectModel(driver);
		
		po.setUserName("Gowthamgow");
		po.setPassword("Gowtham@98");
		po.onClick();
		
	}
	
	@Test
	public void addDetails() {
		/*
		 * ProjectObjectModelOne poq = new ProjectObjectModelOne(driver); poq.OnForm();
		 * poq.Practise(); poq.setfirstName("Test"); poq.setEmail("Test@gmail.com");
		 * poq.setLastName("Sun"); poq.setNumber("234580876");
		 * poq.setCurrentAddress("Nothing"); poq.clickOnHobbies();
		 */
	}
	
	@AfterMethod 
	public void logOut() {
		
		//driver.quit();
	}
		
}
