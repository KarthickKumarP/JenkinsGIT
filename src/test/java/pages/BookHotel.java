package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class BookHotel extends BaseClass{
	

	public BookHotel() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='Book A Hotel ']")
	private WebElement bookHotelText;

	@FindBy(xpath="//*[@id='first_name']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="//*[@id='last_name']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//*[@id='address']")
	private WebElement addressTextField;
	
	@FindBy(xpath="//*[@id='cc_num']")
	private WebElement creditCardNumber;
	
	@FindBy(xpath="//*[@id='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(xpath="//*[@id='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath="//*[@id='cc_exp_year']")
	private WebElement expiryYear;
	
	@FindBy(xpath="//*[@id='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(xpath="//*[@id='book_now']")
	private WebElement bookNowButton;
	
	@FindBy(xpath="//*[@id='cancel']")
	private WebElement cancelButton;
	
	public WebElement getBookHotelText() {
		return bookHotelText;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getAddressTextField() {
		return addressTextField;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
}
