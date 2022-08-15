package testclasses;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.Advance;
import page.Firstpage;
import page.PolicyB;
import page.PolicyB2;
import utility.Propertiesfile;

public class Baseclass {

public	static WebDriver driver;
	 PolicyB ad;
	 PolicyB2 bb;
	 
	 @BeforeSuite
	 public void browserintial() throws Exception  {
				
//		String path = System.getProperty("user.dir")+"\\geckodr\\geckodriver.exe";
//			
//			System.setProperty("webdriver.gecko.driver", path);
//			driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions ss = new  ChromeOptions();
	ss.addArguments("--incognito");
	 ss.addArguments("--start-maximized");
	// ss.addArguments("--headless");
		driver = new ChromeDriver (ss);
		
	//	driver.manage().window().maximize();
		
		driver.get(Propertiesfile.getdata("mavenurl"));
	
	
	}
	@BeforeClass
	public void mthd() {
		 ad = new PolicyB(driver);
		 bb= new PolicyB2(driver);
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
	}
	
	
//	@AfterSuite
//	public  void shutdown() {
//		
//		driver.quit();
//		
//	}
	
}
