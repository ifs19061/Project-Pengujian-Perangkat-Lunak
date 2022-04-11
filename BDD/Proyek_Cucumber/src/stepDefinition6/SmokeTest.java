package stepDefinition6;

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

	@When("^I want open admin page$")
	public void i_want_open_admin_page() throws Throwable {
		driver.findElement(By.xpath("*//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
	}//

	@Then("^I want to clean database$")
	public void i_want_to_clean_database() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[1]/form/table/tbody/tr/td[2]/button")).click();
	}
}

