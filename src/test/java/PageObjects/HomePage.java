package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy (xpath = "//input[@aria-label='Search Amazon']")
	WebElement searchinput;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	WebElement Btnsearch;
	
	@FindBy (xpath = "(//a[@data-nav-role='signin'])[1]")
	WebElement signinhover;
	
	
	
	public void Searchinputpro()
	{
		searchinput.sendKeys("Iphone 12");
	}
	
	public void SearchBtnclick()
	{
		Btnsearch.click();
		//Btnsearch.submit();
		
	}
	
	public void signinHover() 
	{
		signinhover.click();
	}
	
	

}
