package flipkarttests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import flipkartutils.screenshots;
//We use mvn test command to run the project using command prompt

public class baseclass {
	public static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	static {
		file = new File("./propertyfile/config.properties");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
	
	@BeforeSuite (groups= {"sanity", "invalid"})
	public void setExtent() {
		extent = new ExtentReports("./Reports/ExtentReport.html");	
	}
	
	@AfterSuite  (groups= {"sanity", "invalid"})
	public void endReport() {
		extent.flush();
		extent.close();
	}
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public static void initializeWebDriver() {
		//System.setProperty(prop.getProperty("driverProperty"),prop.getProperty("driverPath"));
		
		// !! Headless Mode
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
		//drivers.addArguments("window-size=1280,800");
//		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		
		// To use FireFox driver
		//driver = new FirefoxDriver();
		
		// To use Internet Explorer
		//driver=new InternetExplorerDriver();
//		
//	    driver.manage().window().maximize();
//		prop.getProperty("globalWait");
		String browser=prop.getProperty("browserName");
        if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty(prop.getProperty("driver2"),prop.getProperty("driverpath2"));
            FirefoxOptions option=new FirefoxOptions();
            option.setHeadless(true);
            driver = new FirefoxDriver(option);
        }
        else if(browser.equalsIgnoreCase("Chrome")) {
        	System.setProperty(prop.getProperty("driverProperty"),prop.getProperty("driverPath"));
            ChromeOptions option = new ChromeOptions();
            option.setHeadless(false);
            driver = new ChromeDriver(option);
        }
		 else if(browser.equalsIgnoreCase("Edge")) {
	            System.setProperty(prop.getProperty("driver1"),prop.getProperty("driverpath1"));
	            driver = new EdgeDriver();
	        }
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		
	}
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public static void navigateSite() {
		driver.get(prop.getProperty("url"));
		//driver.findElement(By.className("_1_3w1N")).click();
	}
	
	@BeforeMethod (groups= {"sanity", "invalid"})
	public void startTest(Method name) {
		String testname = name.getName();
		extentTest = extent.startTest(testname);
	}
	
	@AfterMethod (groups= {"sanity", "invalid"})
	public void resultTest(ITestResult result) throws IOException {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
			String imagePath = screenshots.captureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(imagePath));
			
		}
		else {
			if(result.getStatus() == ITestResult.SUCCESS) {
				extentTest.log(LogStatus.PASS, "Test case passed successfully");	
				
			}
		}
		extent.endTest(extentTest);
		driver.close();
	}
	
}
