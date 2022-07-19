package petshop.runner;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/petshop/Featurefile", 
glue = {"petshop.stepdefinitions"},
monochrome = true,  
dryRun=false,
tags = "@jpstore",
plugin = { "pretty","html:traget/cucumber-html-reaport","rerun:target/failedtestcase.txt"})

public class Testrunner extends AbstractTestNGCucumberTests {

}
