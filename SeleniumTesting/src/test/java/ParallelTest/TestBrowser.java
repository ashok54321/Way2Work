package ParallelTest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser {
	
	@Parameters({"browser"})
	@Test
	public void doLogin(String browser) throws InterruptedException {
		
		Date date=new Date();
		System.out.println("Browser name: "+browser+"--"+date);
		Thread.sleep(2000);
		
	}

}
