package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class BookingConfirmation extends BaseClass {

	public BookingConfirmation() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='Booking Confirmation ']")
	private WebElement bookingConfirmationText;

	@FindBy(xpath="//*[@id='order_no']")
	private WebElement orderNumber;
	
	@FindBy(xpath="//*[@id='my_itinerary']")
	private WebElement myItenary;

	public WebElement getBookingConfirmationText() {
		return bookingConfirmationText;
	}
	
	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
	public WebElement getMyItenary() {
		return myItenary;
	}
	
	
	
	
	
	

}
