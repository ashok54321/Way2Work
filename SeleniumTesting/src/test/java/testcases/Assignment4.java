package testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	   
		Dimension dimension=new Dimension(200, 200);
		int width=200;
		int height=200;
	for(width=200; width<=600; width++)
	{
		for(height=200; height<=600; height++)
		{
			driver.manage().window().setSize(dimension);
	
		}
	}
		
	}

}
