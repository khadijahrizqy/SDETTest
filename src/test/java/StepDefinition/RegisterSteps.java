package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.setProperty("webdriver.chrome.driver", "/CucumberJava/src/test/resources/drivers/chromedriver");
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
		System.out.println("Browser is open");
	    
	}

	@Given("user is on register page")
	public void user_is_on_register_page() {
		driver.navigate().to("https://dashboard.melaka.app/register");
		System.out.println("User is on register page");
	}

	@When("user enters valid nama")
	public void user_enters_valid_nama() throws InterruptedException {
		driver.findElement(By.id("input-:R36l6:")).sendKeys("1 Aura 2 Keindahan");
		System.out.println("User enters valid nama");
		
		Thread.sleep(2000);
	}

	@And("user enters valid nomor telepon")
	public void user_enters_valid_nomor_telepon() {
		driver.findElement(By.id("input-:R156l6:")).sendKeys("8512345678");
		System.out.println("User enters valid nomor telepon");
	}

	@And("user enters valid nama bisnis")
	public void user_enters_nama_bisnis() {
		driver.findElement(By.id("input-:R76l6:")).sendKeys("CV-tSM,WEL.");
		System.out.println("User enters nama bisnis");
	}

	@And("user clicks one of tipe bisnis")
	public void user_clicks_one_of_tipe_bisnis() {
		
		System.out.println("User clicks tipe bisnis");
	}

	@And("user enters valid nama e-mail")
	public void user_enters_valid_nama_e_mail() {
		driver.findElement(By.id("input-:Rb6l6:")).sendKeys("yainilahadanya@gmail.com");
		System.out.println("User enters valid nama e-mail");
	}

	@And("user enters valid password")
	public void user_enters_valid_password() {
		driver.findElement(By.id("input-:Rd6l6:")).sendKeys("abcd123");
		System.out.println("User enters valid password");
	}

	@And("user reenters password")
	public void user_reenters_password() {
		driver.findElement(By.id("input-:Rf6l6:")).sendKeys("abcd123");
		System.out.println("User reenters password");
	}

	@And("user clicks checkbox")
	public void user_clicks_checkbox() {
		driver.findElement(By.id("register__checkbox__tnc")).click();
		System.out.println("User clicks checkbox");
	}

	@And("user clicks Daftar button")
	public void user_clicks_daftar_button() {
		// how to click a button? driver.findElement(By.(""))
		// driver.findElement(checkBoxTNC).click();
		System.out.println("User clicks Daftar button");
	}

	@Then("user is navigated to the confirmation page")
	public void user_is_navigated_to_the_confirmation_page() {
		
		System.out.println("User navigated to home page");
		
		driver.close();
		driver.quit();
	}
}
