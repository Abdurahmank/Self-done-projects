package Package_p;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot_class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		//WebElement ele = driver.findElement(By.xpath("//input[@id='imagesrc' and @onchange='uploadimg()']"));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
		ele.click();
		Thread.sleep(3000);
		Robot rob = new Robot();
		String str = "E:\\CV\\Sibin\\Robot.txt";
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys(str);
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}
}
