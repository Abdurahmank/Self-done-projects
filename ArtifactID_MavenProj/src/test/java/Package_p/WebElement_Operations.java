package Package_p;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Operations {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.navigate().to("https://Google.com"); //Finding a web element inside
		 * another web element - it is nothing but first getting the surrounding area of
		 * the target webelement and storing it. then with that variable again
		 * '.findelement' for the target elemtnt WebElement form_area
		 * =driver.findElement(By.tagName("form"));
		 * form_area.findElement(By.name("q")).click();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 */ 

		/* //Storing a list of webelements from a list options
		 driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> elements = driver.findElements(By.tagName("select"));

		for(WebElement ele : elements) {
			System.out.println(ele.getText());

			//active element(object just picked/pointed using locator) operations
			driver.navigate().to("https://Google.com");
			driver.findElement(By.name("q")); //active element(object just picked/pointed using locator) operations
			driver.switchTo().activeElement().clear(); //clearing the active element
			driver.switchTo().activeElement().getAttribute("Title"); //fetching title of the active element
		 */	

		/*
		 * //Getting tagname,text, css value driver.navigate().to("https://Google.com");
		 * WebElement SearchBox = driver.findElement(By.name("q")); String tag =
		 * SearchBox.getTagName(); String text = SearchBox.getText(); String font =
		 * SearchBox.getCssValue("font"); System.out.println(tag+ "|"+text+"|"+font);
		 */
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.xpath("(*//input[@type='checkbox'])[1]"));
		System.out.println(checkbox.isEnabled()); //will give true bcz we it is enabled and we can click on it
		System.out.println(checkbox.isSelected()); //will give false as it is not selected already
	}
}


