package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name = "kavi";
	String place;
	
	@Test
	public void failIntentionally() {
		
		Assert.assertEquals(name, "kavi");
		Assert.assertNotEquals(name, "Kavi");
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		Assert.assertSame(name, name);
		Assert.assertNotSame(name, "Kavi");
		Assert.assertNull(place);
		Assert.assertNotNull(name);
		// Assert.fail();
		
	}

}
