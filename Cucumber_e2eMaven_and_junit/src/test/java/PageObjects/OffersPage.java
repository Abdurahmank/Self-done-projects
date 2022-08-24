package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	WebDriver driver;

	public OffersPage(WebDriver driver) {

		this.driver = driver;
	}

	private By SeacrhItem = By.xpath("//input[@id='search-field']");
	private By tableContent = By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]");

	public void SendItemName(String name) {
		driver.findElement(SeacrhItem).sendKeys(name);
	}

	public String GrabTableItem() {
		return driver.findElement(tableContent).getText();

	}

}
