package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browser) {
		System.out.println(browser);
		
		System.out.println(Thread.currentThread().getId());
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();	
			driver = new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();	
			driver = new EdgeDriver();
		}
		
	}
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com/");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teatDown() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}

}
