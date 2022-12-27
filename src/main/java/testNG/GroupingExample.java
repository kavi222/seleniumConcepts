package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Apple"})
	public void apple() {
	System.out.println("Apple1");	
	}
	@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("Apple2");
	}
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("moto1");
	}
	@Test(groups= {"Moto"})
	public void moto2() {
		System.out.println("moto2");
	}
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("vivo1");
	}
	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("vivo2");
	}
	@Test(groups= {"Lenova"})
	public void lenova1() {
		System.out.println("lenova1");
	}
	@Test(groups= {"Lenova"})
	public void lenova2() {
		System.out.println("lenova2");
	}

}
