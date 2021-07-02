package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	

	static WebDriverWait wait;

	public static void    screenShotCapture (WebDriver driver , String screenshotname) 
	{
		Path dest = Paths.get("./Screenshots", screenshotname+".png") ;
		try {
			Files.createDirectories(dest.getParent()) ;
			FileOutputStream output = new FileOutputStream(dest.toString()) ; 
			output.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)) ;
			output.close();
		} catch (IOException e) {
			System.out.println("ScreenShot Excpetion"+e.getMessage());
		}

	}
	
	
	public static void waitUntilElementIsVisible(WebDriver driver, WebElement element , int timeouts)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts)) ;
		wait.until(ExpectedConditions.visibilityOf(element));
	}



}
