package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_Login_Test_ extends BaseClass {
	
	
	@Test
	public void loginprocress()
	{
		try {
			
			logger.info("**** starting tc_002_logintest ****");
		HomePage hp = new HomePage(driver);
		hp.signinHover();
		logger.info("Clicked on my Sign In");
		
		LoginPage lp = new LoginPage(driver);
		
		
		lp.sendEmail(rb.getString("id"));
		
		logger.info("Sending mail Id");
		
		lp.ClickonCont();
		logger.info("Clicked on email Cont");
		
		lp.sendPassword(rb.getString("password"));
		logger.info("Sending password");
		
		lp.signinBtn();
		logger.info("Clicked SignIN ");
		
	
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetpage =macc.isMyAccountPageExists();
		Assert.assertEquals(targetpage, true,"Login Failed");
		
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**** Finished TC_002_LoginTest ****");
	}

}
