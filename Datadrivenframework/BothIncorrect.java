package Datadrivenframework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothIncorrect {

	@Test
	@Parameters({"username", "password"})
	public void bothcorrect(String uname, String pword) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElementById("txtUsername").sendKeys(uname);
		driver.findElementById("txtPassword").sendKeys(pword);
		driver.findElementById("btnLogin").click();
	}
}
