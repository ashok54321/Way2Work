package testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementScreenshot {

	public static WebDriver driver;

	public static void captureScreenshots() throws IOException {

		Date date = new Date();
		String fileName = date.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshots//" + fileName));
	}
	
	
	public static void captureEleScreenshot(WebElement ele) throws IOException {
		
		Date date = new Date();
		String fileName = date.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImg = ImageIO.read(screenshot);

		Point point = ele.getLocation();
		int eleHeight = ele.getSize().getHeight();
		int eleWidth = ele.getSize().getWidth();
		
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "jpg", screenshot);
		
		File screenshotLocation=new File(".\\screenshots\\"+fileName);
		FileUtils.copyFile(screenshot, screenshotLocation);
	}

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("hplogo"));
		
		captureEleScreenshot(ele);
		
	}

}
