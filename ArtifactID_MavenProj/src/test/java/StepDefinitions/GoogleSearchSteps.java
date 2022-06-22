//Glue code/back end code/Step definition

package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	/*
	 * 
	 * WebDriver driver;
	 * 
	 * @Given("browser is open") public void browser_is_open() {
	 * System.out.println("browser is open");
	 * 
	 * WebDriverManager.edgedriver().setup(); this.driver = new EdgeDriver();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 * 
	 * @And("User is on search page") public void user_is_on_search_page() {
	 * System.out.println("User is on search page");
	 * driver.navigate().to("https://Google.com");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * @When("User enters a text in the sarch box") public void
	 * user_enters_a_text_in_the_sarch_box() {
	 * System.out.println("User enters a text in the sarch box"); WebElement ele =
	 * driver.findElement(By.xpath("//input[@name=\"q\"]"));ele.sendKeys("Automation step by step");
	}

	@And("Hits enter")
	public void hits_enter() {
		System.out.println("User Hits enter");
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.ENTER);
	}

	@Then("User is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
		System.out.println("User is navigated to the search results");
		driver.getPageSource().contains("Online Courses");


		driver.close();
		driver.quit();

	}

*/}
