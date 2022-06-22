package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


public class FlipkartLoginObjects {
	
	WebDriver driver;
	public FlipkartLoginObjects(WebDriver driver1){
		this.driver = driver1;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="user-name")
	WebElement txt_usrnm;
public void Enter_usrnm(String usrnm) {
	txt_usrnm.sendKeys(usrnm);
}

@FindBy(id="password")
WebElement txt_pswd;

public void Enter_pswd(String pswd) {
	txt_pswd.sendKeys(pswd);
}

@FindBy(id="login-button")
WebElement btn_Login;
public void Btn_Click() {
	btn_Login.click();
}


}

