//package StepsForHooks;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class HooksDemoSteps {
//
//	WebDriver driver;
//
//	@Before(value="@smoke",order=1)													//When multiple @before present and order is given otherwise execution happens alphabetical order of the functions //tags are also used here
//	public void BrowserSetup() {
//
//		System.out.println("=======I am inside @Before hook 1, @Before=======");
//
//		WebDriverManager.edgedriver().setup();
//		this.driver = new EdgeDriver();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//		driver.manage().window().maximize();
//	}
//	
//	@Before(order=0)
//	 public void hooksOeder() {
//		System.out.println("=========I am Inside Ordered hook 0, @Before=========");
//	}
//
//
//	@After(order=1)															//this @After comes second 
//	public void Close_browser() {
//		
//		System.out.println("=======I am inside order 1, @After hook=======");
//		
//		driver.close();
//		driver.quit();
//	}
//	
//	@After(order=2)															//order reverses here 2 comes first, don't know y
//	public void Close_browser2() {
//		System.out.println("=====I am inside order 2, @After hook=====");
//	}
//	
//	@BeforeStep
//	public void BeforeSteps() {
//		System.out.println("========I am inside @BeforeSteps=======");
//	}
//
//	@AfterStep
//	public void AfterSteps() {
//		System.out.println("========I am inside @AfterSteps=======");
//	}
//	
//	//====================================================================================
//	
//	
//	
//	
//	
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//	}
//
//	@When("User enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//	}
//
//	@And("Clicks on login button")
//	public void clicks_on_login_button() {
//	}
//
//	@Then("User is navigated to Home page")
//	public void user_is_navigated_to_home_page() {
//	}
//
//
//}
