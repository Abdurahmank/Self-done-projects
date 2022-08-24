package Step_Definition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.CheckoutPage;
import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.GeneralUtilities;
import Utils.TestBase;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class CheckoutPageStepDefinition {

	public WebDriver driver;
	public TestContextSetup context;
	public TestBase base;
	public GeneralUtilities util;
	public LandingPage LP;
	public PageObjectManager POM;
	public CheckoutPage checkoutPage;

	public CheckoutPageStepDefinition(TestContextSetup context) {
		this.context = context;
		this.checkoutPage = context.POM.getCheckoutPage();
	}

	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException {
		
		Thread.sleep(2000);
		 checkoutPage.CheckoutItems();
	}
	
	@And("verify user has ability to enter promo code and place the order")
	public void enter_promo_code_and_place_the_order() throws IOException {

		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
		Assert.assertTrue(checkoutPage.VerifyPlanOrder());
		
		System.out.println("Promoy button and place order buttons are present");
	}
	   

}
