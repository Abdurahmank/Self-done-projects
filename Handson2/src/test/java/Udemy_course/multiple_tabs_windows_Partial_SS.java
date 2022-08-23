package Udemy_course;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiple_tabs_windows_Partial_SS {

	public static void main(String[] args) throws IOException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); //global explicit wait
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();

		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windoIds = driver.getWindowHandles();
		Iterator<String> it = windoIds.iterator();
		String Parent = it.next();
		String Child = it.next();
		driver.switchTo().window(Child);
		driver.get("https://rahulshettyacademy.com/");

		List<WebElement> firstlink = driver
				.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"));
		String courseName = firstlink.get(1).getText();

		
		//for (int j = 0; j < 5; j++) {
		
			driver.switchTo().window(Parent);
			WebElement textBox = driver.findElement(By.cssSelector("[name='name']:nth-of-type(1)"));
			textBox.sendKeys(courseName);
			File src = textBox.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("target\\ele.png"));
			
			//FileUtils.copyFile(src, new File("target\\ele" + j + ".png"));
		//}
			
			//to get height and width specific to a WebElement
			System.out.println(textBox.getRect().getDimension().getHeight()); 
			System.out.println(textBox.getRect().getDimension().getWidth());
		
		driver.quit();
	}

}
