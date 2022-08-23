package Udemy_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_WebTable_fns {

	public static void main(String[] args) throws InterruptedException, NumberFormatException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global
		// implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); //global
		// explicit wait
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		//js.executeScript("document.querySelector('.tableFixHead').scrollleft=5000; - to scroll horizontally
		
		int val=0;
		List<WebElement> column = driver.findElements(By.cssSelector("td:nth-child(4)"));
		try {
		for(int i=0; i<column.size();i++) {
			

			val = val + Integer.parseInt(column.get(i).getText());
			
		}
		}
		catch(Exception NumberFormatException) {
			
		}
		System.out.println("Value got from for loop :"+val);
		
		int total =Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
		System.out.println("Value got from for site :"+total);
			Assert.assertEquals(val, total);
		driver.close();
	}

}
