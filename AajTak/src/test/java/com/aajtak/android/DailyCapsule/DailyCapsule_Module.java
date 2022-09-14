//package com.aajtak.android.DailyCapsule;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.NoSuchElementException;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.aajtak.android.init.Aajtak_app_Util;
//
//import io.appium.java_client.android.AndroidElement;
///**
// * Date : 20 May 2021 This is Daily Capsule module of AajTak Application
// * 
// * @author Archana George
// * @version 9.37(417)
// *
// */
//@Listeners(com.aajtak.android.listener.MyExtentListners.class)
//public class DailyCapsule_Module extends Aajtak_app_Util {
//
//	@Test(priority = 1, description="Description: Verify the user is able to view “Missed the daily capsule. Tap to see it again.” message")
//	public void AT_DailyCapsule_001() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		isElementExist(dailyCapsule.getdailycapbanner());
//	}
//
//	@Test(priority = 2, description="Description: Verify the user is able to view weather")
//	public void AT_DailyCapsule_002() throws InterruptedException {
//		isElementExist(dailyCapsule.gettemperature());
//		String weather = dailyCapsule.gettemperature().getText();
//		weather.contains("�C");
//	}
//
//	@Test(priority = 3,description="Description: Verify that the user is able to view drop down")
//	public void AT_DailyCapsule_003() throws InterruptedException {
//		isElementExist(dailyCapsule.getbannerdownarrow(),"Daily Capsule Drop Down Button");
//	}
//
//	@Test(priority = 4,description="Description: Verify that the user can Tap on drop-down in widget")
//	public void AT_DailyCapsule_004() throws InterruptedException {
//		clickBtn(dailyCapsule.getbannerdownarrow(),"Daily Capsule Drop Down Button");
//		isElementExist(dailyCapsule.getdownarrowsheet(),"Daily Capsule widget Settings");
//	}
//
//	@Test(priority = 5,description="Description: Verify that the user is able to view three options")
//	public void AT_DailyCapsule_005() throws InterruptedException {
//		isElementExist(dailyCapsule.getalwaysshow());
//		isElementExist(dailyCapsule.getshowonceinday());
//		isElementExist(dailyCapsule.getnevershow());
//	}
//
//	@Test(priority = 6,description="Description: Verify that when user selects always show this for Daily Capsule widget is always shown")
//	public void AT_DailyCapsule_006() throws InterruptedException {
//		clickBtn(dailyCapsule.getalwaysshow());
//		isElementExist(dailyCapsule.getdailycapbanner());
//	}
//
//	@Test(priority = 7,description="Description: Verify the user is able to tap on the Daily Capsule in Home page")
//	public void AT_DailyCapsule_007() throws InterruptedException {
//		clickBtn(dailyCapsule.getdailycapbanner());
//		isElementExist(dailyCapsule.getdailyhighlights());
//	}
//
//	@Test(priority = 8,description="Description: Verify that the user is able to view the count of the card on the top right corner")
//	public void AT_DailyCapsule_008() throws InterruptedException {
//		isElementExist(dailyCapsule.getnewswrapcount());
//	}
//
//	@Test(priority = 9,description="Description: Verify that the user should be able to view the share icon in the newspresso card")
//	public void AT_DailyCapsule_009()  throws InterruptedException {
//		isElementExist(dailyCapsule.getshareicon(),"Share icon");
//	}
//
//	@Test(priority = 10,description="Description: Verify that the user is able to view share options while tappin on the share sheet.")
//	public void AT_DailyCapsule_010()  throws InterruptedException {
//		clickBtn(dailyCapsule.getshareicon(),"Share icon");
//		waitTillElementPresent(newsList.getOtherShare(), 15);
//		List<AndroidElement> optionText = newsList.getShareOptionHighlights();
//		for (AndroidElement allText : optionText) {
//
//			isElementExist(allText);
//		}
//	}
//
//	@Test(priority = 11,description="Description: Verify that the the share sheet closes when user taps on cancel button")
//	public void AT_DailyCapsule_011()  throws InterruptedException {
//		clickBtn(dailyCapsule.getsharecancel());
//		isElementExist(dailyCapsule.getnewswarptitle());
//	}
//
//	@Test(priority = 12,description="Description: Verify that the user is able to view the walkthrough screen while tapping on the news card.")
//	public void AT_DailyCapsule_012() throws InterruptedException {
//		clickBtn(dailyCapsule.getnewswarptitle());
//		isElementExist(onboarding.getTikeSamajAgaya());
//
//	}
//
//	@Test(priority = 13,description="Description: Verify that user is navigated to News Detail screen when user taps on \"Teak hae Samaj Aagaya\"")
//	public void AT_DailyCapsule_013() throws InterruptedException {
//		clickBtn(onboarding.getTikeSamajAgaya());
//		waitTillElementPresent(dailyCapsule.getarticletitle(),120);
//		isElementExist(dailyCapsule.getarticletitle());
//	}
//
//	@Test(priority = 14,description="Description: Verify that user is able to navigate back from the story detail screen by tapping on the back button")
//	public void AT_DailyCapsule_014() throws InterruptedException {
//		clickBtn(dailyCapsule.getbackfromnewswarpdetail(),"Back Button");
//		waitTillElementPresent(dailyCapsule.getnewswarptitle(),30);
//		isElementExist(dailyCapsule.getnewswarptitle());
//	}
//
//	@Test(priority = 15,description="Description: Verify that the user is able to view the Daily capsule news in detail")
//	public void AT_DailyCapsule_015() throws InterruptedException {
//		String expectedTitle = dailyCapsule.getnewswarptitle().getText();
//		clickBtn(dailyCapsule.getnewswarptitle());
//		waitTillElementPresent(dailyCapsule.getarticletitle(),120);
//		String actualTitle = dailyCapsule.getarticletitle().getText();
//		verifyTwoText(actualTitle, expectedTitle);
//	}
//
//	@Test(priority = 16,description="Description: Verify that the user should be able to view the close button on the top left corner")
//	public void AT_DailyCapsule_016() throws InterruptedException {
//		clickBtn(dailyCapsule.getbackfromnewswarpdetail(),"Back Button");
//		isElementExist(onboarding.getCloseBtn(),"Newspwrap Close Button");
//	}
//
//	@Test(priority = 17,description="Description: Verify that user is able to close the newspresso card by tapping on the close icon")
//	public void AT_DailyCapsule_017() throws InterruptedException {
//		clickBtn(onboarding.getCloseBtn(),"Newspwrap Close Button");
//		isElementExist(dailyCapsule.getdailycapbanner(),"Daily Capsule Banner");
//	}
//
//	@Test(priority = 18,description="Description: Verify that user is able to swipe through newspress card by tapping on the arrow")
//	public void AT_DailyCapsule_018() throws InterruptedException {
//		clickBtn(dailyCapsule.getdailycapbanner(), "Daily Capsule Banner");
//		String firstcard = dailyCapsule.getnewswrapcount().getText();
//		clickBtn(dailyCapsule.getswipeup(),"Swipe Up Button");
//		String secondcard = dailyCapsule.getnewswrapcount().getText();
//		verifyTwodifferentString(firstcard, secondcard);
//	}
//
//	@Test(priority = 19,description = "Description: Verify that user is able to swipe through newspresso card by swiping up ")
//	public void AT_DailyCapsule_019() throws InterruptedException {
//		String secondcard = dailyCapsule.getnewswrapcount().getText();
//		scrollUp();
//		String thirdcard = dailyCapsule.getnewswrapcount().getText();
//		verifyTwodifferentString(secondcard, thirdcard);
//	}
//
//	@Test(priority = 20,description="Description: Verify that user is able to swipe through newspresso card by swiping down")
//	public void AT_DailyCapsule_020() throws InterruptedException {
//		String thirdcard = dailyCapsule.getnewswrapcount().getText();
//        scrollDown();
//		String secondcard = dailyCapsule.getnewswrapcount().getText();
//		verifyTwodifferentString(thirdcard, secondcard);
//	}
//
//	@Test(priority = 21, description="Description: Verify that when user selects never show this Daily Capsule widget is never shown")
//	public void AT_DailyCapsule_021() throws InterruptedException, NoSuchElementException{
//		reOpenApp();
//		waitTillElementPresent(dailyCapsule.getbannerdownarrow(),60);
//		clickBtn(dailyCapsule.getbannerdownarrow(),"Daily capsule banner down arrow");
//		clickBtn(dailyCapsule.getnevershow(),"Never show this");
//		boolean check = isElementDisplayed(dailyCapsule.getbannerdownarrow());
//		Assert.assertEquals(false,check);
//	}
//
//}
