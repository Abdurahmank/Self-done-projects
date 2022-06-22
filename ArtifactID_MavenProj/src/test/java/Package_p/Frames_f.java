package Package_p;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_f {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://Google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize(); 	 System.out.println("window minimizing");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();  	System.out.println("window full screen");
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame"); 	System.out.println("switching to frame by name");
		Thread.sleep(3000);
		driver.findElement(By.className("interfaceName")).click(); 		System.out.println("clicking on class headline");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();		System.out.println("switchng back to default content");
		driver.manage().window().setSize(new Dimension(800,600));  System.out.println("Setting the window size to our wish");
		

	}

}
