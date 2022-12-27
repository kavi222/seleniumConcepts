package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test(groups= {"parallel"})
	@Parameters("parallel")
	public void openGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}
	@Test(groups= {"parallel"})
	@Parameters("parallel")
	public void openBing() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
	}
	@Test(groups= {"parallel"})
	@Parameters("parallel")
	public void openYahoo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.quit();
	}

}
