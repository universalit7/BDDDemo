package api.cucumber. runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/api/cucumber/features/post.feature"},glue = {"api.cumcumber.steps"},dryRun = true)

public class PostRunner {
}
