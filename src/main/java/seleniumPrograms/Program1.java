package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	/*
	 * 1. Write a script to open google.com and verify that title is google and also verify that it is redirected to google.co.in
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Pass: Title is correct");
		}else {
			System.out.println("Fail: Title is incorrect");
		}
		
		String url = driver.getCurrentUrl();
		if(url.contains("google.co.in")) {
			System.out.println("Pass: URL has co.in");
		}else {
			System.out.println("Fail: URL don't have co.in");
		}
       driver.quit();
	}

}
