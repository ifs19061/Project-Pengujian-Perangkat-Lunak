package stepDefinition3;

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

	@When("^click Register$")
	public void i_want_register_to_website() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Kelompok");
		driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("PA PPMPL");
		driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Laguboti");
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Toba");
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("AS");
		driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("17542");
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("088966562456");	
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("123567");	
		driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("Kelompokppmpl");
		driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("ppmpl123");
		driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("ppmpl123");
	}

	@Then("^register me$")
	public void i_can_register_succesfully() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	}
}
