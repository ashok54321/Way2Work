package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {

	public static ExcelReader excel=null;
	
	@Test(dataProvider="getData")
	public void testData(String username, String password, String is_correct) {
		
		System.out.println(username+"---"+password+"---"+is_correct);
		
	}
	
	
	
	@DataProvider
	public static Object[][] getData(){
		
		if(excel==null) {
			
			excel=new ExcelReader("C:\\Users\\Ashok\\Desktop\\testngdata.xlsx");
		}
		
		String sheetName="loginTest";
		excel.getRowCount(sheetName);
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColCount(sheetName);
		
		
		Object[][] data=new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum<=rows; rowNum++) {
			
			for(int colNum=0; colNum<cols; colNum++) {
				
				//excel.get
				
				
			}
		}
		
		return data;
	}
}
