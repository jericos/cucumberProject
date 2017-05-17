package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}, glue="Steps")
public class TestRunner extends AbstractTestNGCucumberTests{
}
