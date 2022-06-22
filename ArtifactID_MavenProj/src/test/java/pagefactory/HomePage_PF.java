package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	public void check_logout_displayed() {
		
		btn_logout.isDisplayed();
	}
	
	
	WebDriver driver;
	public HomePage_PF(WebDriver driver1) {		//Constructor
    this.driver= driver1;		
	PageFactory.initElements(driver,this);
	}
	
	
	
	
	
}
