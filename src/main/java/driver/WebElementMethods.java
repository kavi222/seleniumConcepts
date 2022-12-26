package driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementMethods {

	
	/*
	 * WebElement methods : 
	 * click(), 
	 * clear() - used to clear any value which is present in any element(textbox and text area)
	 * submit() -
	 * getTitle(), 
	 * getPageSource(), 
	 * getSize(), 
	 * getLocation(), 
	 * getAttribute(), 
	 * getCssValue(), 
	 * sendKeys()
	 * isDisplayed(), 
	 * isEnabled(), 
	 * isSelected()
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("callout");
	    driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//g-flat-button[text()='No Thanks']")).click();
	    WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
	    search.sendKeys("cricbuzz");
	    //Thread.sleep(5000);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='cricbuzz']")));
	    WebElement clickSearchedItem = driver.findElement(By.xpath("//span[text()='cricbuzz']"));
	    clickSearchedItem.click();
	    Dimension size = driver.findElement(By.xpath("//h3[text()='Cricbuzz']")).getSize();
	    System.out.println("size : "+size);
	     Point location = driver.findElement(By.xpath("//h3[text()='Cricbuzz']")).getLocation();
	    System.out.println("location : "+location);
	    int getx = location.getX();
	    System.out.println("getx : "+getx);
	    int gety = location.getY();
	    System.out.println("gety : "+gety);
	    String text = driver.findElement(By.xpath("//h3[text()='Cricbuzz']")).getText();
	    System.out.println("text : "+text);
	    boolean isdisplayed = driver.findElement(By.xpath("//h3[text()='Cricbuzz']")).isDisplayed();
	    System.out.println("isdisplayed : "+isdisplayed);
	    boolean ienabled = driver.findElement(By.xpath("//h3[text()='Cricbuzz']")).isEnabled();
	    System.out.println("ienabled : "+ienabled);
	    driver.findElement(By.xpath("//h3[text()='Cricbuzz']")).click();
	    String title=driver.getTitle();
	    System.out.println("title : "+title);
        driver.quit();
	}

}
