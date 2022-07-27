package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loadbrowser {
	
	ChromeDriver driver;
	long startTime;
	long endTime;
	
	//@BeforeSuite
	//@AfterSuite
	//Suite means collection of test cases
	
	@BeforeSuite
	public void launchbrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void opengoogle() {
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
	}
	
	@Test
	public void openyahoo() {
		driver.get("https://www.yahoo.com/");
		//driver.manage().window().maximize();
		}
	
	@Test
	public void openbing() {
		driver.get("https://www.bing.com/");
		//driver.manage().window().maximize();
		}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long Totaltime=endTime-startTime;
		System.out.println("Total Time Taken: "+Totaltime);
	}
	
}


