package petshop.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/petstore/featureFile",
glue= {"petstore.stepdef"},
dryRun=false,
monochrome=true,
tags= "@jpethome",
plugin= {"pretty","html:target/site/cucumber-pretty",
"json:target/cucumber.json"})
public class runner {
	

}
