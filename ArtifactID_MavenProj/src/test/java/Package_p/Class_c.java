package Package_p;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_c {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://Google.com");
		
		String originalWindow = driver.getWindowHandle(); // Storing the Google address as string value in "originalWindow"
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));

		driver.get("https://automationstepbystep.com");
		System.out.println("The URL is :"+driver.getCurrentUrl()); //Waits
		System.out.println("The title is :"+driver.getTitle());

		/*
		 * Thread.sleep(3000); driver.navigate().back(); Thread.sleep(3000);
		 * driver.navigate().forward(); Thread.sleep(3000); driver.quit();
		 */

		driver.switchTo().newWindow(WindowType.WINDOW); //Creating a new browser window
		driver.switchTo().newWindow(WindowType.TAB); //Creating a new browser window tab
		driver.switchTo().window(originalWindow); //Switching back to original window
		Thread.sleep(2000);
		driver.close(); // Only closing the extra tabs
		Thread.sleep(2000);
		driver.quit(); //Closing all the browser windows
	}

}
