package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		
		//we will get no such element because this element is inside the iframe
		//driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']"));
		// we can pass frame as name of frame or id, web element and index
		driver.switchTo().frame("packageListFrame");// name of the frame
		//After switching into the frame click the below item.
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		Thread.sleep(3000);
		//Return to main page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//2nd frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		Thread.sleep(3000);
		//Return to main page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//3rd frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		//Return to main page
		driver.switchTo().defaultContent();
	}

}
