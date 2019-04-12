package TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {
	
	@Test(priority=1, groups= {"functional", "smoke"})
	public void doUserReg()
	{
		System.out.println("Executing user reg test case");
		Assert.fail("User not registered");
	}
	
	@Test(priority=2, dependsOnMethods="doUserReg", groups= {"functional", "smoke"})
	public void doLogin()
	{
		System.out.println("Executing login test case");
	}
	
	@Test(priority=3, dependsOnMethods="doUserReg", alwaysRun=true, groups= {"functional", "smoke"})
	public void ThirdTest()
	{
		System.out.println("Executing third test case");
	}
	
	@Test(priority=4, groups="bvt")
	public void FourthTest()
	{
		System.out.println("Executing fourth test case");
	}
	
}
