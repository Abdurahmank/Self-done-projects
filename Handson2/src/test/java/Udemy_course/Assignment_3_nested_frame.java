package Udemy_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_3_nested_frame {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //globa
		// implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(20)); //
		// explicit wait
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		nested_frame(driver);
	}

	public static void nested_frame(WebDriver driver){
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		System.out.println("frame count =:"+driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
	}
}
