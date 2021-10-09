package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_GoogleSearch {
	
	
	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver(); 
		
	}
	
	@Test
	public void googleSearch() {
		
		
		driver.get("https://google.com/");
		GoogleSearchPage.textbox_serch(driver);
		
		GoogleSearchPage.enter_value(driver);
		
		GoogleSearchPage.press_enter(driver);
//		WebElement textbox=driver.findElement(By.name("q"));
//		
//		textbox.sendKeys("Automation Step by Step");
//		
//		textbox.sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		
	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}

}
