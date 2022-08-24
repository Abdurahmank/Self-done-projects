package Step_Definition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	TestContextSetup context;

	public Hooks(TestContextSetup context) {
		this.context = context;
	}

	@After
	public void AfterCass() throws IOException {

		context.TB.WebDrivermanager().quit();

	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = context.TB.WebDrivermanager();

		if (scenario.isFailed()) { 
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(src); // src converted to byte format
			scenario.attach(fileContent, "image/png", "image"); //attaching the byte code to extent report

		}
	}
}

