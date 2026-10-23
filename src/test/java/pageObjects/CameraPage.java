package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CameraPage extends BasePage
{
	public CameraPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][1]//h4")
	WebElement firstCameraProduct;
	
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][1]//span[@class='price-new']")
	WebElement cameraPrice;
	
	@FindBy(xpath="//button[@id='list-view']")
	WebElement listViewBtn;
	
	public String getProductName()
	{
		//return firstCameraProduct.getText();
		return waitutils.WaitforInteractable(firstCameraProduct).getText();
	}
	
	public String getProductPrice()
	{
		//return cameraPrice.getText();
		return waitutils.WaitforInteractable(cameraPrice).getText();
	}
	
	public void ClickListView()
	{
		waitutils.WaitForClickableElement(listViewBtn).click();
	}
	
	
}
