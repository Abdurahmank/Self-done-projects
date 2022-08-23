package Udemy_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative_Locators_in_selenium4 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); //global explicit wait
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();

		WebElement ele1 =driver.findElement(By.cssSelector("[name='name']"));
		System.out.println("Name above the textBox := "+driver.findElement(with(By.tagName("label")).above(ele1)).getText());
		
		
				WebElement ele2 = driver.findElement(By.cssSelector("input[name='bday']"));
				driver.findElement(with(By.tagName("input")).below(ele2)).click();
		
		
						WebElement ele3 =driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]"));
						driver.findElement(with(By.tagName("input")).toLeftOf(ele3)).click();
		
		
								WebElement ele4 =driver.findElement(By.cssSelector("#inlineRadio1"));
								System.out.println("label of student checkBox:= "+driver.findElement(with(By.tagName("label")).toRightOf(ele4)).getText());
	}

}
