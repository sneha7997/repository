package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="Feature\\tagdemo.feature",glue= {"StepDef"},plugin= {"html:target/cucumber1.html"},tags = {" @SmokeTest","@RegressionTest" })
public class demoRunner {

}
