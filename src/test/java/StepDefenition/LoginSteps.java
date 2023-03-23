package StepDefenition;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginSteps {
	
	 WebDriver driver = Hooks.driver;

	@Given("user enters into facebook page")
	public void user_enters_into_facebook_page() {
  
	
	   
	   driver.manage().window().maximize();
	   
	   	
	}

	@Given("user enter valid username")
	public void user_enter_valid_username() {
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("MisterXyz");
	  
	}

	@Given("user enter valid password")
	public void user_enter_valid_password() {
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("qwertyuiop123");
		
	}
	
	
	@Given("user enter invalid username as {string}")
	public void user_enter_invalid_username_as(String username) {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(username);
	}

	@Given("user enter invalid password as {string}")
	public void user_enter_invalid_password_as(String password) {
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys(password);
	}

	@When("user selects login button")
	public void user_selects_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	 
	}

	@Then("facebook opens sussesfully")
	public void facebook_opens_sussesfully() {

	}



	@Then("user can see the warning message")
	public void user_can_see_the_warning_message() {
		
		String Expected="The password that you've entered is incorrect. Forgotten password?";
		WebElement warnings = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String actual = warnings.getText();
		if(Expected.equals(actual)) {
			System.out.print("Test passed");
		}
		
	
	  
	}
	
}
