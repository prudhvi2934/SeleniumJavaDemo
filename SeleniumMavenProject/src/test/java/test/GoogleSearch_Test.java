package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://google.com/");
		WebElement textbox=driver.findElement(By.name("q"));
		
		textbox.sendKeys("Automation Step by Step");
		
		textbox.sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}

}
