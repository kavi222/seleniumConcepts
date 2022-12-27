package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Test(groups= {"parameter"})
	@Parameters("Name")
	public void printName(String value) {
		System.out.println("Name is "+value);
	}

}
