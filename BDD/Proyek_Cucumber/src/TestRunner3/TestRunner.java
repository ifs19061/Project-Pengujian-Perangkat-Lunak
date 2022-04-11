package TestRunner3;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features3", glue="stepDefinition3")


public class TestRunner {

}
