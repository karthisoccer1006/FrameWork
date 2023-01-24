package PageObjectManager;

import org.openqa.selenium.WebDriver;

import ad.com.baseClass.Reusable_Methods;
import ad.com.locators.LoginPage;

public class POM extends Reusable_Methods {

	public POM(WebDriver driver) {
		this.driver = driver;

	}

	private LoginPage loginPage;

	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}

}
