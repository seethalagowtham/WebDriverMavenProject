
package com.automation.framework.projectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProjectObjectModelOne extends BaseUrl {
	
	
	public ProjectObjectModelOne(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public  WebDriver driver;

	
	@FindBy(xpath = "//body/div[@id='app']/div[contains(@class,'body-height')]/div[contains(@class,'container playgound-body')]/div[contains(@class,'row')]/div[contains(@class,'col-md-3')]/div[contains(@class,'left-pannel')]/div[contains(@class,'accordion')]/div[2]/span[1]/div[1]/div[1]']")
	WebElement forms;
	
	@FindBy(xpath="//span[normalize-space()='Practice Form']")
	WebElement praticse;
	
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement email;
	
	@FindBy(xpath="//label[normalize-space()='Male']")
	WebElement maleradio;

	@FindBy(xpath="//input[@id='userNumber']")
	WebElement userNumber;
	
	@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	WebElement subjects;
	
	@FindBy(xpath="//label[normalize-space()='Reading']")
	WebElement hobbies;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement cuurentAddress;
	
	@FindBy(xpath="//div[contains(text(),'Select State')]")
	WebElement currentState;
	
	@FindBy(xpath="//div[@id='stateCity-wrapper']")
	WebElement currentCity;

	public void OnForm() {
		forms.click();
	}
	public void Practise() {
		praticse.click();
	}
	public void setfirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
  public void setLastName(String LastNamre) {
	lastName.sendKeys(LastNamre);

   }
  
  public void setEmail(String Email) {
	  email.sendKeys(Email);
  }
  
  public void MaleRadioButton(String RadioMale) {
	  maleradio.sendKeys(RadioMale);
  }
  
  public void setNumber(String num) {
	  userNumber.sendKeys(num);
  }
  
  public void setCurrentAddress(String Address) {
	  cuurentAddress.sendKeys("Address");
  }
 
  public void currenState(WebElement currentState ) {
	  Select select = new Select(currentState);
      select.selectByIndex(2);
  }
  
  public void currenCity(WebElement currentCity ) {
	  Select select = new Select(currentCity);
      select.selectByIndex(2);
  }
  
  public void clickOnHobbies() {
	  hobbies.click();
  }
}

