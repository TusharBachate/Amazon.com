package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyAccountPage extends BasePage {

	
		
		public MyAccountPage(WebDriver driver) {
			super(driver);
			
		}
		
		@FindBy (xpath = "//span[text()='Hello, tushar']")
		WebElement VerifyingID ;
		
		
		@FindBy (xpath = "//a[@id='nav-link-accountList']")
		WebElement signinhoverAct ;
		
		@FindBy (xpath = "//span[normalize-space()='Sign Out']")
		WebElement linklogout ;
		
		@FindBy (xpath = "(//span[@class=\"nav-icon nav-arrow\"])[2]")
		WebElement listpointer ;
		
		public boolean isMyAccountPageExists() throws InterruptedException 
		{
		
			try 
			{
				
				return (VerifyingID.isDisplayed());
			}
			catch (Exception e)
			{
				return false;

			}
			
			
		}
		

		
//		public void signinhoverAction() throws InterruptedException
//		{
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.visibilityOf(listpointer));
//			
//			System.out.println("listpointer");
//			
//				Actions act = new Actions(driver);
//				act.moveToElement(listpointer).perform();
//			
//		}
//	
//		public void logoutClick()
//		{
//			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.visibilityOf(linklogout));
//			
//			System.out.println("linklogout");
//			
////			Actions act = new Actions(driver);
////			act.moveToElement(linklogout).click().build().perform();
//			linklogout.click();
//			
//		}
//	
		
		public void logoutClick() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.elementToBeClickable(signinhoverAct));

		    Actions act = new Actions(driver);
		    act.moveToElement(signinhoverAct).build().perform();

		    wait.until(ExpectedConditions.visibilityOf(linklogout));
		    linklogout.click();
		}

}
