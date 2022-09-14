package com.aajtak.android.init;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aajtak.android.listener.MyExtentListners;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;



public class BaseUtil extends CommonConfig
{
	private static final String None = null;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String pkg;
	public static String act;

	public boolean ifAlertPresent() {
		try {
			getDriver().switchTo().alert();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}


	public static void swipeRight()
	{
		try {
			Dimension dim = aDriver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int y = (int)(height*0.20);
			int startx = (int)(width*0.75);
			int endx = (int)(width*0.02);
			scroll(startx, y, endx, y);
			MyExtentListners.test.pass("Swipped Right Side");
		} catch (Exception e) {
			Assert.fail("Failed to Swipe Right Side");

		}

	}


	public static void scrollUp() {
		Dimension dim = aDriver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height*0.80);
		int endy = (int)(height*0.20);
		scroll(x, starty, x, endy);
	}
	
	public static void scrollDown() {
		Dimension dim = aDriver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height*0.80);
		int endy = (int)(height*0.20);
		scroll(x, endy, x, starty);
	}

	public void executeJS(String code) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript(code, "");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void clickOnElementUsingJS(WebElement e) {

		try {
			JavascriptExecutor executor = (JavascriptExecutor) getDriver();
			executor.executeScript("arguments[0].click();", e);
		} catch (Exception e1) {

			e1.printStackTrace();
		}
	}

	/**
	 * @param element
	 */
	public static void clickBtn(AndroidElement element) {
		String elementTxt = element.getText();
		if(isElementExist(element)) {
			element.click();
			MyExtentListners.test.pass("Clicked on "+elementTxt);
			logger.info("Clicked on "+elementTxt);
		}
		else {
			Assert.fail("Failed to click on "+elementTxt);
		}
	}
	
	public static void clickOnElement(List<AndroidElement> element, int i) {
		String elementTxt = element.get(i).getText();
		if(isElementExist(element.get(i))) {
			element.get(i).click();
			MyExtentListners.test.pass("Clicked on "+elementTxt);
		}
		else {
			Assert.fail("Failed to click on "+elementTxt);
		}
	}

	public void startActivity(String pkg, String act) {
		Activity activity = new Activity(pkg, act);
		aDriver.startActivity(activity);
	}

	public String getElementText(AndroidElement element) {
		if(isElementExist(element)) {
			String elementTxt = element.getText();
			return elementTxt;
		}
		else {
			return None;
		}
	}

	public void verifyTwoString(AndroidElement element, String expected) {
		String actualTxt = getElementText(element);
		if(actualTxt.equalsIgnoreCase(expected)) {
			MyExtentListners.test.pass(actualTxt + " and "+ expected + "Are same : PASSED");
		}
		else {
			Assert.fail(actualTxt + " and "+ expected + "Are Different : FAILED");
		}
	}

	public static void runADBcmd(String adbCommand) throws InterruptedException, IOException {
		minWait();
		Runtime.getRuntime().exec(adbCommand);
		minWait();		
	}

	/**
	 * 
	 * 
	 * 
	 */
	public void launchApp() {
		pkg = properties.getProperty("appPackage");
		act = properties.getProperty("appActivity");
//		act = properties.getProperty("homeappActivity");
		try {
			runADBcmd("adb shell pm clear "+pkg);
			runADBcmd("adb shell am start -n "+pkg+"/"+act);
			logger.info("App launched Succesfully");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	/**
	 * @param e
	 */
	public void selectCheckbox(AndroidElement e) {
		if (!e.isSelected()) {
			e.click();
		}
	}

	public void deSelectCheckbox(AndroidElement e) {
		if (e.isSelected()) {
			e.click();
		}
	}	

	public boolean enterTextToInputField(AndroidElement element, String text) throws InterruptedException {
		String elementTxt = element.getText();
		if (element.isDisplayed()) {
			element.clear();
			element.sendKeys(text);
			MyExtentListners.test.pass("Entered "+text+" in "+elementTxt+" text box");
			return true;
		} else {
			MyExtentListners.test.pass("Failed to Entered "+text+" in "+elementTxt+" text box");
			return false;
		}
	}

	public boolean clearInputField(AndroidElement e) throws InterruptedException {
		if (e == null) {
			return false;
		} else {
			if (e.isDisplayed()) {
				Thread.sleep(500);
				e.clear();
				Thread.sleep(500);
				logger.info("PASS: Element found and cleared the value successfully");
				return true;
			} else {
				logger.info("FAILURE: Element not found or displayed: Object Locator : "
						+ e);
				return false;
			}
		}
	}

	public boolean hoverOverElement(AndroidElement el) {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(el).build().perform();
		return false;
	}

	public String getCurrentTimeStamp() {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		return format.format(new Date()).toString();
	}

	public void selectDropDownByValue(AndroidElement e, String value) {
		Select dropdown = new Select(e);
		dropdown.selectByValue(value);
	}

	public void selectDropDownByText(AndroidElement e, String text) {

		Select dropdown = new Select(e);
		dropdown.selectByVisibleText(text);
	}

	public void selectDropDownsByText(AndroidElement e, String text) {
		Select dropdown = new Select(e);
		if (dropdown.isMultiple()) 
		{
			dropdown.deselectAll();
			dropdown.selectByVisibleText(text);
		}
		else 
		{
			dropdown.selectByVisibleText(text);
		}	
	}

	public void selectDropDownValueByIndex(AndroidElement e, int index) {
		Select dropdown = new Select(e);
		dropdown.selectByIndex(index);
	}

	public String getSelectedDropDownOptionText(AndroidElement e) {
		Select dropdown = new Select(e);
		return dropdown.getFirstSelectedOption().getText();
	}

	public boolean isElementPresent(String csslocator) {
		if (getDriver().findElements(By.cssSelector(csslocator)).size() == 0)
			return false;
		else
			return true;
	}

	public boolean isAlertPresent() {
		try {
			getDriver().switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}


	public boolean isElementPresent(AndroidElement elementName, int timeout){
		try{
			WebDriverWait wait = new WebDriverWait(aDriver, timeout);
			wait.until(ExpectedConditions.visibilityOf(elementName));
			return true;
		}catch(Exception e){
			return false;
		}
	}

	public Alert getAlertbox() {
		try {
			return getDriver().switchTo().alert();

		} catch (NoAlertPresentException ex) {
			return null;
		}
	}

	public static void waitTillElementPresent(AndroidElement e, int timeinSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeinSeconds);
		wait.until(ExpectedConditions.visibilityOf(e));

	}

	public void waituntilnewElementtobeClickable(AndroidElement e, int timeinSeconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), timeinSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}

	public void dragAndDrop(AndroidElement source, AndroidElement target) {
		(new Actions(getDriver())).dragAndDrop(source, target).perform();
	}

	/**
	 * @param e
	 * @return 
	 */
	public static boolean isElementExist(AndroidElement e) {
		try {
			waitTillElementPresent(e, 30);
			boolean isPresent = e.isDisplayed();
			if(isPresent) {
				String eleTxt = e.getText();
				MyExtentListners.test.pass(eleTxt +" is Present : PASSED");
				return true;
			}
			else {
				Assert.fail(" The element is not Present : FAILED");
				Assert.fail();
				return false;
			}	
		} catch (Exception e2) {
			Assert.fail(" The element is not Present : FAILED");
			Assert.fail();
			return false;
		}
	}

	public static boolean isElementDisplayed(AndroidElement e) {
		aDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			if(e.isDisplayed()) {
				return true;
			}
			else {
				return false;
			}	
		} catch (Exception e2) {
			return false;
		}			
	}
	
	public static boolean waitTillElementDisapper(AndroidElement e) {
		aDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			for (int i = 0; i < 10; i++) {
				if(!e.isDisplayed()) {
					break;
				}
			}
		} catch (Exception e2) {
			return false;
		}
		return false;			
	}
	
	
	

	public boolean isElementNull(AndroidElement e) {
		boolean isNull = false;
		try {
			if (e.getText() == null) {
				isNull = true;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return isNull;
	}

	public void maxWait() throws InterruptedException{
		Thread.sleep(12000);

	}
	public static void minWait(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void customWait(long secs) throws InterruptedException{
		Thread.sleep(secs) ;
	}

	public void softAssert_true(boolean check, String message){
		SoftAssert softAssert = new SoftAssert();
		Assert.assertTrue(check, message); 
	}


	public void softAssert_false(){
		SoftAssert softAssertFail = new SoftAssert();
		Assert.fail();
	}		 

	public void softAssert_equals(String actual, String expected){
		SoftAssert softAssertFail = new SoftAssert();
		Assert.assertEquals(actual, expected);
	}


	public void scrollAlittle() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)aDriver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		minWait();
	}

	public void javaScriptScroll(){
		JavascriptExecutor jse = (JavascriptExecutor)aDriver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}


	public static String captureScreenshot(String methodName) throws IOException{
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		String mailscreenshotpath = null;
		File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			mailscreenshotpath = System.getProperty("user.dir")+"\\src\\test\\resources\\screenshots\\"+methodName+"_"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpg";
			FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mailscreenshotpath;
	}

	public static String saveReportWithDateAndTime(String path) throws IOException {
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.HOUR_OF_DAY);
		String mailscreenshotpath = null;

		try {
			mailscreenshotpath =path+"_" + year + "_" + date + "_" + (month + 1) + "_" + day + "_" + min + "_" +sec+ ".html";
			FileUtils.copyFileToDirectory(new File(mailscreenshotpath), new File("src/test/resources/extentreport"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		return mailscreenshotpath;
	}

	public boolean searchString(String searchstring, String fileName) {
		boolean check = false;
		try {	 

			BufferedReader bf = new BufferedReader(new FileReader("src/test/resources/adbLogs/"+fileName+".txt"));
			int linecount = 0;
			String line;
			while (( line = bf.readLine()) != null){

				boolean indexfound = line.contains(searchstring);
				if (indexfound) {
					check=true;
					logger.info("Word "+searchstring+" was found at position " + indexfound + " on line " + linecount);
					break;
				}  
				else {
					check=false;
					linecount++;
				}
			}
			bf.close();
		}
		catch (Exception e) {
			logger.info("IO Error Occurred: " + e.toString());
		}
		return check;
	}

	public boolean scrollTo(String phoneNum) {
		/*
			  Method used to select an element on the page by scrolling the Scroll View/List View
		 */
		boolean check = false;
		try {  
			String scrollable = "new UiScrollable(new UiSelector().scrollable(true))";
			String textElement = ".scrollIntoView(new UiSelector().text(\""+ phoneNum +"\"))";
			aDriver.findElementByAndroidUIAutomator(scrollable+textElement);
			logger.info("Searched application is found sucessfully : ");
			check = true;
			return check;
		}
		catch(Exception e) {
			return check;
		}
	}

	public void scrollToElement(AndroidElement e) throws InterruptedException {
		aDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			minWait();
			for(int i=1; i<=50;i++)
			{
				if(isElementDisplayed(e)) {
					customWait(1000);
					break;
				}
				else {
					scrollUp();
					continue;
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}


	public boolean scrollToText(String text) {
		/*
			Method used to select an element on the page by scrolling the Scroll View/List View
		 */
		boolean check = false;	
		try {
			String scrollable = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
			String textElement = ".scrollIntoView(new UiSelector().text(\""+ text +"\").instance(0))";
			aDriver.findElementByAndroidUIAutomator(scrollable+textElement);
			logger.info("Searched application is found sucessfully : ");
			check = true;
			MyExtentListners.test.pass(text+ " is Present : PASSED");
			return check;
		}
		catch (Exception e) {
			Assert.fail(text+ " is not Present : FAILED");
			e.printStackTrace();
		}
		return check;	
	}

	public boolean scrollToTextAndClick(String text) {
		/*
			Method used to select an element on the page by scrolling the Scroll View/List View
		 */
		boolean check = false;	
		try {
			String scrollable = "new UiScrollable(new UiSelector().scrollable(true).instance(0))";
			String textElement = ".scrollIntoView(new UiSelector().text(\""+ text +"\").instance(0))";
			aDriver.findElementByAndroidUIAutomator(scrollable+textElement).click();
			logger.info("Searched application is found sucessfully : ");
			check = true;
			MyExtentListners.test.pass(text+ " is Present");
			return check;
		}
		catch (Exception e) {
			Assert.fail(text+ " is not Present");
			e.printStackTrace();
		}
		return check;	
	}



	public void scrollDown(String visibleText) {
		aDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
	}

	public boolean isTextPresent(String text) {
		/*
			Method used to find a text in the displayed screen (element of type android.widget.TextView)
		 */
		boolean check = false;
		WebElement textLocator;
		String textElement = "//android.widget.TextView[@text=\'"+ text +"\']";
		System.out.println(textElement);
		try {
			aDriver.findElementByXPath(textElement);
			check = true;
		}
		catch(Exception e){
			check = false;		
		}
		return check;
	}

	public boolean selectBtnUsingTxt(String text){
		/*
				Method used to select a button using the text
		 */
		boolean check = false;	
		try{
			String template = "new UiSelector().className(\"android.widget.Button\")";
			String textElement = ".text(\""+ text+ "\")";
			aDriver.findElementByAndroidUIAutomator(template+textElement).click();
			check = true;
			return check;
		}
		catch(Exception e1) {
			return check;
		}
	}


	public boolean clickBtnWithText(String text) {
		boolean check = false;
		try {
			String clickable = "//android.widget.Button[@text=\'";
			String textElement = text+"\']";
			System.out.println(clickable+textElement);
			aDriver.findElementByXPath(clickable+textElement).click();
			//aDriver.
			//aDriver.findElementByAndroidUIAutomator("new UiSelector().childSelector()(new UiSelector().childSelector(new UiSelector().className(\"android.widget.TextView\").text(\"Clock\")))").click();
			check = true;
			return check;
		}
		catch(Exception e) {
			return check;
		}
	}

	public static String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
	}

	public static String getCurrentTime() {
		Date date = new Date();
		String strDateFormat = "hh-mm-ss";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate= dateFormat.format(date);
		System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
		return formattedDate;

	}

	public void clickDeviceBackButton(int num) 
	{
		/*
		 * clicks on back button with iteration as user input
		 */
		for(int i=0;i<num;i++){
			minWait();
			aDriver.pressKey(new KeyEvent(AndroidKey.BACK));
		}
	}


	/*
	 * don't forget that it's "natural scroll" where 
	 * fromY is the point where you press the and toY where you release it
	 */
	public static void scroll(int fromX, int fromY, int toX, int toY) {
		TouchAction action = new TouchAction(aDriver);
		action.press(PointOption.point(fromX, fromY))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(toX, toY))
		.release()
		.perform();
	}
	
	public void scrollToElementWithWait(AndroidElement e) throws InterruptedException {
		aDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			minWait();
			for(int i=1; i<=50;i++)
			{
				waitTillElementPresent(e, 5);
				if(isElementDisplayed(e)) {
					customWait(1000);
					break;
				}
				else {
					scrollUp();
					continue;
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
}