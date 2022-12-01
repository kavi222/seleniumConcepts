package wait;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AssignmentWaits {
	
	WebDriver driver;

	@Test
	public void test() {
		// TODO Auto-generated method stub
		/*
		 * 1. should we use both Implicit wait and explicit wait together
		 * 2. What happen when mix both Implicit wait and Explicit wait
		 * i> only explicit wait - 20 sec
		 *    Total Timeout = ~20 sec
		 * ii> With Implicit Wait(6 sec) + Explicit Wait(20)
		 *    Total TimeOut = ~26 sec
		 * 3. Only Explicit wait(20sec) + PollingEvery(5 sec)
		 *    Total TimeOut = ~20 sec
		 * 4. Only Explicit wait(20sec) + PollingEvery(8 sec)
		 *    Total TimeOut = ~ 24 sec
		 * 5. with Implicit wait(6) + Explicit wait(20) + PollingEvery(5 secs)
		 *    Total TimeOut = ~28 sec
		 *    
		 *    
		 *    Conclusion:
		 *    if we mix Implicit wait and explicit wait then
		 *    it will definitely increase the timeout duration.
		 *    this timeout duration can vary as per the polling time, explicit wait time and implicit wait time.
		 */
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//Applying Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.pollingEvery(Duration.ofSeconds(5));
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				System.out.println("Searching for the webelement has started at "+java.time.LocalTime.now());
				return driver.findElement(By.xpath("//*[text()='test']"));
			}
		});
		element.click();
		
	}
	
	@AfterMethod
	public void close() {
		System.out.println("Searching for the webelement has stopped at "+java.time.LocalTime.now());
		driver.close();
	}

}
