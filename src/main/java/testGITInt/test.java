package testGITInt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	WebDriver driver;
	@Test(priority=0)
	public void test1() {

		
		WebDriverManager.chromedriver().setup();
		System.out.println("executed!!");
		 ChromeOptions options = new ChromeOptions();
		 
	     // options.addArguments("headless");
	      
	        // Instantiate ChromeDriver with headless option
	         driver = new ChromeDriver(options);

		
		System.out.println("executed");
		driver.get("https://www.google.com");

		System.out.println("Google browser launched");

	}
	
	@Test(priority=1)	
public void test2() {

		
	

		 
	     // options.addArguments("headless");
	      
	        // Instantiate ChromeDriver with headless option
	      

		
		System.out.println("executed");
		driver.get("https://www.yahoo.com");

	     System.out.println("yahoo browser launched");

	}


}
