package windowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	/*
	 * Window handling?
	 * 
	 * 1.How to handle Browser windows in selenium webdriver? 2.What is the
	 * difference between getWindowhandle() and getWindowHandles() methods? 3.How to
	 * switch between multiple browser windows? 4.How to close all browser windows?
	 * 5. how to close specific browser window by choice?
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// return id of single browser window, at run time window id will be generated
		// dynamically
		String windowId = driver.getWindowHandle();
		System.out.println("windowId : " + windowId);
		/*
		 * to get id of browser window two methods are there getWindowHandle() to get
		 * single window id which will return string which is basically window id and
		 * getWindowHandles() which will list of string to get every window id
		 */

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); // opens another browser window[child
																				// window]
		// return ids of multiple window ids, at run time window ids will be generated
		// dynamically
		Set<String> windowIds = driver.getWindowHandles();

		// 1 st approach
		// First method iterator
		Iterator<String> it = windowIds.iterator();
		String parentId = it.next();
		String childWindowId = it.next();
		System.out.println("parentId : " + parentId);
		System.out.println("childWindowId : " + childWindowId);

		// in set duplicates are not allowed in list duplicates are allowed
		// 2nd approach using list/arraylist
		List<String> windowIdsList = new ArrayList(windowIds);// converting set -> list
		String parentWindowId = windowIdsList.get(0);
		String childWindowid = windowIdsList.get(1);

		System.out.println("parentWindowId : " + parentWindowId);
		System.out.println("childWindowid : " + childWindowid);

		driver.switchTo().window(parentWindowId);
		System.out.println("Main window title : " + driver.getTitle());
		driver.switchTo().window(childWindowid);
		System.out.println("Child window title : " + driver.getTitle());

		// 3rd approach
		for (String winId : windowIdsList) {

			// switch to n windows and get the title of all the windows
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println("Title : " + title);
		}

		// used to close single browser window which driver currently pointing
		driver.close();

		// used to close all the browser window
		driver.quit();

		for (String winId : windowIdsList) {

			// switch to n windows and get the title of all the windows
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println("Title : " + title);
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}

	}

}
