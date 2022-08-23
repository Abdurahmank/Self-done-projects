package Udemy_course;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DriverScope {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //globa
		// implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(20)); //
		// explicit wait
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// Get the total count of link in the page
		// all links will have 'a' tag
		System.out.println("Total links/a tags count=:" + driver.findElements(By.tagName("a")).size());

		// get the links of the footer alone
		// pointing to footer, or limiting driver scope to footer alone
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

		// taking footerdrive's (footer object) anchor tags
		System.out.println("Footer links/a tags count =:" + footerdriver.findElements(By.tagName("a")).size());

		// taking link count of first column of footer
		// total xpath = //div[@id='gf-BIG']/table/tbody/tr/td[1]/ul, but we already
		// reached to the id using 'footerdriver' by referring it taking the rest path
		WebElement driverColumn = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int size = driverColumn.findElements(By.tagName("a")).size();
		System.out.println("Column links/a tags count =: " + size);
		// System.out.println("Column links/a tags count =:
		// "+driverColumn.findElements(By.tagName("a")).size());

		// clicking on each link
		for (int i = 1; i < size; i++) {

			// pressing Ctrl button and entering on link so that it will be open in a new tab
			String ClickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			// passing the strings in all links
			driverColumn.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);
		}

		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> iter = tabs.iterator();
		
		int j=0;
		while(iter.hasNext()) {
			j++;
			driver.switchTo().window(iter.next());
			System.out.println("Title of "+j+"th tab :"+driver.getTitle());
		}
		
		driver.quit();

	}

}
