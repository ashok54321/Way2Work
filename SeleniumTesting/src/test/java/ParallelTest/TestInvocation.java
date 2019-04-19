package ParallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest{

	
	@Test(invocationCount=5,threadPoolSize=2)
	public void executeTest() {
		
		driver= getDriver("chrome");
		//System.out.println("Launching browser");
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
