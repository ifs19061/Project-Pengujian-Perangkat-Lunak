package stepDefinition7;
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

	@When("^I forgot login info$")
	public void i_forgot_login_info() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a")).click();
	}

	@Then("^I want to find my login info$")
	public void i_can_to_find_my_login_info() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Kelompok");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("PA PPMPL");
		driver.findElement(By.xpath("//*[@id=\"address.street\"]")).sendKeys("laguboti");
		driver.findElement(By.xpath("//*[@id=\"address.city\"]")).sendKeys("toba");
		driver.findElement(By.xpath("//*[@id=\"address.state\"]")).sendKeys("AS");
		driver.findElement(By.xpath("//*[@id=\"address.zipCode\"]")).sendKeys("17542");
		driver.findElement(By.xpath("//*[@id=\"ssn\"]")).sendKeys("1234567");
		driver.findElement(By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")).click();
	}
}