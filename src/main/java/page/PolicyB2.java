package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PolicyB2 {
	
	
static WebDriver driver = null;
	
	
	//@FindBy(xpath = "(//*[@name='profile'])[1]") WebElement self;
	@FindBy(xpath = "(//*[@class='checkbox'])[2]") WebElement wife;
   @FindBy(xpath = "//*[@id='submitButton']") WebElement go;
  @FindBy(xpath = "//*[@id='Self']")WebElement age1;
  @FindBy(xpath = "//*[@id='Spouse']") WebElement age2;
  @FindBy(xpath = "//*[@id='txtcity']") WebElement city;
  
  @FindBy(xpath = "//*[text()='Continue']") WebElement next;
  public PolicyB2(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void m4() {
//		
//	//	self.click();
//	 wife.click();
//	}
//	
//	
	public void m5() {
		
			wife.click();
		 go.click();
		}
		
	public void dropdown(WebElement ee, String ages) {
		
		Select ss = new Select(ee);
		ss.selectByValue(ages);
		
	}
	
	public void m7() {
		
		dropdown(age1, "25");
	dropdown(age2, "24");
	go.click();
	
	}
	 public void cityname() {
		 
		 city.sendKeys("kolhpaur");
		 next.click();
	 }

}
