package TestNG;

import org.testng.annotations.Test;

public class dependencymanagement {
	
	//High School
	//Higher Secondary
	//Engineering
	
	@Test()
	public void highschool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highschool")
	public void highersecondary() {
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods = "highersecondary")
	public void engineering() {
		System.out.println("Engineering college");
	}
}
	
