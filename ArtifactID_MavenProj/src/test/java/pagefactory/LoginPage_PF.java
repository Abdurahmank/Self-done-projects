package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(id="name")
	@CacheLookup 			//to store the above element in cache and second tym it will take the same from cache
	WebElement txt_username;

	@FindBy(id="password")
	WebElement txt_password;

	@FindBy(id="login")
	WebElement btn_login;

	
	WebDriver driver;
	public LoginPage_PF(WebDriver driver1) {		//Constructor
    this.driver= driver1;		
	PageFactory.initElements(driver,this);
	}

	
	
	public void EnterUserName(String username) {

		txt_username.sendKeys(username);
	}

	public void EnterPassword(String password) {

		txt_password.sendKeys(password);
	}

	public void ClickonLogin() {

		btn_login.click();
	}

}

