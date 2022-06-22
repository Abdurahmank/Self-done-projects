package Package_p;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits_w {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("Https://Google.com");
		driver.manage().window().maximize();

		// implicit waits - polling frequency is 500 milli seconds, as soon as the webdriver finds the element it will go for action/execution
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(By.name("q")).sendKeys("https://automationstepbystep.com/",Keys.ENTER);
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));

		//Explicit wait- driver waits until particular condition is met, polling frequency is 500 milli seconds
		/*
		 * WebDriverWait variable = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * variable.until(ExpectedConditions.elementToBeClickable(By.linkText(
		 * "https://automationstepbystep.com/"))).click();
		 */

		//Fluent wait - same as explicit wait,additionally here we can change the polling time and ignore exceptions
		/*
		 * Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
		 * .ignoring(NoSuchElementException.class) .withTimeout(Duration.ofSeconds(2))
		 * .pollingEvery(Duration.ofSeconds(2));
		 * 
		 * fluentwait.until(ExpectedConditions.elementToBeSelected(By.partialLinkText(
		 * "https://automationstepbystep.com/online-courses/")));
		 */

	}

}
