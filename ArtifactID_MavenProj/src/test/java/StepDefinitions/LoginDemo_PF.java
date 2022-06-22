//package StepDefinitions;
//
//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pagefactory.HomePage_PF;
//import pagefactory.LoginPage_PF;
//
//
//public class LoginDemo_PF {
//
//
//	WebDriver driver;
//	LoginPage_PF login;
//	HomePage_PF home;
//
//	@Given("User opens the brosweser") public void User_opens_the_brosweser() {
//
//		System.out.println("=========I am inside LoginDemo_PF class========");   //Running class verification
//
//		WebDriverManager.edgedriver().setup(); 
//		this. driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
//
//	@And("User navigates to the site") public void user_navigates_to_site() {
//
//		driver.navigate().to("https://Google.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://example.testproject.io/web/"); }
//
//	@When("^User enters (.*) and (.*)$") 
//	public void User_enters_username_and_password(String username, String password ) {
//		login = new LoginPage_PF(driver); 						//Creating object or calling the constructor from LoginDemo_PF
//		login.EnterUserName(username);
//		login.EnterPassword(password);
//
//	}
//
//
//	@And("Clicks on Login button") public void clicks_on_Login_button() {
//
//		login.ClickonLogin();
//	}
//
//	@Then("User is abele to login to Home page")
//	public void User_is_abele_to_login_to_Home_page() {
//		home = new HomePage_PF(driver);							//Creating object or calling the constructor from HomePage_PF
//		home.check_logout_displayed();
//	}
//
//}
