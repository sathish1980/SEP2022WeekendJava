package TestNgBasics;

import org.testng.annotations.*;

public class TextNGfirstclass {
	
@BeforeSuite(alwaysRun=true)
public void beforeSuite()
{
	System.out.println("This is before suite");
}


@BeforeClass(alwaysRun=true)
public void beforeclass()
{
	System.out.println("This is before class");
}

@BeforeMethod
public void beforemethod()
{
	System.out.println("This is before method");
}



//@Test(priority=-1,description="username",enabled=true,invocationCount=5,invocationTimeOut=60,timeOut=60)
@Test(priority=-1,groups="Sanity")
public void Testcase2() throws InterruptedException
{
	System.out.println("This is Testcase2");
	//Thread.sleep(20000);
}

@Test(groups={"Sanity","SIT"})
public void Testcase1()
{
	System.out.println("This is Testcase1");
}

@Test(groups="Sanity")
public void Testcase5()
{
	System.out.println("This is Testcase5");
}


@AfterMethod
public void aftermethod()
{
	System.out.println("This is after method");
}

@AfterClass
public void afterclass()
{
	System.out.println("This is after class");
}


@AfterTest
public void afterTest()
{
	System.out.println("This is after test");
}

@AfterSuite
public void afterSuite()
{
	System.out.println("This is after suite");
}

}
