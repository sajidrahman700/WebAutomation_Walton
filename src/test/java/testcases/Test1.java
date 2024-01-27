package testcases;

import org.testng.annotations.Test;

import utilities.DriverSetup;

public class Test1 extends DriverSetup {
	@Test
	public void test() {
		
		System.out.println("Hello");
		getBrowser().get("https://eplaza.waltonbd.com/");
	}
	

}
