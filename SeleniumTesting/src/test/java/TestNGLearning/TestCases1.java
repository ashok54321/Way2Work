package TestNGLearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases1 {

	@BeforeTest
	public void createDBConn()
	{
		System.out.println("Creating DB connection");
	}
	
	@AfterTest
	public void closeDBConn()
	{
		System.out.println("Closing DB connection");
	}
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.out.println("Launching broswer");
	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		System.out.println("Closing broswer");
	}
	
	@Test(priority=1, groups="functional")
	public void doUserReg()
	{
		System.out.println("Executing user reg test case");
	}
	
	@Test(priority=2, groups="functional")
	public void doLogin()
	{
		System.out.println("Executing login test case");
	}
	
	
}
