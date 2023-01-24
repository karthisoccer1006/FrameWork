package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\ad\\com\\features", glue = { "ad.com.stepDefination",
		"ad.com.hooks" }, dryRun = false, stepNotifications = true, plugin = {"html:target\\report\\Adactin.html",
				"json:target\\report\\Adactin.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class RunnerClass {

}
