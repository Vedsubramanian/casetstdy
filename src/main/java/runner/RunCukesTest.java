package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/addtocart.feature","src/test/resources/search.feature","src/test/resources/signin.feature","src/test/resources/signup.feature"},
glue="Stepdefinition",
plugin="json:target/cucumber.json")
public class RunCukesTest {
}
