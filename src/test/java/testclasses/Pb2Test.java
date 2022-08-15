package testclasses;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.PolicyB2;

public class Pb2Test extends Baseclass {
	
	
	@Test(priority = 4)
	public void checkbox() {
		
	//	bb.m4();
		bb.m5();
	}
	
	
	@Test(priority = 5)
	public void ageselection() {
		bb.m7();
	}
	
	@Test(priority = 6)
public  void citynameselec() {
		bb.cityname();
		Assert.fail();
	}
	
	

}
