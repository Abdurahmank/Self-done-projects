package Udemy_course;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar_Handling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global
		// implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); //global
		// explicit wait
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#travel_date")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("December 2022")) {
			driver.findElement(By.cssSelector("div[class=datepicker-days] th[class=next]")).click();
		}

		Thread.sleep(2000);

		String date = "23";
		//Grab common attribute//Put into list and iterate
		List<WebElement> l = driver.findElements(By.className("day"));
		int size = l.size();

		for (int i = 0; i < size; i++) {
			String day = driver.findElements(By.className("day")).get(i).getText();

			if (day.equalsIgnoreCase(date)) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
