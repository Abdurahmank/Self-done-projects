package Udemy_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action$frame {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global
		// implicit wait
		WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		mousehover(driver, a);
		EnterandSelectText(driver, a);
		driver.close();

	}

	public static void mousehover(WebDriver driver, Actions a) throws Exception {
		Thread.sleep(2000);
		WebElement hover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(hover).contextClick(hover).build().perform();
		Thread.sleep(2000);
	}

	public static void EnterandSelectText(WebDriver driver, Actions a) {
		String h = "HELLO";
		String lower =h.toLowerCase();
		WebElement EnterAndSelecText = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(EnterAndSelecText).click().keyDown(Keys.SHIFT).sendKeys(lower).doubleClick().build().perform();

	}
}
