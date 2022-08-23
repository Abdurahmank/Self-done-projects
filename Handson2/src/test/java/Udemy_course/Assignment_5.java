package Udemy_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); //global explicit wait
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> rows =driver.findElements(By.xpath("//table[@name='courses']//tr"));
		//1. alternate css - table[name=courses] tr
		//2. WebElement table=driver.findElement(By.id("product"));
		//	  System.out.println(table.findElements(By.tagName("tr")).size());
		
		System.out.println("count of rows =:"+rows.size());
		
		List<WebElement> columns =driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th"));
		//1. alternate css - table[name='courses'] tr:nth-of-type(3) td
		
		System.out.println("count of column =:"+columns.size());
		List<WebElement> row2data = driver.findElements(By.xpath("//table[@name='courses']//tr[3]//td"));
		
		for(int i=0; i<row2data.size();i++) {
			
			System.out.println("Row 2 datas :="+row2data.get(i).getText());
		}
		
		driver.close();
	}

}
