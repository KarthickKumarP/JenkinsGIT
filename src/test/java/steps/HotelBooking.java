package steps;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.BookHotel;
import pages.BookedItenary;
import pages.BookingConfirmation;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotel;
import utilities.XLUtils;


public class HotelBooking extends BaseClass{
	
	LoginPage lp;
	SearchHotelPage shp;
	SelectHotel sh;
	BookHotel bh;
	BookingConfirmation bc;
	BookedItenary bi;

	@BeforeClass
	@Parameters("browserName")
	public void setUp(String browserName) throws IOException {
		getDriver(browserName);
		getUrl(XLUtils.getCellData(xlPath,"Sheet3",0,1));
		implicitWait(10);
	}
	
	@Test(priority=1)
	public void TC_01_Login() throws IOException {
		lp=new LoginPage();
		textSendByJava(lp.getUserName(),XLUtils.getCellData(xlPath,"Sheet1",0,1));
		textSendByJava(lp.getPassword(),XLUtils.getCellData(xlPath,"Sheet1",1,1));
		elementClickByJava(lp.getLoginButton());
//		Assert.assertEquals(elementIsDisplayed(lp.getInvalidConfirmMsgText()),false);	
	}
	
//	@Test(priority=2)
//	public void TC_02_SearchHotel() throws IOException {
//		shp=new SearchHotelPage();
//		selectByVisibleText(shp.getLocationDropDown(),XLUtils.getCellData(xlPath,"Sheet1",2,1));
//		selectByVisibleText(shp.getHotelsDropDown(),XLUtils.getCellData(xlPath,"Sheet1",3,1));
//		selectByVisibleText(shp.getRoomTypeDropDown(),XLUtils.getCellData(xlPath,"Sheet1",4,1));
//		selectByVisibleText(shp.getNoOfRoomsDropDown(),XLUtils.getCellData(xlPath,"Sheet1",5,1));
//		elementClearByJava(shp.getCheckInDateTextBox());
//		textSendByJava(shp.getCheckInDateTextBox(),XLUtils.getCellData(xlPath,"Sheet1",6,1));
//		elementClearByJava(shp.getCheckOutDateTextBox());
//		textSendByJava(shp.getCheckOutDateTextBox(),XLUtils.getCellData(xlPath,"Sheet1",7,1));
//		selectByIndex(shp.getAdultsPerRoomDropDown(),2);
//		selectByIndex(shp.getChildPerRoomDropDown(),1);
//		elementClickByJava(shp.getSearchButton());
//		sh=new SelectHotel();
//		Assert.assertEquals(getElementText(sh.getSelectHotelText()),selectHotelConfirm);
//	}
//	
//	@Test(priority=3)
//	public void TC_03_SelectHotel() {
//		sh=new SelectHotel();
//		elementClickByJava(sh.getRadioSelectButton());
//		elementClickByJava(sh.getContinueButton());
//	    bh=new BookHotel();
//	    Assert.assertEquals(getElementText(bh.getBookHotelText()),"Book A Hotel");
//	}
//	
//	@Test(priority=4)
//	public void TC_04_BookHotel() throws IOException {
//		bh=new BookHotel();
//		textSendByJava(bh.getFirstNameTextField(),XLUtils.getCellData(xlPath,"Sheet2",0,1));
//		textSendByJava(bh.getLastNameTextField(),XLUtils.getCellData(xlPath,"Sheet2",1,1));
//		textSendByJava(bh.getAddressTextField(),XLUtils.getCellData(xlPath,"Sheet2",2,1));
//		textSendByJava(bh.getCreditCardNumber(),getRandom16Number());
//		selectByValue(bh.getCreditCardType(),XLUtils.getCellData(xlPath,"Sheet2",4,1));
//		selectByValue(bh.getExpiryMonth(),XLUtils.getCellData(xlPath,"Sheet2",5,1));
//		selectByValue(bh.getExpiryYear(),XLUtils.getCellData(xlPath,"Sheet2",6,1));
//		textSendByJava(bh.getCvvNumber(),XLUtils.getCellData(xlPath,"Sheet2",7,1));
//		elementClickByJava(bh.getBookNowButton());
//		bc=new BookingConfirmation();
//		Assert.assertEquals(getElementText(bc.getBookingConfirmationText()),"Booking Confirmation");
//	}
//	
//	@Test(priority=5)
//	public void TC_05_BookingConfirmation() {
//		bc=new BookingConfirmation();
//	    System.out.println("Order Id Number is : "+elementGetAttribute(bc.getOrderNumber(),"value"));
//	    Assert.assertTrue(elementIsDisplayed(bc.getMyItenary()));
//	}
//	
//	@Test(priority=6)
//    public void TC_06_BookedItenary() {
//		bc=new BookingConfirmation();
//		elementClickByJava(bc.getMyItenary());
//		bi=new BookedItenary();
//		elementClickByJava(bi.getCheckAllCheckBoxes());
//		elementClickByJava(bi.getCancelButton());
//		switchToAlertAccept();
//		Assert.assertEquals(webElementSize(bi.getAllCheckBoxes()),0);
//	}
	
	
	
}
