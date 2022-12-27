package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Im before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Im after suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("im before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("im after test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("im before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("im after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("im before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("im after class");
	}

	@Test
	public void test() {
		System.out.println("im test");
	}
	
	@Test
	public void test2() {
		System.out.println("im test2");
	}

}
