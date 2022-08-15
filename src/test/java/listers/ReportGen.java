package listers;

import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGen {
	static ExtentReports ext;
	public static ExtentReports  report() {
		
		String path = System.getProperty("user.dir")+"\\reprt\\trial.html";
		
	ExtentHtmlReporter er = new ExtentHtmlReporter(path);
	er.config().setTheme(Theme.DARK);
	er.config().setReportName("first report");	
	 ext = new ExtentReports();
	ext.attachReporter(er);
	ext.setSystemInfo("project name", "maven");
	ext.setSystemInfo("testing in", "my system");
	return ext;
		
		
		
	}
	
	
	

}
