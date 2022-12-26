package testNG;

import org.testng.annotations.Test;

public class Intoduction {

	
	/*
	 * TestNG is a testing framework used for doing unit, functional and integration and end to end testing.
	 * it is a three step process
	 * 1.Write the business logic of your test and insert TestNg annotations in your code.
	 * 2.Add the information about your test in a testng.xml file
	 * 3.Run TestNG
	 * TestNG = unit, functional, integration, end to end  
	 * Why we need TestNg - to solve real time business
	 * 
	 * To install testNG 
	 * 1. Go to Help 
	 * 2. Install new software
	 * 
	 * How to execute the class without main method in testng - we need to add @Test before every method - 
	 * right click and go to run as you can see TestNG Test - it will show the status in console
	 */
	
	@Test
	public void firstTestCase() {
		 System.out.println("This is the first test case");
	}
	
	@Test
	public void secondTestCase() {
		System.out.println("This is the second test case");
	}
	
	@Test
	public void thirdTestCase() {
		System.out.println("This is the third test case");
	}
	
	@Test
	public void fourthTestCase() {
		System.out.println("This is the fourth test case");
	}
	
	@Test
	public void fifthTestCase() {
		System.out.println("This is the fifth test case");
	}
	
	@Test
	public void sixthTestCase() {
		System.out.println("This is the sixth test case");
	}

}
