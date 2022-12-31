package TestNgBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSecondClass {
	@Test(priority=1,groups="Sanity",timeOut=1)
	public void Testcase3() throws InterruptedException
	{
		System.out.println("This is Testcase3");
		Thread.sleep(20000);
	}

	@Test(priority=0,groups="Sanity",dependsOnMethods="Testcase3")
	public void Testcase4()
	{
		System.out.println("This is Testcase4");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before test");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class in second class");
	}
}
