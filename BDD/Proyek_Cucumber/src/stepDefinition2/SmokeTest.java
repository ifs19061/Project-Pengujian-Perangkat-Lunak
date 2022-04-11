package stepDefinition2;

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

	@When("^click open contact$")
	public void i_want_open_contact() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")).click();
			
	}

	@Then("^send the messages to contact$")
	public void i_can_send_message_succesfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("PPMPL");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kelompok3@gmail.com");	
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("088966562456");	
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Ini adalah Proyek Test Cucumber");
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
	}
}
