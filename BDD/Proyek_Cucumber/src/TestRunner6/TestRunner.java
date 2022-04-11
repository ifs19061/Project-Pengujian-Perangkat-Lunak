package TestRunner6;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features6", glue="stepDefinition6")

public class TestRunner {

}
