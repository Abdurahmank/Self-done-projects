package Udemy_course;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Onlineshopping {

	WebDriver driver;
	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5)); //explicit wait
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		List<String> ItemsNeeded = new ArrayList<String>();
		ItemsNeeded.add("Brocolli");
		ItemsNeeded.add("Cucumber");
		ItemsNeeded.add("Beetroot");
		ItemsNeeded.add("Walnuts");
		
		Thread.sleep(2000);
		AddItems(driver,ItemsNeeded);
		cart(driver, w);
		//driver.close();
		
	}
	
	
	
	
	public static void AddItems(WebDriver driver,List<String> ItemsNeeded) throws InterruptedException {
		
		int j = 0;
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String ActualProduct = name[0].trim();

			if (ItemsNeeded.contains(ActualProduct)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == ItemsNeeded.size())
					break;
			}
		}
		System.out.println("product list size=: " + ItemsNeeded.size());
		Thread.sleep(2000);
		
	}
	
	public static void cart(WebDriver driver,WebDriverWait w) {
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}




	}


