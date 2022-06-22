package Package_p;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsandPopups {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Alert Box
		driver.findElement(By.xpath("*//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert text= :"+alert1.getText());
		Thread.sleep(4000);
		alert1.accept(); //Clicking OK on Alert

		if(driver.getPageSource().contains("You successfully clicked an alert"));{
			System.out.println("You successfully clicked an alert");
			System.out.println("========================================================");
		}

		//Confirm Box
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("*//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Confirm text= :"+confirm.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		confirm.dismiss();

		if(driver.getPageSource().contains("You clicked: Cancel"));{
			System.out.println("You clicked Cancel on Confirmation Box");
			System.out.println("========================================================");

		}
		
		//Prompt box
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("*//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(4000);
		prompt.sendKeys("AbduRahman.k");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		prompt.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		if(driver.getPageSource().contains("You entered: AbduRahman.k"));{
			System.out.println("You entered: AbduRahman.k");
			System.out.println("========================================================");
			
			driver.quit();

		}
	}
}
