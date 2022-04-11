package stepDefinition9;

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

	@When("^click open Location$")
	public void i_want_open_about_us() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();	
		driver.findElement(By.xpath("//*[@id=\"hs-eu-confirmation-button\"]")).click();
	}

	@Then("^succesfully go to Location$")
	public void i_can_open_about_us_succesfully() throws Throwable {
		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/div[3]/div/div/ul/li[1]/a")).click();
	}
}
