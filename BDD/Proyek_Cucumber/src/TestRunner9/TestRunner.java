package TestRunner9;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features9", glue="stepDefinition9")

public class TestRunner {

}
