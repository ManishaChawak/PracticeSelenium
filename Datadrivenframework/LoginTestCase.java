package Datadrivenframework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCase { 
	//instead of writing four java classes,
	//class logintestcase is the one class used to make code easy
	//all four login username and password are in one class

		String[][] data ={
			{"Admin","admin123"},
			{"Admin","ghahgf"},
			{"asjhs","admin123"},
			{"nsbma","ashgha"}
		};
		
		@DataProvider(name="logindata")
		public String[][] logintestdata(){
			return data;
		}
	@Test(dataProvider = "logindata")
	
	public void loginfunction(String uname, String pword) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElementById("txtUsername").sendKeys(uname);
		driver.findElementById("txtPassword").sendKeys(pword);
		driver.findElementById("btnLogin").click();
	}


}
