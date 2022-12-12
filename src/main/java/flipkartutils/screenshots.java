package flipkartutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshots {
	public static String captureScreenshot(WebDriver driver, String testName) throws IOException 
	{
		String screenshotPath = System.getProperty("user.dir")+"/FailedScreenshot/"+testName +".jpg";
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(screenshotPath));
		return screenshotPath;	
	}	
}
