package Run_HP;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/features/Handson2.feature",glue= {"Run_HP"},
plugin = {"json:target/cucumber.json"})

public class Run_HP {

}
