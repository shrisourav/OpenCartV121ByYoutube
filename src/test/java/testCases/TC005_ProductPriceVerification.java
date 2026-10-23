package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MP3_Page;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC005_ProductPriceVerification extends BaseClass 
{
     //Test Case for verifying the product price.
	@Test
	public void VerifyProductPrice()
	{
		logger.info("***** Starting TC005_ProductPriceVerification Test  ****");
		logger.debug("This is a debug log message");
		
		try
		{
			HomePage hm = new HomePage(driver);
			hm.clickMP3();
			hm.AllShowkMP3();
			logger.info("Clicked on MP3 Page Button.. ");
			
			MP3_Page mp3 = new MP3_Page(driver);
			mp3.clickProduct();
			
			ProductPage ppage = new ProductPage(driver);
			String fprice = ppage.GetPrice();
			
			Assert.assertEquals(fprice, "$122.00","Confirmation price mismatch");
		}
		catch (Exception e)
		{
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		} 
		finally 
		{
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	}
}
