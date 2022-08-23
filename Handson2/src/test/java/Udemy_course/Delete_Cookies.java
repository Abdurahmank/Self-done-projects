package Udemy_course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_Cookies {

	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().deleteAllCookies(); //deletes all cookies
		driver.manage().deleteCookieNamed("Session key"); //deletes a specific cookie whos name we know
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();

	}

}
