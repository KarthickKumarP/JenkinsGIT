package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgotPassword;
	
	@FindBy(xpath="//*[contains(text(),'New User')]")
	private WebElement newUserRegister;
	
	@FindBy(xpath="//*[contains(text(),'Invalid Login')]")
	private WebElement invalidConfirmMsgText;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getNewUserRegister() {
		return newUserRegister;
	}
	
	public WebElement getInvalidConfirmMsgText() {
		return invalidConfirmMsgText;
	}
	
	

}
