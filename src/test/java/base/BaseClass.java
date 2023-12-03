package base;

import java.io.File;


import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	
	public String xlPath=System.getProperty("user.dir")+"//src//test//resources//testData//AdactinData.xlsx";
	
	ReadConfig readConfig=new ReadConfig();
    public String selectHotelConfirm=readConfig.getSelectHotelConfirm();
    public String bookHotelConfirm=readConfig.getBookHotelConfirm();
    public String bookingConfirmationText=readConfig.getBookingConfirmationText();
    public String bookedItenaryCancelSize=readConfig.getBookedItenaryCancelSize();

	public void getDriver(String browserType) {
		switch (browserType) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Firefox":
			driver=new FirefoxDriver();
			break;
		}
	}
	
	public void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;	
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}
	

	public void textSendByJava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	
	public void elementClickByJava(WebElement element) {
		element.click();
	}
	
	public void elementClearByJava(WebElement element) {
		element.clear();
	}
	
	public String elementGetAttribute(WebElement element,String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}
	
	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	public boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public boolean elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	
	public int webElementSize(List<WebElement> element) {
		int size = element.size();
		return size;
	}
	
	public void handleWebElementsForClick(List<WebElement> element) {
		for(int i=0;i<element.size();i++) {
			element.get(i).click();
		}
	}
	
	public void selectByValue(WebElement element, String value) {
        Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void selectByIndex(WebElement element, int indexNo) {
        Select s = new Select(element);
		s.selectByIndex(indexNo);
	}
	
	public void selectByVisibleText(WebElement element,String text) {
        Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public List<WebElement> getAllOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		return options;
	}
	
	public WebElement getFirstSelectedOption(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	public void deSelectByIndex(WebElement element, int indexNo) {
        Select s = new Select(element);
		s.deselectByIndex(indexNo);
	}
	
	public void deSelectByValue(WebElement element, String value) {
        Select s = new Select(element);
		s.deselectByValue(value);
	}
	
	public void deSelectByVisibleText(WebElement element,String text) {
        Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
	
	public void deSelectAllOptions(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	
	public boolean isMultipleSelect(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}	
	
	public void actionsDragAndDrop(WebElement source,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source,target).perform();
	}
	
	public void actionsRightClick(WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	
	public void actionsDoubleClick(WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void actionsClickAndMoveElement(WebElement element,int x,int y) {
		Actions act=new Actions(driver);
		act.moveToElement(element,x,y);
	}
	
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameByString(String frame) {
		driver.switchTo().frame(frame);
	}
	
	public void switchToFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchToAlertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToAlertSendKeys(String keysToSend,String confirm) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(keysToSend);
		if(confirm.equalsIgnoreCase("Accept")) {
			alert.accept();
		}
		else {
			alert.dismiss();
		}
		
	}
	
	public String switchToAlertGetText(String confirm) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		if(confirm.equalsIgnoreCase("Accept")) {
			alert.accept();
		}
		else {
			alert.dismiss();
		}
		return text;
	}
	
	
	public String getWindowhandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	
	public Set<String> getWindowHandles() {
		 Set<String> windowHandles = driver.getWindowHandles();
		 return windowHandles;
	}
	
	public void switchToWindowByIndex(int indexNo) {
		Set<String> windowHandles = getWindowHandles();
		List<String> list= new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(indexNo));
    }  
	
	public void switchToWindowByTitle(String title) {
		Set<String> windowHandles = getWindowHandles();
		for(String window:windowHandles) {
			if(getPageTitle().equals(title)) {
				driver.switchTo().window(window);
			}
		}
	}
	
	public static void screenCapture(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") +"\\screenshots\\"+ name + ".png");
		FileUtils.copyFile(sourceFile, targetFile); // Throw IOException
	}

	public void textSendByJS(String keysToSend, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);
	}
	
	public String getRandom16Number() {
		long rand=(long)(Math.random()*10000000000000000L);
		String random = Long.toString(rand);
		return random;
	}
	
	public int conversionStringToInt(String value) {
		return Integer.parseInt(value);
	}

}






