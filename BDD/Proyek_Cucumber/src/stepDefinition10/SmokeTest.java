package stepDefinition10;

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

	@When("^click to login$")
	public void i_want_to_login() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("nesana");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("nesana05");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	}

	@Then("^send to request loan$")
	public void i_can_request_loan_succesfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id=\"downPayment\"]")).sendKeys("500");
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
	}
}
