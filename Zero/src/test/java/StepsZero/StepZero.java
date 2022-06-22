package StepsZero;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Objects.LoginObj;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepZero {

	WebDriver driver;
	LoginObj flipkart;

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.edgedriver().setup();
		this.driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	@When("^user enters valid(.*)and(.*)$")
	public void user_enters_valid_usrnm1_and_pswd1(String usrnm1, String pswd1) {
		LoginObj flipkart = new LoginObj(driver);
		flipkart.Enter_usrnm(usrnm1);
		flipkart.Enter_pswd(pswd1);
	}
	
	
//	@When("user enters valid (.*) and (.*)")
//	public void user_enters_valid_username_and_password(String usrnm1, String pswd1) {
//		
//		LoginObj flipkart = new LoginObj(driver);
//		flipkart.Enter_usrnm(usrnm1);
//		flipkart.Enter_pswd(pswd1);
//	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
		LoginObj flipkart = new LoginObj(driver);
		flipkart.Btn_Click();
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	}
//	@When("user enters invalid username and password")
//	public void user_enters_invalid_username_and_password() {
//	}
//	@Then("error message displayed")
//	public void error_message_displayed() {
//	}


	
}
