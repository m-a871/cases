package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\case3.feature",glue= {"stepdef"},plugin= {"html:target/cucumbercase.html"})

public class runner3 {

}
