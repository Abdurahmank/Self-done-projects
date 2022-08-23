package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Automation\\Eclipse\\CucumberByRahul\\src\\test\\java\\Features",
glue = "StepDefinition",
stepNotifications = true, //to get coloured junit report
dryRun=true,
monochrome = true,
plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"}, // Pretty is no mandatory, with out "pretty" also report will generate
tags="@sanity")

public class TestRunner {

}
