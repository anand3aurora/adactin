package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feature",glue = {"stepdefinition","hooks"},
plugin = { "html:target\\adactinlog.html","json:target\\adactinlog.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun= false,monochrome=true,publish = true)

public class TestRunner {
}
