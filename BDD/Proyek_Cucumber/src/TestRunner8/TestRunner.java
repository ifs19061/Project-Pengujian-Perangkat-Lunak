package TestRunner8;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features8", glue="stepDefinition8")

public class TestRunner {

}
