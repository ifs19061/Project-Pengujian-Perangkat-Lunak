package TestRunner5;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features5", glue="stepDefinition5")

public class TestRunner {

}
