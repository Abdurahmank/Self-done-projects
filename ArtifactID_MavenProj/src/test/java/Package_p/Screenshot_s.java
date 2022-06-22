package Package_p;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot_s {
	
	public static void main(String[] args) throws IOException {
	
System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("https://Google.com");

/*
 * File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 * //taking screenshot FileUtils.copyFile(srcFile,new File("./image1.png"));
 */
		
		WebElement ele = driver.findElement(By.className("lnXdpd"));
		File srcFile1 = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("./image2.png")); //Screenshot of a particular element in webpage
		
	}
}
