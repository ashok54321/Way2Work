package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyBoardEvents {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("ashokkolli.2014");
		/*Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();*/
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/div[2]")).click();
		
		//Ctrl+a
		Actions action=new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		
		//Ctrl+c
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		
		//Ctrl+v
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();

	}

}
