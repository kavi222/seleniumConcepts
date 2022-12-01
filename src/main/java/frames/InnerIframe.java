package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		WebElement outerIframe = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerIframe);
		WebElement innerIframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerIframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kavi");
	}

}
