package com.apvg.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.out.println("Before");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@Given("Launch Url and Navigate to Login page")
	public void launch_url_and_navigate_to_login_page() throws InterruptedException {
		System.out.println("Hi");
		driver.navigate().to("https://ecommerce-playground.lambdatest.io/");
		Thread.sleep(15000);
	}

	@When("Enter {string} and {string} in login page")
	public void enter_and_in_login_page(String username, String password) {
	   
	}

	@When("Do the sum for {int} and {int}")
	public void do_the_sum_for_and(Integer int1, Integer int2) {
	    
	}

	@When("Concatenate strings {string} and {string}")
	public void concatenate_strings_and(String string, String string2) {
	  
	}
	
	@Then("Verify Home page")
	public void verify_home_page() {
	  
	}
	
	@Then("sum should be {int}")
	public void sum_should_be(Integer int1) {
	
	}
	
	@When("Enter Invalid username and password in login page")
	public void enter_invalid_username_and_password_in_login_page() {

	}

	@Then("Verify Error Message")
	public void verify_error_message() {
	   
	}
	
	@After
	public void tearDown() {
		
		driver.close();
		
		driver.quit();
	}

}
