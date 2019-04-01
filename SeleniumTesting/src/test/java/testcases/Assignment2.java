package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("name")).sendKeys("Ashok");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.name("email")).sendKeys("ashok@gmail.com");
		
		driver.findElement(By.name("country")).sendKeys("Bahamas");
		driver.findElement(By.name("city")).sendKeys("Hubli");

		driver.findElement(By.xpath("//div[@id='load_box']/form[@id='load_form']//input[@name='username']")).sendKeys("ashok");
		
		driver.findElement(By.xpath("//div[@id='load_box']/form[@id='load_form']//input[@name='password']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//div[@id='load_box']/form[@id='load_form']//input[@value='Submit']")).click();
		
		
	}

}
