package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement textbox=null;


	public static WebElement textbox_serch(WebDriver driver) {

		textbox=driver.findElement(By.name("q"));
		return textbox;
	}

	public static void enter_value(WebDriver driver) {

		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	public static void press_enter(WebDriver driver) {

		textbox.sendKeys(Keys.RETURN);
	}
}
