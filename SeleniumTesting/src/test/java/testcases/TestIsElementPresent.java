package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {

	public static WebDriver driver;

	// user-defined mehtod for isElementPresent
	public static boolean isElementPresent(String locator)
	{
		try {
		driver.findElement(By.xpath(locator));
		return true;
		} catch(Throwable t)
		{
			return false;
		}
	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
		
		System.out.println(isElementPresent("//*[@id=\"jss-link-box-en\"]/strong"));
	}

}
