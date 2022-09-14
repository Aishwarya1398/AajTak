//package com.aajtak.android.HomeScreen;
//
//import static org.testng.Assert.assertTrue;
//
//import java.util.List;
//
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.aajtak.android.init.Aajtak_app_Util;
//
//import io.appium.java_client.android.AndroidElement;
//
//@Listeners(com.aajtak.android.listener.MyExtentListners.class)
//public class HomeScreen_Module extends Aajtak_app_Util {
//
//	@Test(priority = 1, description = "Description: Verify once user launch the app,'Home' tab is selected by default")
//	public void AT_Home_001() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		waitTillElementPresent(homeScreen.getBadeKabren());
//		boolean check = homeScreen.getHomeTab().isSelected();
//		assertTrue(check, "Home Screen is selected");
//	}
//
//	@Test(priority = 2, description = "Description: Verify that 'Badi Khabarae' is the first section under 'Home' tab")
//	public void AT_Home_002() throws InterruptedException {
//		isElementExist(homeScreen.getBadeKabren());
//	}
//
//	@Test(priority = 3, description = "Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon")
//	public void AT_Home_003() throws InterruptedException {
//		scrollUp();
//		isElementExist(homeScreen.getComment(), "Comment icon");
//		isElementExist(homeScreen.getBookmark(), "Book mark icon");
//		isElementExist(homeScreen.getOffline(), "Save icon");
//		isElementExist(homeScreen.getShare(), "Share icon");
//	}
//
//	@Test(priority = 4, description = "Description: Verify that each story under 'Badi Khabarae' is showing up the uploaded time")
//	public void AT_Home_004() throws InterruptedException {
//		isElementExist(newsList.getStoryDate());
//	}
//
//	@Test(priority = 5, description = "Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story")
//	public void AT_Home_005() throws InterruptedException {
//		clickBtn(newsList.getcommenticon(), "Comment Icon");
//		isElementExist(newsList.getcommentsDetail());
//	}
//
//	@Test(priority = 6, description = "Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'Home' screen")
//	public void AT_Home_006() throws InterruptedException {
//		clickBtn(homeScreen.getClosecomment(), "Comment Close Button");
//		isElementExist(nonFunctional.getHomeLogo(), "AajTak Home");
//	}
//
//	@Test(priority = 7, description = "Description: Verify that user is able to tap 'Bookmark' icon below any story")
//	public void AT_Home_007() throws InterruptedException {
//		clickBtn(homeScreen.getBookmark(), "Bookmark Icon");
//		String mesg = newsList.getToastMsg().getText();
//		verifyTwoText(mesg, "बुकमार्क किया गया :)");
//
//	}
//
//	@Test(priority = 8, description = "Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
//	public void AT_Home_008() throws InterruptedException {
//		clickBtn(homeScreen.getBookmark(), "Bookmark Icon");
//		String mesg = newsList.getToastMsg().getText();
//		verifyTwoText(mesg, "बुकमार्क हटाया गया");
//	}
//
//	@Test(priority = 9, description = "Description: Verify that user is able to tap 'Offline Story' icon below any story")
//	public void AT_Home_009() throws InterruptedException {
//		clickBtn(homeScreen.getOffline(), "Save icon");
//		isElementExist(homeScreen.getOffline(), "Save icon");
//		String mesg1 = newsList.getToastMsg().getText();
//		verifyTwoText(mesg1, "सेव किया गया :)");
//	}
//
//	@Test(priority = 10, description = "Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story")
//	public void AT_Home_010() throws InterruptedException {
//		/*
//		 * reOpenApp(); waitTillElementPresent(homeScreen.getBadeKabren(), 30);
//		 * //scrollToElement(homeScreen.get
//		 */ isElementExist(homeScreen.getShare(), "Share icon");
//		clickBtn(homeScreen.getShare(), "Share icon");
//		waitTillElementPresent(newsList.getOtherShare(), 30);
//		List<AndroidElement> optionText = newsList.getShareOptionHighlights();
//		for (AndroidElement allText : optionText) {
//
//			isElementExist(allText);
//		}
//	}
//
//	@Test(priority = 11, description = "Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to 'Home' screen")
//	public void AT_Home_011() throws InterruptedException {
//		clickBtn(homeScreen.getSharecancel());
//		isElementExist(homeScreen.getShare(), "Share icon");
//	}
//
//	@Test(priority = 12, description = "Description: Verify that once user taps on 'Share' icon of any story & taps on 'Anya', it gives more options to share the story")
//	public void AT_Home_012() throws InterruptedException {
//		clickBtn(newsList.getshareIcon());
//		waitTillElementPresent(newsList.getShareCancel(), 30);
//		clickBtn(newsList.getOtherShare());
//		isElementExist(newsList.getAnyaShareText());
//		List<AndroidElement> optionText = newsList.getAnyaShareOptions();
//		for (AndroidElement allText : optionText) {
//
//			isElementExist(allText);
//		}
//	}
//
//	@Test(priority = 13, description = "Description: Verify that user is navigated to Newslist screen when user taps on 'Cancel' or any where on the screen")
//	public void AT_Home_013() throws InterruptedException {
//
//		clickBtn(homeScreen.getCancelsharing());
//		isElementExist(nonFunctional.getHomeLogo(), "AajTak Home");
//		
//
//	}
//
//	@Test(priority = 14, description = "Description: Verify that user is able to view the bookmarked story is available in 'Bookmark'tab")
//	public void AT_Home_014() throws InterruptedException {
//		clickBtn(homeScreen.getBookmark(), "Bookmark Icon");
//		clickBtn(homeScreen.getHamburgerIcon(), "Hamburger Menu");
//		clickBtn(homeScreen.getBookmarkInHamburgerMenu(), "Bookmarks");
//		isElementExist(hamburgerMenu.getStoryInDownloadBookmarkNotification());
//	}
//	
//	@Test(priority = 15, description = "Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
//	public void AT_Home_015() throws InterruptedException {
//		reOpenApp();
//		clickBtn(homeScreen.getHamburgerIcon());
//		clickBtn(homeScreen.getDownloadInHamburgerMenu());
//		isElementExist(hamburgerMenu.getStoryInDownloadBookmarkNotification());
//	}
//
//	/*
//	 * @Test(priority = 15, description =
//	 * "Description: Verify that user is able to tap on already added 'Offline Story' icon and view message stating the content is already been added"
//	 * ) public void AT_Home_015() throws InterruptedException {
//	 * 
//	 * clickBtn(homeScreen.getOffline()); }
//	 */
//	@Test(priority = 16, description = "Verify that once user swipes the home screen from top to bottom on home screen, home screen gets refreshed")
//	public void AT_Home_016() throws InterruptedException {
//		scrollDown();
//	}
//
//}