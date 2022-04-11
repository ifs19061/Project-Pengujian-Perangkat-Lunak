package TestRunner4;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features4", glue="stepDefinition4")

public class TestRunner {

}
