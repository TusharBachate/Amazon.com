package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_TestDDT extends BaseClass {
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loignDDT(String email,String password,String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT **** ");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.signinHover();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.sendEmail(email);
		lp.ClickonCont();
		lp.sendPassword(password);
		lp.signinBtn();
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetpage =macc.isMyAccountPageExists();
		
	
		
		if(exp.equals("Valid"))
		{
			if(targetpage == true)
			{
			
				macc.logoutClick();
				Assert.assertTrue(true);
				
			}
			
			else
			{
				//Assert.fail();
				Assert.assertTrue(false);
			}
			
			
		}
		
		if(exp.equals("Invalid"))
		{
			if(targetpage == true) 
			{
	
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**** Finished TC_003_LoginDDT_ ****");
		
		}
		
			
		}
	


