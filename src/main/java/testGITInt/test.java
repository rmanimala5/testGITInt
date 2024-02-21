package testGITInt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	@Test(priority=0)
	public void test1() {
<<<<<<< HEAD
		
		WebDriverManager.chromedriver().setup();
		System.out.println("executed!!");
=======
		//WebDriverManager.chromedriver().setup();
>>>>>>> refs/remotes/origin/master
		WebDriver driver = new ChromeDriver();
		System.out.println("executed");
		driver.get("https://www.google.com");
<<<<<<< HEAD
		System.out.println("completed!!");
=======
	        System.out.println("completed");
>>>>>>> refs/remotes/origin/master
	}

}
