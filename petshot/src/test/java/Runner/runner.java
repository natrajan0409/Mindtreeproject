package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features= "C:\\Users\\Arun\\eclipse-workspace\\petstore\\src\\test\\java\\Featurefile\\Sign.feature",
tags= "@tag1",
dryRun=true,
monochrome=true,
plugin= {"pretty","html:traget/cucumber-html-reaport","rerun:target/failedtestcase.txt"},
glue= {"src\\test\\java\\Stepsdef"})

public class runner {
	
		

}
