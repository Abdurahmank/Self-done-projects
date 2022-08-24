package PageObjects;

import org.openqa.selenium.WebDriver;

import Utils.GeneralUtilities;

public class PageObjectManager {

	public LandingPage LP;
	public OffersPage OP;
	public WebDriver driver;
	public CheckoutPage check;
	public GeneralUtilities util;

	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	

	public LandingPage getLandingPage() {
		LP = new LandingPage(driver);
		return LP;
	}

	public OffersPage getOffersPage() {
		OP = new OffersPage(driver);
		return OP;
	}
	
	public  CheckoutPage getCheckoutPage() {
		check = new CheckoutPage(driver);
		return check;
	}
	
	public GeneralUtilities getUtilsPage() {
		util = new GeneralUtilities(driver);
		return util;
	}
	

}
