package StepDefenition;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before(order = 1)
	public void setUpDriver() {		
		System.setProperty("webdriver.chrome.driver", "E:\\Batch2\\CucumberPro\\chromedriver.exe");	
		driver=new ChromeDriver();
	}
	
	@Before(order = 2)
	public void setupWeb() {
		
	driver.get("https://www.facebook.com/");

	}
	
	@After
	public void tearDown() {       
		driver.close();
		driver.quit();
	}

}
