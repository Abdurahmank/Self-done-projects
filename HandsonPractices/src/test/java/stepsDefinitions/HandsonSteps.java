//package stepsDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import objectPages.FlipkartLoginObjects;
//
//public class HandsonSteps {
//
//	WebDriver driver;
//	FlipkartLoginObjects flipkart;
//	
//	@Given("^U is in login page$")
//	public void u_is_in_login_page() {
//		
//		WebDriverManager.edgedriver().setup();
//		this.driver =new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//	}
//
//	@When("^U enters <usrnm1> and <pswd1>$")
//	public void u_enters_pswd_and_usrnm(String usrnm1,String pswd1) {
//		
//		FlipkartLoginObjects flipkart = new FlipkartLoginObjects(driver);
//		flipkart.Enter_usrnm(usrnm1);
//		flipkart.Enter_pswd(pswd1);	
//		}
//		
//
//	@And("^click on login$")
//	public void click_on_login() {
//		flipkart.Btn_Click();
//	}
//
//	@Then("^U is able to login$")
//	public void u_is_able_to_login() {
//	}
//	
//
//}
