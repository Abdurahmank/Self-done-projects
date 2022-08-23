package Udemy_course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSL_certificate_bypassing {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions, FirefoxOptions, SafariOptions etc 
		EdgeOptions option =new EdgeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(option);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //global implicit wait
		// WebDriverWait t = new WebDriverWait(driver, Duration.ofSeconds(10)); //global explicit wait
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.close();
	}

}
