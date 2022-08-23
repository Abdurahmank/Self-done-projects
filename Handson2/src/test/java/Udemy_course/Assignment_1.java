package Udemy_course;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1 {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		LoginPage(driver, t);
		NextPage(t, driver);
		driver.close();
	}

	public static void LoginPage(WebDriver driver, WebDriverWait t) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]/following-sibling::span")).click();

		t.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();

		WebElement ele1 = driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(ele1);
		s.selectByVisibleText("Student");

		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();

	}

	public static void NextPage(WebDriverWait t, WebDriver driver) {

		// t.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("btn btn-info")));
		
		t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Shop Name')]")));
		List<WebElement> items = driver.findElements(By.xpath("//button[contains(text(),'Add')]"));// btn btn-info
		
		for (int i = 0; i < items.size(); i++) {
			
			items.get(i).click();
			//driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click(); //no need to use this because list already captured all the elements
			driver.findElement(By.xpath("//div[@id='navbarResponsive']//following-sibling::a")).click();

		}

	}
}
