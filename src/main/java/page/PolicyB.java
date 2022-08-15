package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyB {
	
	
	
static WebDriver driver = null;
	
	
	@FindBy(xpath = "//*[@class='gLFyf gsfi']") WebElement site;
	@FindBy(xpath = "//*[text()='PolicyBazaar.com - Compare & Buy Insurance Plans']") WebElement name;
 @FindBy(xpath = "//*[@class='shadowHandlerBox']//*[@class='icon-bg homeIconsBg icon-bg-new family-health-insurance']") WebElement familyinsurnce;
 //  @FindBy(xpath = "//*[@class='eFQ30H']//div[text()='Mobiles']") WebElement cat;
 

 public PolicyB(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
 
 
 

public void m() {
	
site.sendKeys("policy bazar");	
Actions act = new Actions(driver);
act.sendKeys(Keys.ENTER)
.perform();

}



public void m2() {
	//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	name.click();
}


public void m3() {
	
	familyinsurnce.click();
}


}


