package demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		seleniumWaits();
	}
	
	
	public static void seleniumWaits() throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver(); 
		
		driver.get("https://google.com/");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement= driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
		       
		       if(linkElement.isEnabled()) {
		    	   System.out.println("Element Found");
		    	   
		       }
		       return linkElement;
		     }
		     
		   });
		   
		   element.click();

		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}
}
