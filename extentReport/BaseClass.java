package extentReport;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	ChromeDriver driver;
	public static ExtentHtmlReporter reports;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	@BeforeMethod
	public void loadURL() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	//ExtentHtmlReporter
	//ExtentReports
	//
	
	
	@BeforeSuite
	public void startReport() {
		
		ExtentHtmlReporter reports= new ExtentHtmlReporter("./ExtentReport/reports.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reports);
	}
	
	@AfterSuite
	public void closeReport() {
		
		extent.flush();
	}
	public void testDetails() {
		
		test= extent.createTest("Login Test Case", "Positive Test for Login Functionality");
	    test.assignAuthor("manisha");
	    test.assignCategory("functional");
	}
	
}
