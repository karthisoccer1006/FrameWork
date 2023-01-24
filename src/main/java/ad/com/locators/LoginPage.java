package ad.com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ad.com.baseClass.Reusable_Methods;

public class LoginPage extends Reusable_Methods {

	public LoginPage(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(className ="logo")
	private WebElement logo;

	@FindBy(id ="username")
	private WebElement username;
	
	@FindBy(id ="password")
	private WebElement password;
	
	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement message;
	
	@FindBy(xpath="//img[@alt='AdactIn Group']")
	private WebElement innerLogo;
	
	public WebElement getInnerLogo() {
		return innerLogo;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="login")
	private WebElement login; 
	
}
