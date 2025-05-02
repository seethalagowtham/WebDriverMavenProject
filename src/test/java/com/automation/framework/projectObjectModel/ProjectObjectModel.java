package com.automation.framework.projectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectObjectModel extends BaseUrl {

	public ProjectObjectModel(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='userName']")
	public WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(xpath = "//button[@id='login']")
	public WebElement clicking;

	public void setUserName(String name) {
		username.sendKeys(name);

	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);

	}

	public void onClick() {
		clicking.click();
	}

}
