package stepDefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/");
	}

	@When("^click open about us$")
	public void i_want_open_about_us() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();		
	}

	@Then("^succesfully go to about us$")
	public void i_can_open_about_us_succesfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[3]/a")).click();
	}
}
