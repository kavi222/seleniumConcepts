package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipATestCase {
	
	
	@Test(priority=0)
	public void startCar() {
		System.out.println("start the car");
	}
	
	@Test(priority=5,enabled=false)
	public void turnTheMusicOn() {
		System.out.println("turn the music on");
	}
	
	@Test
	public void testCaseSkipException() {
		System.out.println("Im in skip exception");
		throw new SkipException("Skipping this exception");
	}
	
	@Test(priority=6,invocationCount=0)
	public void turnTheMusicVolumeOn() {
		System.out.println("turn the volume on");
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

}
