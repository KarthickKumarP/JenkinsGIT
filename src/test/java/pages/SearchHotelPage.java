package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SearchHotelPage extends BaseClass{
	
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[text()='Logout']")
	private WebElement logOutText;
	
	@FindBy(xpath="//*[@id='location']")
	private WebElement locationDropDown;
	
	@FindBy(xpath="//*[@id='hotels']")
	private WebElement hotelsDropDown;
	
	@FindBy(xpath="//*[@id='room_type']")
	private WebElement roomTypeDropDown;
	
	@FindBy(xpath="//*[@id='room_nos']")
	private WebElement noOfRoomsDropDown;
	
	@FindBy(xpath="//*[@id='datepick_in']")
	private WebElement checkInDateTextBox;
	
	@FindBy(xpath="//*[@id='datepick_out']")
	private WebElement checkOutDateTextBox;
	
	@FindBy(xpath="//*[@id='adult_room']")
	private WebElement adultsPerRoomDropDown;
	
	@FindBy(xpath="//*[@id='child_room']")
	private WebElement childPerRoomDropDown;
	
	@FindBy(xpath="//*[@id='Submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//*[@id='Reset']")
	private WebElement resetButton;
	
	public WebElement getLogOutText() {
		return logOutText;
	}
	
	
	public WebElement getLocationDropDown() {
		return locationDropDown;
	}

	public WebElement getHotelsDropDown() {
		return hotelsDropDown;
	}

	public WebElement getRoomTypeDropDown() {
		return roomTypeDropDown;
	}

	public WebElement getNoOfRoomsDropDown() {
		return noOfRoomsDropDown;
	}

	public WebElement getCheckInDateTextBox() {
		return checkInDateTextBox;
	}

	public WebElement getCheckOutDateTextBox() {
		return checkOutDateTextBox;
	}

	public WebElement getAdultsPerRoomDropDown() {
		return adultsPerRoomDropDown;
	}

	public WebElement getChildPerRoomDropDown() {
		return childPerRoomDropDown;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}

	
	
	
	
	
	

}
