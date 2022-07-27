package extentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

public class Reports extends BaseClass {
	
	@Test
	public void LoginTestCase() throws IOException {
		
		try {
		
		driver.findElementById("txtusername").sendKeys("Admin");
		reportStep("Username is entered sucessfully", "pass");
		}
		catch (Exception e)
		{
			reportStep("Username not entered sucessfully", "fail");
			e.printStackTrace();
		}
		
		try {
			
		driver.findElementById("txtpassword").sendKeys("admin123");
		reportStep("Password is entered sucessfully", "pass");
		
		}
		catch (Exception e)
		{
			reportStep("Password not entered sucessfully", "fail");
			e.printStackTrace();
		}
		
		try {
			
		driver.findElementById("btnLogin").click();
		reportStep("Button Clicked sucessfully", "pass");
		}
		catch (Exception e)
		{
			reportStep("Button clicked unsucessfully", "fail");
			e.printStackTrace();
		}
	}





	public void reportStep(String msg, String status) throws IOException {
		
		if(status.equals("pass")) {
			test.pass(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takesnap()+".png").build());
		}
		else {
			test.fail(msg, MediaEntityBuilder.createScreenCaptureFromPath("\".././snaps/img"+takesnap()+".png\"").build());
			
		}
		}
		
		
		
		public long takesnap() throws IOException{
			
			long number=(long)(Math.floor(Math.random()*90000L)+10000L);
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./snaps/img"+number+".png");
			FileUtils.copyFile(src, dest);
			return number;
		}
}






