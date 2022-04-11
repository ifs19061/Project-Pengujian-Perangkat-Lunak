package TestRunner10;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features10", glue="stepDefinition10")

public class TestRunner {

}
