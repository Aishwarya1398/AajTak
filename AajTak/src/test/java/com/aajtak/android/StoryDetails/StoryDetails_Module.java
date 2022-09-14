//package com.aajtak.android.StoryDetails;
//
//import java.io.IOException;
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
//
//public class StoryDetails_Module extends Aajtak_app_Util {
//
//	@Test(description = "Verify that user is navigate to the story detail screen when user taps on a story",priority = 1)
//	public void AT_StoryDetail_001() throws Exception {
//		launchApp();
//		onboarding.compelteOnboarding();
//		selectSectionInHomeScreen(storyDetails.getManoranjanOpt());
//		scrollToElement(storyDetails.getfirstStoryTitle());
//		String expectedTitle = storyDetails.getfirstStoryTitle().getText();
//		clickBtn(storyDetails.getfirstStoryTitle(), "Tap on first Story");
//		clickBtn(storyDetails.gettikeSamajAgaya(), "Teekhe Samaj Aa Gaya");
//		String actualTitle = storyDetails.getstoryTitle().getText();
//		verifyTwoText(expectedTitle, actualTitle);
//	}
//
//	@Test(description = "Verify that user is able to view the below options on the Action overflow button: Comments icon, Bookmark icon, Offline Story icon, Text size and Share icon",priority = 2)
//	public void AT_StoryDetail_003() {
//		clickBtn(storyDetails.getmoreOption(), "Action Overflow Btn");
//		isElementExist(storyDetails.getCommentsIcon(), "Comments icon");
//		isElementExist(storyDetails.getBookmarkIcon(), "Bookmark icon");
//		isElementExist(storyDetails.getOfflineStoryOrSaveIcon(), "Offile Story icon");
//		isElementExist(storyDetails.gettextSizeIcon(), "Text Size icon");
//		isElementExist(storyDetails.getShareIcon(), "Share icon");
//	}
//
//	@Test(description = "Verify that user is able to navigate to comments screen by tapping on 'Comments' icon",priority = 3)
//	public void AT_StoryDetail_004() {
//		clickBtn(storyDetails.getCommentsIcon(), "Comments icon");
//		isElementExist(storyDetails.getCommentPage(), "Comments Screen");
//	}
//
//	@Test(description = "Verify that by tapping on the close button of the 'Comment' screen",priority = 4)
//	public void AT_StoryDetail_007() {
//		waitTillElementPresent(storyDetails.getCloseCommentsScreen(), 15);
//		clickBtn(storyDetails.getCloseCommentsScreen(), "Close Comments Screen");
//		isElementExist(storyDetails.getstoryTitle(), "Title of story detail");
//	}
//
//	@Test(description = "Verify that user is able to tap 'Bookmark' icon",priority = 5)
//	public void AT_StoryDetail_008() {
//
//		clickBtn(storyDetails.getmoreOption(), "Action Overflow Btn");
//		clickBtn(storyDetails.getBookmarkIcon(), "Bookmark icon");
//		String mesg = storyDetails.getToastMsg().getText();
//		verifyTwoText(mesg, "बुकमार्क किया गया :)");
//	}
//
//	@Test(description = "Verify that user is able to tap 'Offline Story' icon",priority = 6)
//	public void AT_StoryDetail_011() {
//
//		clickBtn(storyDetails.getmoreOption(), "Action Overflow Btn");
//		clickBtn(storyDetails.getOfflineStoryOrSaveIcon(), "Offline Story icon");
//		String mesg = storyDetails.getToastMsg().getText();
//		verifyTwoText(mesg, "सेव किया गया :)");
//	}
//
//	@Test(description = "Verify that the user is able to swipe through the Article",priority = 7)
//	public void AT_StoryDetail_017() {
//
//		swipeRight();
//		isElementExist(storyDetails.getstoryTitle());
//		clickBtn(storyDetails.getnavigateback(), "navigate Back");
//	}
//
//	@Test(description = "Verify that user is able to view the bookmarked story is available in 'Bookmark' tab",priority = 8)
//	public void AT_StoryDetail_009() {
//		String expectedTitle = storyDetails.getfirstStoryTitle().getText();
//		clickBtn(storyDetails.getHamburgerIcon());
//		clickBtn(storyDetails.getBookmarkInHamburgerMenu());
//		isElementExist(storyDetails.getFirstTitleInBookmarkPage());
//		String actualTitle = storyDetails.getFirstTitleInBookmarkPage().getText();
//		verifyTwoText(expectedTitle, actualTitle);
//		clickBtn(storyDetails.getbackArrow());
//	}
//
//	@Test(description = "Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story",priority = 9)
//	public void AT_StoryDetail_010() throws Exception {
//		waitTillElementPresent(storyDetails.getfirstStoryTitle(), 60);
//		scrollToElement(storyDetails.getfirstStoryTitle());
//		clickBtn(storyDetails.getfirstStoryTitle());
//		clickBtn(storyDetails.getmoreOption(), "Action Overflow Btn");
//		clickBtn(storyDetails.getBookmarkIcon(), "Bookmark icon");
//		String mesg = storyDetails.getToastMsg().getText();
//		verifyTwoText(mesg, "बुकमार्क हटाया गया");
//		clickBtn(storyDetails.getnavigateback());
//	}
//
//	@Test(description = "Verify that user is able to view the offlined story is available in 'Downloaded Content' tab",priority = 10)
//	public void AT_StoryDetail_013() {
//		String expectedTitle = storyDetails.getfirstStoryTitle().getText();
//		clickBtn(storyDetails.getHamburgerIcon());
//		clickBtn(storyDetails.getdownloadInHamburgerMenu());
//		isElementExist(storyDetails.getfirstTitleInSavedPage());
//		String actualTitle = storyDetails.getfirstTitleInSavedPage().getText();
//		verifyTwoText(expectedTitle, actualTitle);
//	}
//
//	@Test(description = "Verify that user is able to share story by tapping on the 'Share' icon ",priority = 11)
//	public void AT_StoryDetail_014() throws Exception {
//		reOpenApp();
//		selectSectionInHomeScreen(storyDetails.getManoranjanOpt());
//		scrollToElement(storyDetails.getfirstStoryTitle());
//		clickBtn(storyDetails.getfirstStoryTitle());
//		clickBtn(storyDetails.getmoreOption(), "Action Overflow Btn");
//		clickBtn(storyDetails.getShareIcon(), "Share icon");
//		waitTillElementPresent(storyDetails.getOtherShare(), 60);
//		List<AndroidElement> optionText = storyDetails.getShareOptionHighlights();
//		for (AndroidElement allText : optionText) {
//
//			isElementExist(allText);
//		}
//		clickBtn(storyDetails.getshareCancel());
//	}
//
//	@Test(description = "Verify that user should be able view the time of updation of the story",priority = 12)
//	public void AT_StoryDetail_002() throws InterruptedException, IOException {
//		waitTillElementPresent(storyDetails.getstoryUpdatedTime(), 60);
//		isElementExist(storyDetails.getstoryUpdatedTime());
//
//	}
//	
//	/*
//	 *@Test(description = "Verify that the inarticle links open in another tab",priority = 13)
//	 * public void AT_StoryDetail_019() throws
//	 * InterruptedException, IOException { reOpenApp();
//	 * selectSectionInHomeScreen(storyDetails.getManoranjanOpt());
//	 * scrollToElement(storyDetails.getfirstStoryTitle());
//	 * clickBtn(storyDetails.getfirstStoryTitle(),"Tap on first Story");
//	 * //clickBtn(storyDetails.gettikeSamajAgaya(),"Teekhe Samaj Aa Gaya");
//	 * waitTillElementPresent(dailyCapsule.getarticletitle(), 60);
//	 * scrollToElement(storyDetails.getinarticleLink1()); String expectedTitle =
//	 * storyDetails.getinarticleLink1().getText();
//	 * System.out.println(expectedTitle);
//	 * clickBtn(storyDetails.getinarticleLink1());
//	 * waitTillElementPresent(storyDetails.getstoryTitle(),60); String actualTitle =
//	 * storyDetails.getstoryTitle().getText(); System.out.println(actualTitle);
//	 * //verifyTwoText(actualTitle, expectedTitle); verifyTextContains(actualTitle,
//	 * expectedTitle); }
//	 */
//
//	/*
//	 * @Test(description = "Verify that the user is play the embedded videos in the story detail screen",priority = 14)
//	 *  public void AT_StoryDetail_018() throws
//	 * InterruptedException { scrollToElement(storyDetails.getembeddedVideo());
//	 * clickBtn(storyDetails.getembeddedVideo()); }
//	 */
//
//}
