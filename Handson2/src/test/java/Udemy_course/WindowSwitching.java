package Udemy_course;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //globa implicit wait
		//WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(20)); // explicit wait
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		switch_window(driver);

	}

	public static void switch_window(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class=blinkingText]")).click();
		//t.until(ExpectedConditions.elementToBeClickable(By.xpath("span[class='icon fa fa-user']")));//("//a[contains(text(),'JOIN NOW')]"))); //("//h1[contains(text(),'Documents request')]")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> i = windowIds.iterator();
		String parent = i.next();
		String child = i.next();
		driver.switchTo().window(child);
		
		//Taking the mail id out of the para using String methods
		String mail =driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].split(" ")[1];
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#username")).sendKeys(mail);

	}
}
