package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		
		Object[][] data=null;
		
		if(m.getName().equals("testLogin")) {
		
		 data= new Object[2][2];
		
		data[0][0]="raman";
		data[0][1]="ertwerter";
		
		data[1][0]="Rahul";
		data[1][1]="sdfasdf";
		
		}
		
		else if (m.getName().equals("testUserReg")) {

			data = new Object[2][3];

			data[0][0] = "shweta";
			data[0][1] = "ertwerter";
			data[0][2] = "hhhh";

			data[1][0] = "shalu";
			data[1][1] = "sdfasdf";
			data[1][2] = "ttttt";
			
		}
		
		return data;
	}
	
}
