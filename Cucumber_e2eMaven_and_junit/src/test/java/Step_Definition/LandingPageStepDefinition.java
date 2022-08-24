package Step_Definition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.GeneralUtilities;
import Utils.TestBase;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class LandingPageStepDefinition {

	public WebDriver driver;
	public TestContextSetup context;
	public TestBase base;
	public GeneralUtilities util;
	public LandingPage LP;
	public PageObjectManager POM;

	public LandingPageStepDefinition(TestContextSetup context) {

		this.context = context;
		this.LP = context.POM.getLandingPage();
	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {

		Assert.assertTrue(LP.getTitleOfLandingPage().contains("Green"));
	}

	@When("^user searched with Shortname (.*) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname)
			throws InterruptedException {

		LP.searchItem(shortname);

		Thread.sleep(2000);
		context.landing_pageitem_name = LP.GrabText().split("-")[0].trim();

		System.out.println("item_name:= " + context.landing_pageitem_name);

	}

	@When("user clicks on deals link and switching window")
	public void user_clicks_on_deals_link_and_switching_window() {
		LP.ClickOnDeals();

		util = context.POM.getUtilsPage();
		// util = new GeneralUtilities(context.driver);
		// context.utils.SwitchWindow();
		util.SwitchWindow();
	}

	@And("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) throws InterruptedException {

		System.out.println("Added {string} items of the selected product to cart");
		Thread.sleep(2000);
		LP.incrementQuantity(Integer.parseInt(quantity)); // converting string to integer
		LP.addToCart();
	}

}
