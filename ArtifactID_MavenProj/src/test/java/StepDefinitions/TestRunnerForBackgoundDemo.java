package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/ BackgroundDemo.feature",
glue= {"StepsForBackground"},monochrome=true,
plugin={"pretty","html:target/HtmlReports/report.html",
"json:target/JsonReports/report.json",
"junit:target/JunitReports/report.junit"})

public class TestRunnerForBackgoundDemo {

}
