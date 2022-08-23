package Udemy_course;


import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Static_dropdown.class)
@Test
public class Static_dropdown implements ITestListener {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		// Selecting round trip checkbox and back to oneway trip

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // ctl00_mainContent_rbtnl_Trip_1
		Thread.sleep(2000);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		}

		// Dynamic drop_down handling (From to boxes)

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // alternate xpath without index is given below

		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
		// { parent }{ child }
		System.out.println("Dynamic Dropdown handled");
		Thread.sleep(3000);

		// Current date selection from calendar
		try {
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			// driver.findElement(By.xpath("//a[@class='ui-state-default
			// ui-state-highlight']")).click();
			// driver.findElement(By.xpath("//div[@id='ui-datepicker-div']
			// //a[@class='ui-state-default ui-state-highlight']")).click();
		} catch (NoSuchElementException e) { // No such element exception handling

		} // corresponding css selector= (".ui-state-default.ui-state-highlight"), xpath =
			// //a[@class='ui-state-default ui-state-highlight']
		finally {
			System.out.println("Calendar failed");
			// driver.close();
		}

		Thread.sleep(2000);

		// to check the count of check boxes

		WebElement ele = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		System.out.println(ele.isSelected());
		Assert.assertFalse(ele.isSelected());
		ele.click();
		System.out.println(ele.isSelected());
		Assert.assertTrue(ele.isSelected()); // applying assertion

		List<WebElement> checkbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Check box count:=" + checkbx.size());

		// Passenger drop down handling
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++) { // clicking the adult button 4 times
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();

		// ------------------------------------------------------------------

		// Suggestive dropdown handing
		driver.findElement(By.id("autosuggest")).sendKeys("ar");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

		for (WebElement opt : options) {
			if (opt.getText().equalsIgnoreCase("Argentina")) {
				opt.click();
				break;
			}
		}
		System.out.println("Suggestive Dropdown handled");

		// currency selection
		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select sel = new Select(currency);
		sel.selectByVisibleText("USD");

		// Clicking search button
		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_btn_FindFlights]")).click();
		// driver.findElement(By.cssSelector("input[value=Search]")).click();
		// driver.findElement(By.xpath("//input[@value='Search']")).click();
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		Thread.sleep(3000);
		driver.close();
	}

	@AfterTest
	public void Failed_Screenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("Handson2\\target\\fail.jpeg"));
			driver.close();

		}
	}

}
