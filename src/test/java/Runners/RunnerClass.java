package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( 
		         features = "src\\test\\resources\\FeatureFiles\\Login.feature",
		         glue = "StepDefenition",
		         dryRun = false,
		         monochrome = true,
		         plugin = {"pretty"},
		         publish = true
		         

		         )




public class RunnerClass {

}
