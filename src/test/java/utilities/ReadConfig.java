package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
	//	File src=new File(".//src//test//resources//testData//config.properties");
		File src=new File("E:\\JEE\\eclipse-workspace\\Browser\\src\\test\\resources\\testData\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
		System.out.println("Exception is "+ e.getMessage());	
		}
	}
	
	public String getSelectHotelConfirm() {
		return pro.getProperty("selectHotelConfirm");	
	}
	
	public String getBookHotelConfirm() {
		return pro.getProperty("bookHotelConfirm");	
	}
	
	public String getBookingConfirmationText() {
		return pro.getProperty("bookingConfirmationText");	
	}
	
	public String getBookedItenaryCancelSize() {
		return pro.getProperty("bookedItenaryCancelSize");	
	}
	
	
	
	

}
