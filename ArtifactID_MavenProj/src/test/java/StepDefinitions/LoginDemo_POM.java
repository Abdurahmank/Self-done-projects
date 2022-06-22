//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import POM_Pages.LoginPage;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginDemo_POM {
//	
//	WebDriver driver;
//	LoginPage login;
//	
//	@Given("User opens the brosweser")
//	public void User_opens_the_brosweser() {
//		
//		System.out.println("======= I am Inside Login demo_POM========");
//		
//		WebDriverManager.edgedriver().setup();
//		this. driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	
//	@And("User navigates to the site")
//	public void user_navigates_to_site() {
//		
//		driver.navigate().to("https://Google.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://example.testproject.io/web/");
//	}
//	
//	@When("^User enters (.*) and (.*)$")
//	public void User_enters_username_and_password(String username, String password ) {
//		
//		LoginPage login = new LoginPage(driver);    //Creating login page object
//		login.EnterUsername(username);              //taking the function to enter username from login page 
//		login.EnterPaswd(password);					//taking the function to enter password from login page
//		
//		//driver.findElement(By.xpath("*//input[@id='name']")).sendKeys(username);
//		//driver.findElement(By.xpath("*//input[@id='password']")).sendKeys(password);
//	}
//	
//	@And("Clicks on Login button")
//	public void clicks_on_Login_button() {
//		
//		login.ClickLogin(); 						//taking the function to click login button from login page
//		
//		//driver.findElement(By.xpath("*//button[@id='login']")).click();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	
//	@Then("User is able to login to Home page")
//	public void User_is_abele_to_login_to_Home_page() {
//		
//		login.CheckLogout(); 						//taking the function to check logout button is present login page
//		
//		/*
//		 * driver.getPageSource().contains("Logout");
//		 * driver.findElement(By.id("logout")).isDisplayed();
//		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		 * driver.close();
//		 */
//	}
//
//}
