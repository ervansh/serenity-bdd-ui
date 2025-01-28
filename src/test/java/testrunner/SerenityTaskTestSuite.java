package testrunner;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.CucumberOptions;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@CucumberOptions(glue = "stepDefinitions")
public class SerenityTaskTestSuite {

}
