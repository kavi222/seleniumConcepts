package testNG;

import org.testng.annotations.Test;

public class Priority {

	
	/*
	 * Priority is an attribute that tells testNG which order the tests need to follow.
	 * When we have multiple test cases and want to execute them in particular order
	 * When we execute the output will be based on the alphabetical order of the method, in order to maintains the execution we have to use priority
	 */
	
	@Test(priority=0)
	public void startCar() {
		System.out.println("start the car");
	}
	
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}
	
	@Test(priority=-1)
	public void getInsideTheCar() {
		System.out.println("Get inside the car");
	}
}
