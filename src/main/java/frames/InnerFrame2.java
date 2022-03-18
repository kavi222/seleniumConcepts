package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrame2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult"); //switch into outer iframe
		driver.switchTo().frame(0);
		System.out.println("Text present in inner iframe : "+driver.findElement(By.xpath("//h1")).getText());
		driver.switchTo().parentFrame();// go to parent frame/ outer frame
		System.out.println("Text present in outer iframe : "+driver.findElement(By.xpath("//body/p")).getText());
		
	}

}
