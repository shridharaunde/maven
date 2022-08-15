package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Advance {

	
	static WebDriver driver = null;
	
	
	@FindBy(xpath = "//*[@class='gLFyf gsfi']") WebElement site;
	@FindBy(xpath = "//*[@class='yuRUbf']//h3[text()='Flipkart']") WebElement name;
 @FindBy(xpath = "//*[@class='_2KpZ6l _2doB4z']") WebElement popup;
   @FindBy(xpath = "//*[@class='eFQ30H']//div[text()='Mobiles']") WebElement cat;
 
 
    public Advance(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
public void m() {
	
site.sendKeys("flipkart");	
Actions act = new Actions(driver);
act.sendKeys(Keys.ENTER)
.perform();

}
public void m2() {
	//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	name.click();
}

public void m3() {
	
	popup.click();
cat.click();

}

}
