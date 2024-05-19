import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyClass1 {
	

     WebDriver driver = new ChromeDriver();
     SoftAssert myAssertion = new SoftAssert();

	
	@BeforeTest
	public void mySetup () {
		
		driver.get("https://www.google.com");


	}

	
	
	@Test()
	public void check_the_title () {
		
		String ExpectedTitle = "google lojain";
		
		
		String ActualTitle = driver.getTitle();
	
		myAssertion.assertEquals(ActualTitle, ExpectedTitle);
		
		myAssertion.assertAll();
		
		
	}
	
	

//	@Test()
//	public void testTwo () {
//		System.out.println("hello from test 2");
//	
//		
//		
//	}
//	

		
	
//	@AfterTest
//	public void theEnd () {
//		//driver.close();
//		
//
//
//		
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
