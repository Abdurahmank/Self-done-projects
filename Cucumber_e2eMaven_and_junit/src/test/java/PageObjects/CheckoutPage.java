package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By cartBag = By.cssSelector("[alt='Cart']");
	By checkOutButton = By.xpath("// button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");

	public void CheckoutItems() throws InterruptedException {
		driver.findElement(cartBag).click();
		Thread.sleep(2000);
		driver.findElement(checkOutButton).click();
	}

	public Boolean VerifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}

	public Boolean VerifyPlanOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
}
