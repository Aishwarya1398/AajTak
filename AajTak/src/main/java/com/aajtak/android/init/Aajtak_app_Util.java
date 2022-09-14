package com.aajtak.android.init;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.aajtak.android.listener.MyExtentListners;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;


public class Aajtak_app_Util extends BaseUtil {

	boolean value = false;

	public void verifyTwoText(String actualText, String expectedText) {
		if (actualText.equalsIgnoreCase(expectedText)) {
			MyExtentListners.test.pass(actualText + " || " + expectedText + " are matching");
		} else {
			MyExtentListners.test.fail(actualText + " || " + expectedText + " are not matching");
			assertEquals(actualText, expectedText);
		}
	}

	public void verifyStoryTitles(String actualText, String expectedText) {
		String actualText1 = actualText.replace(" ", "");
		String expectedText1 = expectedText.replace(" ", "");
		if (actualText1.contains(expectedText1)) {
			MyExtentListners.test.pass(actualText + " || " + expectedText + " are matching");
		} else {
			MyExtentListners.test.fail(actualText + " || " + expectedText + " are not matching");
			assertEquals(actualText, expectedText);
		}
	}

	public static String getScreenShot(String screenShotPath) {
		TakesScreenshot ts = (TakesScreenshot) aDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
//		String path = System.getProperty("user.dir") + "/reports/Screenshot/" + System.currentTimeMillis() + ".png";
		String path = screenShotPath + System.currentTimeMillis() + ".png";
		File destination = new File(path);

		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed" + e.getMessage());
		}
		return path;
	}

	public static void selectSectionInHomeScreen(AndroidElement element) throws InterruptedException, IOException {
		if (isElementDisplayed(element)) {
			clickBtn(element);
		} else {
			for (int i = 0; i < 7; i++) {
				List<AndroidElement> ele = homescreen.gethomeScreenTabElements();
				int length = ele.size() - 1;
				Point a = ele.get(0).getCenter();
				Point b = ele.get(length).getCenter();
				runADBcmd("adb shell input swipe " + b.x + " " + b.y + " " + a.x + " " + a.y);
				if (isElementDisplayed(element)) {
					clickBtn(element);
					break;
				}
			}
		}
	}

	public void verifyTwodifferentString(String element1, String element2) {
		if (element1.equalsIgnoreCase(element2)) {
			MyExtentListners.test.fail(element1 + " and " + element2 + "Are same : FAILED");
		} else {
			MyExtentListners.test.pass(element1 + " and " + element2 + "Are different : PASSED");
		}
	}

	public void verifyTextContains(String actualText, String expectedText) {
		if (actualText.contains(expectedText)) {
			MyExtentListners.test.pass(actualText + " contains " + expectedText);
		} else {
			MyExtentListners.test.fail(actualText + " contains " + expectedText);
			assertEquals(actualText, expectedText);
		}
	}

	public static boolean isElementExist(AndroidElement e, String eleName) {
		try {
			boolean isPresent = e.isDisplayed();
			if (isPresent) {
				String eleTxt = e.getText();
				if (eleTxt.length() != 0) {
					MyExtentListners.test.pass(eleTxt + " is Present : PASSED");
					return true;
				} else {
					MyExtentListners.test.pass(eleName + " is Present : PASSED");
					return true;
				}
			}

			else {
				MyExtentListners.test.fail(" The element is not Present : FAILED");
				Assert.fail();
				return false;
			}
		} catch (Exception e2) {
			MyExtentListners.test.fail(" The element is not Present : FAILED");
			Assert.fail();
			return false;
		}
	}

	public static void clickBtn(AndroidElement element, String eleName) {
		String elementTxt = element.getText();
		if (isElementDisplayed(element)) {
			if (elementTxt.length() != 0) {
				element.click();
				MyExtentListners.test.pass("Clicked on " + elementTxt);
			} else {
				element.click();
				MyExtentListners.test.pass("Clicked on " + eleName);
				logger.info("Clicked on " + eleName);
			}
		} else {
			if (elementTxt.length() != 0) {
				MyExtentListners.test.fail("Failed to click on " + elementTxt);
			} else {
				MyExtentListners.test.fail("Failed to click on " + eleName);
			}
		}
	}

	public void getverifyStoryTitleWithUploadTime() {
		for (int i = 0; i < 8; i++) {
			if (isElementExist(newsList.getnewslistfirsttitle())) {

				if (isElementExist(newsList.getStoryDate())) {
					scrollUp();

				}
			}
		}
	}

	public void verifyAnyaStoriesofSection(AndroidElement element1, AndroidElement element2) {
		if ((isElementDisplayed(element1)) && isElementDisplayed(element2)) {
			MyExtentListners.test.pass(element1.getText() + element2.getText() + "is Present : PASSED");
		} else {
			MyExtentListners.test.fail(element1.getText() + element2.getText() + "is not present : FAILED");
		}
	}

	public void scrollToSections(AndroidElement e) throws InterruptedException {
		aDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			minWait();
			for (int i = 1; i <= 60; i++) {
				if (isElementDisplayed(e)) {
					customWait(1000);
					break;
				} else {
					scrollToElement(homescreen.getSubSectionName());
					verifyAnyaStoriesofSection(homescreen.getSubSectionName(),
							homescreen.getOtherStoriesfromSectionTxt());
					scrollUp();
					scrollUp();
					continue;
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public static boolean report(Boolean status, String pass, String fail) {
		try {
			if (status == true) {
				MyExtentListners.test.pass(pass);
				return true;
			} else {
				MyExtentListners.test.fail(fail);
				Assert.fail();
				return false;
			}
		} catch (Exception e2) {
			MyExtentListners.test.fail(" FAILED");
			Assert.fail();
			return false;
		}
	}

	public static void unnistallReport(Boolean status, String pass, String fail) {
		try {
			if (status == false) {
				MyExtentListners.test.pass(pass);
			} else {
				MyExtentListners.test.fail(fail);
				System.err.println("fail");
				Assert.fail();
			}
		} catch (Exception e2) {
			System.out.println("catch");
			MyExtentListners.test.fail(" FAILED");
			Assert.fail();
		}
	}

	public void reOpenApp() {
		String pkg = properties.getProperty("appPackage");
		String act = properties.getProperty("appActivity");
		try {
			aDriver.closeApp();
			runADBcmd("adb shell am start -n " + pkg + "/" + act);
			if (isElementDisplayed(dailyHighlights.getCloseBtn())) {
				clickBtn(dailyHighlights.getCloseBtn(), "Daily hightlights Close Button");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @author Archana
	 */
	public void verifyPullToRefreshText() {
		String mesg2 = "";
		for (int i = 0; i <= 10; i++) {
			try {
				aDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				scrollDown();
				mesg2 = newsList.getRefreshedText().getText();
				aDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		verifyTwoText(mesg2, "पेज रिफ्रेश किया गया है");
	}

	public void verifyPullToRefreshText1() {
		for (int i = 0; i <= 10; i++) {
			try {
				aDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
				scrollDown();
				boolean check = isElementExist(newsList.getRefreshinfText());
				if (check == true)
					break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public boolean verifySplashScreen() {
		for (int i = 0; i <= 5; i++) {
			try {
				aDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				boolean status = isElementExist(splashScreen.getSplashImage(), "SplashScreen");
				if (status == true) {
					return true;
				} else {
					reOpenApp();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

	public boolean verifyInarticleLink() {
		for (int i = 0; i <= 3; i++) {
			try {
				String expectedTitle = storyDetail.getInArticleLink1Text().getText();
				clickBtn(storyDetail.getInArticleLink1());
				if (!(isElementDisplayed(storyDetail.getActionOverflowBtn()))) {
					clickDeviceBackButton(1);
					swipeRight();
					scrollToElement(storyDetail.getInArticleLink1());
					expectedTitle = storyDetail.getInArticleLink1().getText();
					clickBtn(storyDetail.getInArticleLink1());
				} else
					waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
				String actualTitle = storyDetail.getTitleOfAnyStory().getText();
				verifyStoryTitles(actualTitle, expectedTitle);
				continue;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

	public void loginViaEmail() throws InterruptedException {
		clickBtn(homescreen.getHamburgerIcon());
		isElementExist(hamburgerMenu.getLoginOrRegister());
		clickBtn(hamburgerMenu.getLoginOrRegister());
		isElementExist(loginOrRegister.getEmailOrPhone());
		clickBtn(loginOrRegister.getEmailOrPhone());
		loginOrRegister.getEmailOrPhone().sendKeys("testingindiatoday@gmail.com");
		isElementExist(loginOrRegister.getPassword());
		clickBtn(loginOrRegister.getPassword());
		loginOrRegister.getPassword().sendKeys("Test@123");
		clickBtn(loginOrRegister.getLogin());
	}

	public static void compelteOnboarding() throws InterruptedException {
		waitTillElementPresent(shuruKarienOnboarding.getShuruKarein(), 30);
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		waitTillElementPresent(shuruKarienOnboarding.getAageBado(), 30);
//		clickBtn(shuruKarienOnboarding.getAageBado());
		clickBtn(notificatonPayeOnboarding.getAageBade());
		waitTillElementDisapper(homescreen.getHomeScreenLoading());
		if (isElementDisplayed(permssionMessage.getAllowBtn())) {
			clickBtn(permssionMessage.getAllowBtn());
		}
		if (isElementDisplayed(dailyHighlights.getCloseBtn())) {
			clickBtn(dailyHighlights.getCloseBtn(), "Daily hightlights Close Button");
		}
		try{
			waitTillElementPresent(homescreenWalkthrough.getPullDownBtn(), 10);
			if(BaseUtil.isElementDisplayed(homescreenWalkthrough.getPullDownBtn()));
			{
				Aajtak_app_Util.clickBtn(homescreenWalkthrough.getPullDownBtn(),"HomeScreen Walkthrough");
			}
		}catch(Exception e){
		}
	}
	public static void compelteOnboardingCopy() throws InterruptedException {
		waitTillElementPresent(shuruKarienOnboarding.getAageBado(), 30);
		clickBtn(shuruKarienOnboarding.getAageBado());
		waitTillElementDisapper(homescreen.getHomeScreenLoading());
//		if (isElementDisplayed(permssionMessage.getAllowBtn())) {
//			clickBtn(permssionMessage.getAllowBtn());
//		}
//		if (isElementDisplayed(dailyHighlights.getCloseBtn())) {
//			clickBtn(dailyHighlights.getCloseBtn(), "Daily hightlights Close Button");
//		}
//		try{
//			waitTillElementPresent(homescreenWalkthrough.getPullDownBtn(), 10);
//			if(BaseUtil.isElementDisplayed(homescreenWalkthrough.getPullDownBtn()));
//			{
//				Aajtak_app_Util.clickBtn(homescreenWalkthrough.getPullDownBtn(),"HomeScreen Walkthrough");
//			}
//		}catch(Exception e){
//		}
	}
	public AndroidElement getTitleText(String title) {
		return aDriver.findElementByXPath("//android.widget.TextView[@text=\'" + title + "\']");
	}

	/**
	 * @param element1
	 * @param element2
	 */
	public void verifyIfBothTextsPresent(AndroidElement element1, AndroidElement element2) {
		if ((isElementDisplayed(element1)) && isElementDisplayed(element2)) {
			MyExtentListners.test.pass(element1.getText() + "  is  " + element2.getText() + "  : PASSED");
		} else {
			MyExtentListners.test.fail(element1.getText() + "  is  " + element2.getText() + "  : FAILED");
		}
	}

	public static void submitFeedback(String Name, String email, String phoneNum, String Feedback) {
		waitTillElementPresent(feedBack.getNameEditable(), 20);
		feedBack.getNameEditable().sendKeys(Name);
		feedBack.getEmailEditable().sendKeys(email);
		scrollUp();
		feedBack.getPhoneNumberEditable().sendKeys(phoneNum);
		feedBack.getPrathikriyaEditable().sendKeys(Feedback);
		clickBtn(feedBack.getSubmit());
	}

	public static void saveManyStories() {
		clickBtn(photoList.getDownloadIcon1(), "Save Icon");
		scrollUp();
		clickBtn(photoList.getDownloadIcon1(), "Save Icon");
		clickBtn(photoList.getDownloadIcon2(), "Save Icon");
	}

	/*
	 * public boolean scrollAndVerifyIfSubsectionIsPresent(AndroidElement e) throws
	 * InterruptedException { aDriver.manage().timeouts().implicitlyWait(5,
	 * TimeUnit.SECONDS); try { minWait(); for(int i=1; i<=50;i++) {
	 * if(isElementDisplayed(e)) { return true; } else { scrollUp(); return false; }
	 * } } catch (Exception e1) { e1.printStackTrace(); } return false; }
	 */

	public boolean isAppinstalled() {
		pkg = properties.getProperty("appPackage");
		act = properties.getProperty("appActivity");
		try {
			runADBcmd("adb shell pm clear " + pkg);
			runADBcmd("adb shell am start -n " + pkg + "/" + act);
			reOpenApp();
			logger.info("App is not present");
			return false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return true;
	}

	public void verifyTwoSizes(int expectedSize, int actualSize) {
		if (actualSize == expectedSize) {
			MyExtentListners.test.pass(actualSize + " || " + expectedSize + " are matching");
		} else {
			MyExtentListners.test.fail(actualSize + " || " + expectedSize + " are not matching");
			assertEquals(expectedSize, actualSize);
		}
	}

	public static void longPressAndSwipeToCloseVideo(AndroidElement ele, int fromX, int fromY, int toX, int toY) {
		TouchAction action = new TouchAction(aDriver);
		// performing the long press
		action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(ele))).perform();
		scroll(fromX, fromY, toX, toY);
		Boolean check = isElementDisplayed(ele);
		if (check == false)
			MyExtentListners.test.pass("Swiped to close video: PASSED");
		else
			MyExtentListners.test.fail("Unable to swipe to close video: FAILED");

	}

	public static void longPressAndSlide(AndroidElement ele, int fromX, int fromY, int toX, int toY) {
		TouchAction action = new TouchAction(aDriver);
		// performing the long press
		action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(ele))).perform();
		scroll(fromX, fromY, toX, toY);
	}

	public void installProdApp() {
		try {
			aDriver.installApp(System.getProperty("user.dir") + prodApkPath);
			logger.info("Prod App Installed Succesfully");
			MyExtentListners.test.pass("App Install - Successfull");
		} catch (Exception e) {
			MyExtentListners.test.fail("App not Installed");
			Assert.fail();
			// e.printStackTrace();
		}
	}
	
	public void installDevApp() {
		try {
			aDriver.installApp(System.getProperty("user.dir") + devApkPath);
			logger.info("Dev App launched Succesfully");
			MyExtentListners.test.pass("App Install -  Successfull");
		} catch (Exception e) {
			MyExtentListners.test.fail("App not Installed");
			Assert.fail();
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}


	public void uninstallApp() {
		try {
			aDriver.removeApp(properties.getProperty("appPackage"));
			logger.info("App Unnistalled Succesfully");
			MyExtentListners.test.pass("App Unnistall - Successfull");
			Thread.sleep(3000);
		} catch (Exception e) {
			MyExtentListners.test.fail("Could not uninstall the App");
			Assert.fail();
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

}
