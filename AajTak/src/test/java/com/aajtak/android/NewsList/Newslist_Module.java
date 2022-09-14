//package com.aajtak.android.NewsList;
//
//import java.util.List;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.aajtak.android.init.Aajtak_app_Util;
//
//import io.appium.java_client.android.AndroidElement;
///**
// * Date : 28 May 2021 This is Newslist module of AajTak Application
// * 
// * @author Archana George
// * @version 9.37(417)
// *
// */
//@Listeners(com.aajtak.android.listener.MyExtentListners.class)
//public class Newslist_Module extends Aajtak_app_Util {
//
//	@Test(priority = 1,description="Description: Verify that the user is able to navigate to the news listing screen from hamburger menu")
//	public void AT_Newslist_001() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(onboarding.getHamburgerIcon(), "Hambergur Menu");
//		String hamburgerSection = newsList.getnewslistHamburger().getText();
//		clickBtn(newsList.getnewslistHamburger(), "Newslist section");
//		waitTillElementPresent(newsList.getNewslistTabManoranjan());
//		String horizontalSection = newsList.getNewslistTabManoranjan().getText();
//		isElementExist(newsList.getNewslistTabManoranjan());
//		verifyTwoText(hamburgerSection, horizontalSection);
//	}
//
//	@Test(priority = 2,description="Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon")
//	public void AT_Newslist_002() throws InterruptedException {
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 60);
//		isElementExist(newsList.getcommenticon(), "Comment icon");
//		isElementExist(newsList.getbookmarkIcon(), "Bookmark icon");
//		isElementExist(newsList.getdownloadIcon(), "Download icon");
//		isElementExist(newsList.getshareIcon(), "Share icon");
//	
//	}
//
//	@Test(priority = 3,description="Description: Verify that user is able to tap 'Offline Story' icon below any story")
//	public void AT_Newslist_003() throws InterruptedException {
//		reOpenApp();
//		clickBtn(newsList.getNewslistTabManoranjan());
//		waitTillElementPresent(newsList.getdownloadIcon(), 60);
//		clickBtn(newsList.getdownloadIcon(), "Save icon");
//		String mesg = newsList.getToastMsg().getText();
//		verifyTwoText(mesg, "सेव किया गया :)");
//	}
//
//	@Test(priority = 4,description="Description: Verify that user is able to tap 'Bookmark' icon below any story")
//	public void AT_Newslist_004() throws InterruptedException {
//		reOpenApp();
//		clickBtn(newsList.getNewslistTabManoranjan());
//		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
//		clickBtn(newsList.getbookmarkIcon(), "Bookmark icon");
//		String mesg = newsList.getToastMsg().getText();
//		verifyTwoText(mesg, "बुकमार्क किया गया :)");
//	}
//
//	@Test(priority = 5,description="Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story")
//	public void AT_Newslist_005() throws InterruptedException {
//		reOpenApp();
//		clickBtn(newsList.getNewslistTabManoranjan());
//		waitTillElementPresent(newsList.getcommenticon(), 15);
//		clickBtn(newsList.getcommenticon(), "Comment icon");
//		isElementExist(newsList.getcommentsDetail(), "Comments Page");// To be made robust by identifying a web element
//	}
//
//	@Test(priority = 6,description="Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'Home' screen")
//	public void AT_Newslist_006() throws InterruptedException {
//		clickBtn(newsList.getcommentsClose());
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
//		isElementExist(newsList.getNewslistTabManoranjan(), "Manoranjan");
//	}
//
//	@Test(priority = 7,description="Description: Verify that user is able to view the bookmarked story is available in 'Bookmark' tab")
//	public void AT_Newslist_007() throws InterruptedException {
//		String expectedTitle = newsList.getnewslistfirsttitle().getText();
//		clickBtn(onboarding.getHamburgerIcon(), "Hamburger menu");
//		clickBtn(onboarding.getBookmarkInHamburgerMenu(), "Bookmarks");
//		isElementExist(onboarding.getFirstTitleInBookmarkPage(), "Bookmarked Story");
//		String actualTitle = onboarding.getFirstTitleInBookmarkPage().getText();
//		verifyTwoText(expectedTitle, actualTitle);
//	}
//
//	@Test(priority = 8,description="Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
//	public void AT_Newslist_008() throws InterruptedException {
//		reOpenApp();
//		waitTillElementPresent(newsList.getNewslistTabManoranjan(), 30);
//		clickBtn(newsList.getNewslistTabManoranjan());
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
//		String expectedTitle = newsList.getnewslistfirsttitle().getText();
//		clickBtn(newsList.getdownloadIcon(), "Save icon");
//		clickBtn(onboarding.getHamburgerIcon(), "Hamburger Menu");
//		//waitTillElementPresent(newsList.gethamburgerDwnloadContent(),10);
//		clickBtn(newsList.gethamburgerDwnloadContent(), "Downloaded Content");
//		waitTillElementPresent(newsList.getfirstTitleInSavedPage());
//		isElementExist(newsList.getfirstTitleInSavedPage(), "Saved Story");
//		String actualTitle = newsList.getfirstTitleInSavedPage().getText();
//		verifyTwoText(expectedTitle, actualTitle);
//
//	}
//
//	@Test(priority = 9,description="Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
//	public void AT_Newslist_009() throws InterruptedException {
//		reOpenApp();
//		clickBtn(newsList.getNewslistTabManoranjan());
//		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
//		clickBtn(newsList.getbookmarkIcon(), "Bookmark icon");
//		String mesg = newsList.getToastMsg().getText();
//		verifyTwoText(mesg, "बुकमार्क हटाया गया");
//
//	}
//
//	@Test(priority = 10,description="Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story")
//	public void AT_Newslist_010() throws InterruptedException {
//		reOpenApp();
//		clickBtn(newsList.getNewslistTabManoranjan());
//		waitTillElementPresent(newsList.getshareIcon(),15);
//		clickBtn(newsList.getshareIcon(), "Share icon");
//		waitTillElementPresent(newsList.getOtherShare(), 15);
//		List<AndroidElement> optionText = newsList.getShareOptionHighlights();
//		for (AndroidElement allText : optionText) {
//
//			isElementExist(allText);
//		}
//	}
//
//	@Test(priority = 11,description="Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to Newslist screen")
//	public void AT_Newslist_011() throws InterruptedException {
//		isElementExist(newsList.getShareCancel());
//		clickBtn(newsList.getShareCancel());
//		isElementExist(newsList.getshareIcon(),"Share icon");
//	}
//
//	@Test(priority = 12,description="Description: Verify that user is able to view more options to share the story when user taps on'Anya'share option")
//	public void AT_Newslist_012() throws InterruptedException {
//		clickBtn(newsList.getshareIcon());
//		waitTillElementPresent(newsList.getShareCancel(), 15);
//		clickBtn(newsList.getOtherShare());
//		isElementExist(newsList.getAnyaShareText());
//		List<AndroidElement> optionText = newsList.getAnyaShareOptions();
//		for (AndroidElement allText : optionText) {
//
//			isElementExist(allText);
//		}
//
//	}
//
//	@Test(priority = 13,description="Description: Verify that user is navigated to Newslist screen when user taps on 'Cancel' or any where on the screen")
//	public void AT_Newslist_013() throws InterruptedException {
//		clickDeviceBackButton(1);
//		isElementExist(newsList.getnewslistfirsttitle());
//	}
//
//	@Test(priority = 14,description="Description: Verify that each story under Newslist screen is showing up the uploaded time")
//	public void AT_Newslist_014() throws InterruptedException {
//		reOpenApp();
//		clickBtn(newsList.getNewslistTabManoranjan());
//		waitTillElementPresent(newsList.getStoryDate());
//		getverifyStoryTitleWithUploadTime();
//		clickBtn(newsList.getnewslistTabCorona());
//		getverifyStoryTitleWithUploadTime();
//	}
//
//	/*
//	 * @Test(priority = 15,description="Verify that user is able to post the comment through google") public void AT_Newslist_015() throws
//	 * InterruptedException { reOpenApp();
//	 * clickBtn(newsList.getNewslistTabManoranjan());
//	 * clickBtn(newsList.getcommenticon()); Thread.sleep(5000);
//	 * clickBtn(newsList.getGoogleCommentbtn()); }
//	 */
//	/*
//	 * @Test(priority = 16,description="Verify that user is able to post the comment through facebook) public void AT_Newslist_016() throws InterruptedException {
//	 * reOpenApp(); clickBtn(newsList.getNewslistTabManoranjan());
//	 * clickBtn(newsList.getcommenticon()); Thread.sleep(5000);
//	 * clickBtn(newsList.getFbCommentbtn()); }
//	 */
//
//	/*
//	 * @Test(priority = 17,description="Verify that once user swipes the Newslist screen from top to bottom on home screen, Newslist screen gets refreshed") public void AT_Newslist_017() throws
//	 * InterruptedException { reOpenApp();
//	 * clickBtn(newsList.getNewslistTabManoranjan());
//	 * waitTillElementPresent(newsList.getnewslistfirsttitle(), 5);
//	 * verifyPullToRefreshText(); }
//	 */
//}
