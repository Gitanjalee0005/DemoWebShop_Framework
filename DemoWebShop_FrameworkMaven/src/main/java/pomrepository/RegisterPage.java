package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(css = "input[name='FirstName']")
	private WebElement firstNameTextField;
	
	@FindBy(css = "input[name='LastName']")
	private WebElement lastNameTextField;
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTExtField;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	@FindBy(xpath = "//div[contains(text(), 'Your registration completed')]")
	private WebElement verificationMsg;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTExtField() {
		return passwordTExtField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getVerificationMsg() {
		return verificationMsg;
	}
	
	

}
