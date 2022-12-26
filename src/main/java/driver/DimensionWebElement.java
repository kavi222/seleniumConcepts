package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("callout");
	    
	    Dimension getSize = driver.findElement(By.xpath("//button[@aria-label='No thanks']")).getSize();
	    
	    System.out.println("get size height : "+getSize.height);
	    System.out.println("get size width : "+getSize.width);
	    int getHeight = getSize.getHeight();
	    System.out.println("getHeight : "+getHeight);
	    int getWidth = getSize.getWidth();
	    System.out.println("getWidth : "+getWidth);
	    driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
        driver.quit();
	}

}
