package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		JavascriptExecutor  exe = (JavascriptExecutor)driver;
		exe.executeScript("window.scroll(0,450)", "");
		Thread.sleep(3000);
		exe.executeScript("window.scroll(0,-450)", "");
		Thread.sleep(3000);
		exe.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		exe.executeScript("window.scrollTo(0,0)","");
		Thread.sleep(3000);
		// goto the specific element
		WebElement link = driver.findElement(By.linkText("online tool"));
		exe.executeScript("arguments[0].scrollIntoView(true);", link);
		*/
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		JavascriptExecutor  exe = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		exe.executeScript("document.querySelectorAll('span[class=ui-chkbox-label]')[0].click()");
		Thread.sleep(3000);
		exe.executeScript("return document.documentElement.innerText;").toString();
		Thread.sleep(3000);
		driver.quit();

	}

}
