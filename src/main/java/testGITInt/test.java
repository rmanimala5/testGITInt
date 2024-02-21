package testGITInt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	@Test(priority=0)
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		System.out.println("executed!!");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("completed!!");
	}

}
