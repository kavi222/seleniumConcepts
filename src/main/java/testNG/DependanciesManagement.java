package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	
	@Test
	public void highSchool() {
		System.out.println("Hign school");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Higher sec");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void ug() {
		System.out.println("UG");
	}
	
	@Test(dependsOnMethods="ug")
	public void pg() {
		System.out.println("PG");
	}

}
