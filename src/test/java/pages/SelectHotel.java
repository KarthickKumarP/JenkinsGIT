package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SelectHotel extends BaseClass{
	
	public SelectHotel() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@class='login_title']")
	private WebElement selectHotelText;
	

	@FindBy(xpath="//*[@id='radiobutton_0']")
	private WebElement radioSelectButton;
	
	@FindBy(xpath="//*[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//*[@id='cancel']")
	private WebElement cancelButton;
	
	public WebElement getSelectHotelText() {
		return selectHotelText;
	}
	
	public WebElement getRadioSelectButton() {
		return radioSelectButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	
	

}
