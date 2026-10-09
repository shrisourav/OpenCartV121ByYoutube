package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage
{
	public ProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='col-sm-4']//h2")
	WebElement productprice;
	
	public String GetPrice()
	{
		return productprice.getText();
	}

}
