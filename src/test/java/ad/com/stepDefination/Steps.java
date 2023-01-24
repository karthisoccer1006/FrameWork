package ad.com.stepDefination;

import org.junit.Assert;

import PageObjectManager.POM;
import ad.com.baseClass.Reusable_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends Reusable_Methods {
	POM obj = new POM(driver);

	@Given("User launch {string} browser")
	public void user_launch_browser(String string) throws Throwable {
		browserLaunch(string);
		maximize();
	}

	@Given("User navigate to url {string}")
	public void user_navigate_to_url(String string) {
		getUrl(string);

	}

	@Given("User verify land on page")
	public void user_verify_land_on_page() {
		Assert.assertTrue(obj.getLoginPage().getLogo().isDisplayed());
	}

	@Given("User Enter the username {string}")
	public void user_enter_the_user_name(String string) {
		sendText(obj.getLoginPage().getUsername(), string);

	}

	@Given("User Enter the password {string}")
	public void user_enter_the_password(String string) {
		sendText(obj.getLoginPage().getPassword(), string);

	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
		click(obj.getLoginPage().getLogin());
	}

	@Then("User verify login successfully  {string}")
	public void user_verify_login_successfully(String string) {
		Assert.assertTrue(obj.getLoginPage().getInnerLogo().isDisplayed());


	}

	@Then("User verify the error massage thrown {string}")
	public void user_verify_the_error_massage_thrown(String string) {
		boolean contains = obj.getLoginPage().getMessage().getText().contains(string);
		System.out.println(contains);
	}

}
