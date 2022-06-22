package Selenium_Handson;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement view=driver.findElement(By.xpath("//a[contains(text(),'Slow Resources')]"));
		Coordinates co =((Locatable)view).getCoordinates(); //Getting coordinated of the element and moving to it
		co.inViewPort();
		
		Thread.sleep(5000);
		
		WebElement drag =driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
		Coordinates ce = ((Locatable)drag).getCoordinates(); //Switching view port back to drag and drop link
		ce.inViewPort();
		
		Thread.sleep(5000);
		drag.click();

		WebElement src = driver.findElement(By.xpath("//div[@id='column-b']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='column-a']"));
		
		//WebElement src = driver.findElement(By.xpath("//span[contains(text(),'Johns')]"));
		//WebElement dest = driver.findElement(By.xpath("//div[@id='treeTarget']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		//act.moveToElement(src).build().perform();
		
		Thread.sleep(3000);
		act.dragAndDrop(src, dest).perform();
		//act.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
		
		
	}
}
