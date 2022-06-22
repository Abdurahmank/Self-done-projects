package Package_p;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PANandADHARLinkStatusCheck {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://eportal.incometax.gov.in/iec/foservices/#/pre-login/link-aadhaar-status");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("*//input[@id='mat-input-0']")).sendKeys("BVXPA5255Q");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("*//input[@ID='mat-input-1']")).sendKeys("244127124476");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Submit = driver.findElement(By.xpath("*//button[@class='large-button-primary floatRight marginContinue']"));
		Submit.isEnabled();
		Submit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("*//div[@class='modal-body d-flex flex-wrap align-items-center']")); 
		Alert alert2 = driver.switchTo().alert();
		System.out.println("PAN Card link status is :"+alert2.getText());

	}

}
