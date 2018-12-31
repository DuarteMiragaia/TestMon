package com.googleproject.MoneseFramework.stepFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class  Home {
	WebDriver driver;
	
	@Before // Setup Firefox Driver and Opening the browser Window
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "/Users/dmi35/Projects/JavaAutomation/GoogleExample/Framework/src/test/java/com/googleproject/MoneseFramework/resources/geckodriver.dmg");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setCapability("marionette", true);
		this.driver = new FirefoxDriver(firefoxOptions);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
	
	@After // Closing the session
	public void tearDown() throws InterruptedException {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("^User navigates to Google website$")
	public void user_navigates_to_Google_website() throws Throwable {
		driver.get("https://www.google.pt/");
	}

	@And("^Search box is displayed$")
	public void search_box_is_displayed() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.className("RNNXgb"));
	}
	
	@And("^Feel lucky button is displayed$")
	public void feel_button_is_displayed() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.name("btnI"));
	}
	
	@And("^Checks if is in Home Page$")
	public void search_button_is_displayed() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.name("btnK"));
	}
	
	@And("^Click on Gmail link$")
	public void click_gmail_link() throws Throwable {
		Thread.sleep(2000);
		WebElement gmail = driver.findElement(By.className("gb_P"));
		gmail.click();
	}
	@And("^Gmail page is displayed$")
	public void gmail_page() throws Throwable {
		driver.findElement(By.className("gmail-nav__home-link"));
		Thread.sleep(5000);
	}

}
