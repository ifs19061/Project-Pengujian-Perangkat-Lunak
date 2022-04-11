package TestRunner1;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features1", glue="stepDefinition1")

public class TestRunner {

}
