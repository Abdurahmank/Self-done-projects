package Package_p;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robot2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score?fftid=101003");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='browse']")).click();
		Thread.sleep(3000);
		
		Robot rob= new Robot();
		//Storing file path
		StringSelection filepath = new StringSelection("E:\\CV\\Sibin\\Resume_Sibin_Alex_2c.pdf");
		Thread.sleep(1000);
		
		//copying content to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		System.out.println("copying content to clipboard");
		
		Thread.sleep(3000);
		//Press ctrl + V
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		System.out.println("Press ctrl + V");
		
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_V);
		
		//Releasing both keys
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		System.out.println("Press Enter Key");
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_ENTER);
		
driver.close();

		
	}

}
