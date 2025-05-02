package com.automation.framework.projectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseUrl {

	WebDriver driver ;
	BaseUrl(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
