package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtils;

public class BasePage {

	WebDriver driver;
	protected WaitUtils waitutils;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.waitutils= new WaitUtils(driver, 10);
	}
}
