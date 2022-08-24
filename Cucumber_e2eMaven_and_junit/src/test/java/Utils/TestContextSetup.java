package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landing_pageitem_name;
	public String offer_page_productname;
	public PageObjectManager POM;
	public TestBase TB;
	public GeneralUtilities utils;
	

	public TestContextSetup() throws IOException {
		
		TB = new TestBase();
		POM = new PageObjectManager(TB.WebDrivermanager());
		utils = new GeneralUtilities(TB.WebDrivermanager());
	}
}
