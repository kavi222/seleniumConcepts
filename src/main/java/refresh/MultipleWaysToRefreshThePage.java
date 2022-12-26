package refresh;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleWaysToRefreshThePage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("callout");
	    driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
	    driver.switchTo().parentFrame();
	   // driver.findElement(By.xpath("//g-flat-button[text()='No Thanks']")).click();
	    /*Thread.sleep(5000);
		driver.get(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).sendKeys(Keys.F5);
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).sendKeys("\uE035");
		//Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(5000);
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("location.reload()");
		Thread.sleep(5000);
		jse.executeScript("history.go(0)");*/
		Thread.sleep(5000);
		
		Actions a= new Actions(driver);
		Action a1= a.keyDown(Keys.F5).keyUp(Keys.F5).build();
		a1.perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
