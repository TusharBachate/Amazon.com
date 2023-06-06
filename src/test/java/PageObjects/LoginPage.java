package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath = "//input[@type='email']")
	WebElement Txtemail;
	
	@FindBy (xpath = "//input[@id='continue']")
	WebElement btnConti;
	
	@FindBy (xpath = "//input[@type='password']")
	WebElement txtpassword;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	WebElement btnSignin;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement newElement = wait.until(ExpectedConditions.visibilityOf(Txtemail));

	public void sendEmail (String id)
	{
		
		Txtemail.sendKeys(id);
	}

	public void ClickonCont()
	{
		btnConti.click();
		
	}
	
	public void sendPassword(String password)
	{
		txtpassword.sendKeys(password);
		
	}
	public void signinBtn()
	{
		btnSignin.click();
		
	}
}
