package ad.com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ad.com.baseClass.Reusable_Methods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Reusable_Methods {
	@Before
	public static void beforeHooks() {
		System.out.println("welcome to automation testing");
	}
	@After
	public static void afterHooks(Scenario scenario) {
		TakesScreenshot ts= (TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "screenshot");
		driver.quit();
	}

}
