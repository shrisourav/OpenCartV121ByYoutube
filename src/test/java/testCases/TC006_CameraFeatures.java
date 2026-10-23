package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CameraPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC006_CameraFeatures extends BaseClass 
{
      @Test
      public void VerifyCameraPriceAndName()
      {
    	logger.info("***** Starting TC005_ProductPriceVerification Test  ****");
  		logger.debug("This is a debug log message");
  		
  		try
  		{
  			HomePage hm = new HomePage(driver);
  			hm.ClickCamera();
  			CameraPage cp = new CameraPage(driver);
  			String pName=cp.getProductName();
  			String pPrice = cp.getProductPrice();
  			System.out.println("Product Name is " + pName);
  			System.out.println("Product Price is " + pPrice);
  			Assert.assertEquals(pName,"Canon EOS 5D");
  			Assert.assertEquals(pPrice,"$98.00");
  			
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
