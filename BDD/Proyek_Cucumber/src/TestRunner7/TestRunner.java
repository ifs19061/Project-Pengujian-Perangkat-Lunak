package TestRunner7;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features7", glue="stepDefinition7")
public class TestRunner {

}
