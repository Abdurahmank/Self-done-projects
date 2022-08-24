package Step_Definition;


import org.junit.Assert;

import PageObjects.OffersPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class OfferPageStepDefinition {

	TestContextSetup context;

	public OfferPageStepDefinition(TestContextSetup context) {

		this.context = context;
	}

	@Then("^user searched for same short name (.*) in offers page$")
	public void user_searched_for_same_short_name_in_offers_page(String shortname) {
		//OffersPage OP = new OffersPage(context.driver);
		OffersPage OP =context.POM.getOffersPage();
		OP.SendItemName(shortname);
		context.offer_page_productname = OP.GrabTableItem();

		System.out.println(context.offer_page_productname);
	}

	@And("Comparing both prodcuts are same")
	public void comparing_both_prodcuts_are_same() {

		Assert.assertEquals(context.landing_pageitem_name, context.offer_page_productname);
		System.out.println("Both prodcuts are same");

		//close(); // closing browser
	}

//	public void close() { // creating another simple method for driver close
//		context.driver.quit();
//	}

}
