package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class BookedItenary extends BaseClass{

	public BookedItenary() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//td[text()='Booked Itinerary']")
	private WebElement BookedItenary;
	
	@FindBy(xpath="//*[@id='order_id_text']")
	private WebElement searchOrderIdTextField;
	
	@FindBy(xpath="//*[@class='button_search']")
	private WebElement goSearchButton;
	
	@FindBy(xpath="//*[@name='check_all']")
	private WebElement checkAllCheckBoxes;
	
	@FindBy(xpath="//*[@name='ids[]']")
	private List<WebElement> allCheckBoxes;
	
	@FindBy(xpath="//*[@value='Cancel Selected']")
	private WebElement cancelButton;

	public WebElement getBookedItenary() {
		return BookedItenary;
	}

	public WebElement getSearchOrderIdTextField() {
		return searchOrderIdTextField;
	}

	public WebElement getGoSearchButton() {
		return goSearchButton;
	}

	public WebElement getCheckAllCheckBoxes() {
		return checkAllCheckBoxes;
	}

	public List<WebElement> getAllCheckBoxes() {
		return allCheckBoxes;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	
	
	
	

}
