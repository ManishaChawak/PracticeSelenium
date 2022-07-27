package TestNG;

import org.testng.annotations.Test;

public class drive_a_car {

	@Test(priority = 0, enabled = false)// enabled =false helps in skipping the step
	public void startacar()
	{
		System.out.println("Starting a car");
	}

	@Test(priority = 1)
	public void putfirstgear()
	{
		System.out.println("Apply 1st gear");
	}

	@Test(priority = 2)
	public void putsecondgear()
	{
		System.out.println("Apply 2nd gear");
	}

	@Test(priority = 3)
	public void putthirdgear()
	{
		System.out.println("Apply 3rd gear");
	}
	@Test(priority = 4)
	public void putfourthgear()
	{
		System.out.println("Apply 4th gear");
	}
	@Test(priority = 5)//, enabled = false)
	public void switchonmusic()
	{
		System.out.println("Switching on music");
	}
}

