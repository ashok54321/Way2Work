package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

	@Test(dataProvider="getData")
	public void doLogin(String username, String password) {
		
		System.out.println(username+"---"+password);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="ashok";
		data[0][1]="12345";
		
		data[1][0]="raghu";
		data[1][1]="123456";
		
		data[2][0]="shabber";
		data[2][1]="1234567";
		return data;
	}
	
	
	
}
