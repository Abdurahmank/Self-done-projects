package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;

//	public TestBase(WebDriver driver) {
//		this.driver = driver;
//	}

	public WebDriver WebDrivermanager() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\Resources\\GlobalData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAurl");

		if (driver == null) { // initialising driver again only if no other driver session is open

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		} else if (BrowserName.equalsIgnoreCase("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		} else
			System.out.println("Undefined browser");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}

		return driver;

	}

}
