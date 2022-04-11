package TestRunner2;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features2", glue="stepDefinition2")
public class TestRunner {

}
