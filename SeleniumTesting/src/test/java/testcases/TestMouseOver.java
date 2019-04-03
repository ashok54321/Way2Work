package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("way2automation");

		// WebDriverWait wait=new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"))).click();

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3")).click();

		WebElement menu = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[8]/a"));

		Actions action =new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click(); 
		
		
	}

}
