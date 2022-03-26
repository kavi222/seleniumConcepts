package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. what is synchronization problem in automation? Automation scripts with
		 * multiple lines of code, few lines of code required few page or element and
		 * rest of code required some other page or element which is present in some
		 * other page, when I try to execute the code or script execution is faster than
		 * response of the application. suppose when you are trying to load your page
		 * through ur script, exeution of script will be faster on that the element wont
		 * be available in that case code will throw some exception problem is there is
		 * no balance between script and application. 2. what are the different types of
		 * waits available in selenium webdriver? to solve the synchronization problem
		 * we have different type of waits
		 */

		/*
		 * implicit wait
		 * 
		 * driver.manage().timeouts().implicitelyWait(time); will be used once after the
		 * driver intance is created and applicable for all the element in the script
		 * because it is a global wait untill unless driver is not closed it's
		 * applicable for all the element in the script.
		 * will be used only once, before finding every element it waits for the given amount of time then it fails if the element not found
		 * dis advantage : static 
		 * We can use both implicit and explicit together, implicit will affect only find element and find elements methods
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//h3[text()='Selenium WebDriver']")).click();
		
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in"));
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		

	}

}
