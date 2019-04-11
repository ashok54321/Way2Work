package TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	
	@Test(groups="smoke")
	public void validateTitles()
	{
		String expected_title="Yahoo.com";
		String actual_title="Gmail.com";
		
		
		System.out.println("Beginning");
		
		
		SoftAssert softassert=new SoftAssert();
		
		
		System.out.println("validating titles");
		softassert.assertEquals(actual_title, expected_title);
		
		//Assert.assertTrue(false, "Element not found");
		
		System.out.println("validating images");
		softassert.assertEquals(true, false, "image not present");
		
		softassert.fail("this is going to be failed test case");
		
		System.out.println("validating text box");
		softassert.assertEquals(true, false, "Text box not present");
		
		System.out.println("Ending");
		
		softassert.assertAll();
		
	}

}
