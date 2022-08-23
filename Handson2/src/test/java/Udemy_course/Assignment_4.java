package Udemy_course;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(20)); //global explicit wait
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		

		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.cssSelector("#checkBoxOption2"));
		checkbox.click();
		
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		//String opt = driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset/label[2]")).getText();
		//String chkbx = ele1.getText();
		System.out.println(opt);
		
		
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.cssSelector("select#dropdown-class-example"));
		Select s = new Select(ele2);
		s.selectByVisibleText(opt);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(opt);
		driver.findElement(By.cssSelector("#alertbtn")).click();

		
		Alert al = driver.switchTo().alert();
		String str = al.getText();
		
		if(str.contains(opt)) {
			System.out.println("Alert box contains "+opt);
		}
		else
			System.out.println("Alert box doesnt contains "+opt);
	al.accept();
	System.out.println("Alert accepted");
	driver.quit();
	}
	

}
