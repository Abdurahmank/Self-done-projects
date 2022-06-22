//package POM_Pages;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//public class LoginPage {
//	
//	WebDriver driver;
//	
//	By txt_username = By.id("name");
//	By txt_Pswd = By.id("password");
//	By btn_login = By.xpath("*//button[@id='login']");
//	By btn_logout = By.id("logout");
//	
//	public LoginPage(WebDriver driver) { 				//Constructor
//		this.driver = driver;
//	}
//	
//	public void EnterUsername(String username) {
//		
//		driver.findElement(txt_username).sendKeys(username);
//	}
//	public void EnterPaswd(String password) {
//		driver.findElement(txt_Pswd).sendKeys(password);
//	}
//	
//	public void ClickLogin() {
//		driver.findElement(btn_login).click();
//	}
//	
//	public void CheckLogout() {
//		
//		driver.findElement(btn_logout).isDisplayed();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//	}
//}
