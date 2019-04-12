package TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {

	@Test
	public void doLogin1()
	{
		Assert.fail("Failing the login test");
		System.out.println("Capture Screenshot");
	}
}
