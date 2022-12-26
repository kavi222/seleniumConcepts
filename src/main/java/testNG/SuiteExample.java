package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	WebDriver driver;
	long start;
	long end;

	@BeforeSuite
	public void launchBrowser() {
	    start = System.currentTimeMillis();
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {

		driver.get("https://www.google.co.in");

	}

	@Test
	public void openBing() {

		driver.get("https://www.bing.com");

	}

	@Test
	public void openYahoo() {

		driver.get("https://www.yahoo.com");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	    end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("Total time taken : " + total);
	}

}
