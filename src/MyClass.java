import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyClass {
	


	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void mySetup () {
		
		driver.get("https://www.google.com");


	}

	
	
	@Test(groups = "abua7mad",priority = 1)
	public void testOne () {
		System.out.println("hello from test 1");
	}
	

	@Test()
	public void testTwo () {
		System.out.println("hello from test 2");
	
		
		
	}
	
	@Test()
	public void testThree () {
		System.out.println("hello from test 3");
	
		
		
	}
	
	@Test(groups = "abua7mad",priority = 2)
	public void testFour () {
		System.out.println("hello from test 4");
	
		
		
	}
	@AfterTest
	public void theEnd () {
		//driver.close();
		


		
		
	}
	
	

}

