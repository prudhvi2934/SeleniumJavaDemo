package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_GoogleSearch {
	
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver(); 
		
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
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}

}
