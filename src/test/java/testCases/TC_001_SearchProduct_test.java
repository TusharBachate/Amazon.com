package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;


import PageObjects.HomePage;
import PageObjects.ProductPage;
import testBase.BaseClass;

public class TC_001_SearchProduct_test extends BaseClass
{

	
	@Test
	public void Searchproduct() throws InterruptedException
	{
		logger.debug("application logs..........");
		logger.info("**** Starting TC_001_SearchProduct_test **** ");
		
		try {
		HomePage hp = new HomePage(driver);
		
		hp.Searchinputpro();
		logger.info(" Search IPhone");
		
		hp.SearchBtnclick();
		logger.info("Clicked on Search button");
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			Assert.fail();
		}
		
		ProductPage pp = new ProductPage(driver);
	//	pp.selectProduct();
		pp.find_Findproduct();
		pp.selectProduct("iLight Mini Smartphone 12 Pro");
				
		logger.info("**** Finished TC_001_AccountRegistrationTest ****");
	}

}
