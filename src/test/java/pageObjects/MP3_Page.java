package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MP3_Page extends BasePage
{
    public MP3_Page(WebDriver driver)
    {
    	super(driver);
    }
    
    @FindBy(xpath="//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']/descendant::a[text()='iPod Shuffle']")
    WebElement selectedproduct;
    
    public void clickProduct()
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(selectedproduct));
    	selectedproduct.click();
    }
}
