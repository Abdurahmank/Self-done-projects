package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	// @FindBy(xpath = "//input[@class='search-keyword']")
	// WebElement searchBox;
	By searchBox = By.xpath("//input[@class='search-keyword']");
	By itemName = By.cssSelector("h4.product-name");
	By DealsLink = By.linkText("Top Deals");
	By topDeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	//By increment = By.xpath("//div[@class='stepper-input']//a[@class='increment']");
	By addToCart = By.cssSelector(".product-action button");

	public String GrabText() {
		return driver.findElement(itemName).getText();

	}

	public void ClickOnDeals() {
		driver.findElement(DealsLink).click();
	}

	public void searchItem(String name) {
		driver.findElement(searchBox).sendKeys(name);

	}

	public String getTitleOfLandingPage() {
		return driver.getTitle();
	}

	public void incrementQuantity(int Quantity) {

		int i = Quantity - 1;
		while (i > 0) {
			driver.findElement(increment).click();
			i--;

		}
	}
	public void addToCart() {
		driver.findElement(addToCart).click();
	}

}