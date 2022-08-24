package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="E:\\Automation\\Eclipse\\Cucumber_e2eMaven_and_testNG\\src\\test\\java\\Package",
glue = "Step_Definition",
dryRun = false,
monochrome = true,
tags="@PlaceOrder or @offersPage",
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenrios.txt"})

		//,"junit:target/cucumber.xml"})
//stepNotifications = true, //to get coloured junit report

public class Junit_RunnerTest{

}
