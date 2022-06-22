package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObj {


	
	WebDriver driver;
	public  LoginObj(WebDriver driver1){
		this.driver = driver1;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="user-name")
	WebElement txt_usrnm;
public void Enter_usrnm(String usrnm1) {
	txt_usrnm.sendKeys(usrnm1);
}

@FindBy(id="password")
WebElement txt_pswd;

public void Enter_pswd(String pswd1) {
	txt_pswd.sendKeys(pswd1);
}

@FindBy(id="login-button")
WebElement btn_Login;
public void Btn_Click() {
	btn_Login.click();
}



	
}
