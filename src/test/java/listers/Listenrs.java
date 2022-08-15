package listers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.ActualTestCase;

public class Listenrs extends ActualTestCase implements ITestListener {
	ExtentTest testing;
	ExtentReports ss1=ReportGen.report();
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test start"+result.getMethod().getMethodName());
	 testing = ss1.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test successful"+result.getMethod().getMethodName());
		testing.log(Status.PASS, "it is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test fail"+result.getMethod().getMethodName());

		testing.fail(result.getThrowable());
		
	try {
	testing.addScreenCaptureFromPath(Scrnsht.m(driver, "pb4"));
		//Scrnsht.m(driver, "pb3");
	}
	catch(IOException e){
		
//		
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipp"+result.getMethod().getMethodName());
	
		testing.log(Status.SKIP, "it is skipppeeddd");
//		try {
//			Scrnsht.m(driver, "skipped tests1");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
  ss1.flush();

	
	}
	
	
	
	
	

}
