package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/features/Zero.feature",glue= {"StepsZero"},monochrome=true,
plugin = {"json:target/cucumber.json"})

public class ZeroRunner {

}
