package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("callout");
	     Point getLocation = driver.findElement(By.xpath("//button[@aria-label='No thanks']")).getLocation();
	    System.out.println("getLocation of x : "+getLocation.x);
	    System.out.println("getLocation of y : "+getLocation.y);
	     int getx = getLocation.getX();
	    System.out.println("getx : "+getx);
	    int gety = getLocation.getY();
	    System.out.println("gety : "+gety);
	    driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
        driver.quit();

	}

}
