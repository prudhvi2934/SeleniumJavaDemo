package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class ExtentReportBasicDemo {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        
     // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver(); 
        
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        
		driver.get("https://google.com/");
		 // log with snapshot
        test.pass("Entered google");

		GoogleSearchPage.textbox_serch(driver);
		
		GoogleSearchPage.enter_value(driver);
		
		GoogleSearchPage.press_enter(driver);
		 test.pass("google search pass");
		
		driver.close();
		driver.quit();
		
		extent.flush();
		
        
	}

}
