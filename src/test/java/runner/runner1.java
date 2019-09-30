package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\case1.feature",glue= {"stepdef"},plugin= {"html:target/cucumbercasees.html"})

public class runner1 {

}
