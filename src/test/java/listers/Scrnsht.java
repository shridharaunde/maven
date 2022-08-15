package listers;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrnsht {

	// static WebDriver driver = null;
	
	
public static String m(WebDriver driver, String fb ) throws IOException{
	
//	driver= new ChromeDriver();
		TakesScreenshot ss = (TakesScreenshot)driver;
	File source =  ss.getScreenshotAs(OutputType.FILE);
	
	//String way = "D:\\chromedriver_win32\\ss\\"+fb+".png";
	String way= System.getProperty("user.dir")+"\\ss3\\"+fb+".png";
	File home = new File(way);
	FileHandler.copy(source, home);
	
	return way;

	}
	
	
	
	
	
}
