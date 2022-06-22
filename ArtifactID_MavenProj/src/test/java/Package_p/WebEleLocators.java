package Package_p;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEleLocators {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup(); //Getting Browser with Web driver manager(mavane dependency) no need to setproperty and give path of the driver exe file
		//WebDriverManager.edgedriver().driverVersion("10.02.050.111").setup(); // for getting a specific browser version mentioned by friver version

		WebDriver driver = new EdgeDriver();

		/*
		 * driver.get("https://Google.com");
		 * //driver.navigate().to("https://Google.com"); //Get and Navigate functions
		 * are used to open a webpage WebElement ele = driver.findElement(By.name("q"));
		 * ele.sendKeys("Porche", Keys.ENTER);
		 */

		/*driver.navigate().to("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));//storing a set of web elements in a list

		for(WebElement element : options) {  					//Printing the web elements

			System.out.println(element.getText());*/

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement login = driver.findElement(By.id("btnLogin"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(login)).sendKeys("1234");
		// finding one above element with the help of the below one
		WebElement Pswd = driver.findElement(By.id("txtPassword"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(Pswd)).sendKeys("Abdu");
		// finding one above element with the help of the below one
		
		
		
		
		
		
	}

}


