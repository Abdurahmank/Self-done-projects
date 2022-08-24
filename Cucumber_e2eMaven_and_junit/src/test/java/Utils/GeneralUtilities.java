package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GeneralUtilities {
	
	public WebDriver driver;
	
	public GeneralUtilities(WebDriver driver) {
		
		this.driver=driver;
	}

	public String SwitchWindow() {
		
		Set<String> WindoIDs = driver.getWindowHandles();
		Iterator<String> it = WindoIDs.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String PageTitle = driver.getTitle();
		System.out.println("Child window Title:= " + PageTitle);
		return PageTitle;
	}
}
