package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Firstpage {
	
	
	
static WebDriver driver = null;
	
	public Firstpage(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	
	
	public void m() {
		
		
		driver.get(" https://www.google.com/");
		 WebElement flip = driver.findElement(By.xpath(" //*[@class='gLFyf gsfi']"));
        flip.sendKeys("flipkart");
        Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER)
		.perform();
	}
	
	public void m2() throws Exception {
		
		driver.findElement(By.xpath("//*[@class='yuRUbf']//h3[text()='Flipkart']")).click();
	//	Thread.sleep(5000); 
	}
	
	public void m3() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		//Thread .sleep(4000);
		driver.findElement(By.xpath("//*[@class='eFQ30H']//div[text()='Mobiles']"))
		.click();
		
	}
	

}



