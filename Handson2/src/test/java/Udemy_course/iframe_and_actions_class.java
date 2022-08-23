package Udemy_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_and_actions_class {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(20)); //explicit wait
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		drag_and_drop(driver);

	}
public static void drag_and_drop(WebDriver driver) {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	System.out.println("iframe count =:"+driver.findElements(By.tagName("iframe")).size());
	
	//driver.switchTo().frame("name")
	//driver.switchTo().frame(0);
	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	WebElement src =driver.findElement(By.cssSelector("div#draggable"));
	WebElement dst =driver.findElement(By.cssSelector("div#droppable"));
	
	Actions a =new Actions(driver);
	a.dragAndDrop(src, dst).build().perform();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
}
}
