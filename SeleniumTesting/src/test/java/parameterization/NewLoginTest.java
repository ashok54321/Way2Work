package parameterization;

import org.testng.annotations.Test;

public class NewLoginTest {
	
	
	@Test(dataProviderClass=DataProviders.class, dataProvider="dp1")
	public void testLogin(String username, String password) {
		
		System.out.println(username+"--"+password);
	}
	
	@Test(dataProviderClass=DataProviders.class, dataProvider="dp1")
	public void testUserReg(String Fname, String Lname, String Email) {
		
		System.out.println(Fname+"---"+Lname+"---"+Email);
	}
	
	
	

}



