package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {

	static WebDriver driver = null;
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver(options);
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}
}
