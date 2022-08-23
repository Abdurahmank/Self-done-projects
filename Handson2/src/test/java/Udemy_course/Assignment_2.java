package Udemy_course;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment_2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //globa
		// implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(20)); //
		// explicit wait
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		Switch(driver);
	}

	public static void Switch(WebDriver driver) {

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//div[@class='example']/a")).click();

		Set<String> w = driver.getWindowHandles();
		Iterator<String> it = w.iterator();
		String Parent = it.next();
		String child = it.next();

		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		driver.switchTo().window(Parent);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

	}

}
