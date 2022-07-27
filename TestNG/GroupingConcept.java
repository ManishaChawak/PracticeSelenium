package TestNG;

import org.testng.annotations.Test;

public class GroupingConcept {

	@Test(groups="mobile")
	public void vivo() {
		System.out.println("Mobile phone vivo");
	}
	@Test(groups="mobile")
	public void oneplus() {
		System.out.println("oneplus phone");
	}
	
	@Test(groups="laptop")
	public void lenovo() {
		System.out.println("Laptop lenovo");
	}
	@Test(groups="laptop")
	public void HP() {
		System.out.println("HP laptop");
	}
	@Test(groups="course")
	public void selenium() {
		System.out.println("selenium course");
	}
	@Test(groups="course")	
	public void testNG() {
			System.out.println("testNG framework");
		
	}
}
