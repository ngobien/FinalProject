package TestCCB.FinalProject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {				"src/test/resources/CucumberTest/login.feature",
				"src/test/resources/CucumberTest/BELogin.feature",
				"src/test/resources/CucumberTest/CreateNews.feature",
				"src/test/resources/CucumberTest/MngtSub.feature"

				},
		plugin = {"json:target/json-report/cucumber.json"},
		glue = "StepDefinitions", 
		monochrome=true)
public class RunCucumberTest {
}