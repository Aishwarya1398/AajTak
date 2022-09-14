package com.aajtak.android.Hamburger_DownloadedContent;
//package com.aajtak.android.Hamburger_DownloadedContent;
//
//import org.testng.annotations.Test;
//
//
//import org.testng.annotations.Listeners;
//
//import com.aajtak.android.init.Aajtak_app_Util;
///**
// * Date : 8 June 2021 This is Hamburger Menu module of AajTak Application
// * 
// * @author Prathibha
// * @version 9.37(417)
// *
// */
//@Listeners(com.aajtak.android.listener.MyExtentListners.class)
//public class DownloadedConetent extends Aajtak_app_Util{
//	
//	@Test(description = "Verify that the user is able to navigate to Downloaded Contents from the Hamburger Menu",priority = 1)
//	public void AT_Dwncnt_001() throws Exception {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Menu");
//		isElementExist(hamburgerMenu.getdownloadInHamburgerMenu(), " Downloaded Content ");
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu(), " Downloaded Content ");
//		isElementExist(hamburgerMenu.getDwnloadPageTitle());
//	}
//
//	@Test(description = "Verify the downloaded content screen has three tab",priority = 2)
//	public void AT_Dwncnt_002() throws Exception {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu(), " Downloaded Content Icon");
//		isElementExist(hamburgerMenu.getstorySection(), " Story section");
//		isElementExist(hamburgerMenu.gettasvireSection(), "Tasvire section");
//		isElementExist(hamburgerMenu.getvideoSection(), "Video section");
//	}
//
//	@Test(description = "Verify the contents of the story page",priority = 3)
//	public void AT_Dwncnt_003() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getManoranjanHorizontalSection());
//		scrollToElement(newsList.getnewslistfirsttitle());
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
//		String expectedTitle = newsList.getnewslistfirsttitle().getText();
//		clickBtn(newsList.getdownloadIcon(),"Download Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//		clickBtn(hamburgerMenu.getstorySection());
//		String actualTitle = storyDetails.getfirstTitleInSavedPage().getText();
//		verifyTwoText(expectedTitle, actualTitle);
//	}
//
//	// 85
//	@Test(description = "Verify that there is an option to remove the story from Downloaded content",priority = 4)
//	public void AT_Dwncnt_004() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getManoranjanHorizontalSection());
//		scrollToElement(newsList.getnewslistfirsttitle());
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
//		String expectedTitle = newsList.getnewslistfirsttitle().getText();
//		clickBtn(newsList.getdownloadIcon(),"Download Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//		clickBtn(hamburgerMenu.getstorySection());
//		isElementExist(hamburgerMenu.getDeleteIconInStoryContent());
//	}
//
//	@Test(description = "Verify that when user clicks on delete, story is removed",priority = 5)
//	public void AT_Dwncnt_005() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getManoranjanHorizontalSection());
//		scrollToElement(newsList.getnewslistfirsttitle());
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
//		clickBtn(newsList.getdownloadIcon());
//		clickBtn(hamburgerMenu.getHamburgerIcon());
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//		clickBtn(hamburgerMenu.getstorySection());
//		clickBtn(hamburgerMenu.getDeleteIconInStoryContent());
//		String mesg = hamburgerMenu.getToastMsg().getText();
//		verifyTwoText(mesg, "डाउनलोडेड कंटेंट हटाया गया");
//	}
//
//	@Test(description = "Verify that the user is able to navigate to the article description page",priority = 6)
//	public void AT_Dwncnt_006() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getManoranjanHorizontalSection());
//		scrollToElement(newsList.getnewslistfirsttitle());
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
//		clickBtn(newsList.getdownloadIcon());
//		clickBtn(hamburgerMenu.getHamburgerIcon());
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//		clickBtn(hamburgerMenu.getstorySection());
//		clickBtn(hamburgerMenu.getStoryInDownloadBookmarkNotification());
//		waitTillElementPresent(storyDetails.getstoryTitle(),30);
//		isElementExist(storyDetails.getstoryTitle());
//	}
//
//	// 88
//	@Test(description = "Verify the message displayed when there is no Downloaded stories",priority = 9)
//	public void AT_Dwncnt_009() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getHamburgerIcon());
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//		isElementExist(hamburgerMenu.getMessageInDownloadedContent());
//	}
//
//
//	@Test(description = "Verify that the user is able to clear all the stories from the Downloaded stories screen by tapping on Sabhi Saaf Kare",priority = 10)
//	public void AT_Dwncnt_010() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getManoranjanHorizontalSection());
//		scrollToElement(newsList.getnewslistfirsttitle());
//		waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
//		clickBtn(newsList.getdownloadIcon());
//		clickBtn(hamburgerMenu.getHamburgerIcon());
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//		clickBtn(hamburgerMenu.getstorySection());
//		clickBtn(hamburgerMenu.getSabhiSaafKarein());
//		clickBtn(hamburgerMenu.getYesSabhiSaafKarein());
//		isElementExist(hamburgerMenu.getNoStorySavedMsg());
//	}
//
//	@Test(description = "Verify the photos section in downloaded content",priority = 11)
//	public void AT_Dwncnt_011() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//		waitTillElementPresent(hamburgerMenu.getOffline(), 30);
//		clickBtn(hamburgerMenu.getOffline(),"Save Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//		clickBtn(hamburgerMenu.getDownloadContentPhotoSec());
//		isElementExist(hamburgerMenu.getOfflineSavedPhoto());
//	}
//
//	@Test(description = "Verify the title and date of the gallery",priority = 12)
//	public void AT_Dwncnt_012() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//		String expectedTitle= hamburgerMenu.getExcpectedSavedPhotoTitle().getText();
//		String expectedDate = hamburgerMenu.getExpectedSavedPhotoDate().getText();
//		clickBtn(hamburgerMenu.getOffline(),"Save Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getDownloadContentPhotoSec());
//		String actualTitle  = hamburgerMenu.getActualSavedPhotoTitle().getText();
//		String actualDate = hamburgerMenu.getActualSavedPhotoDate().getText();
//		// verify date and title
//		verifyTwoText(expectedTitle, actualTitle);
//		verifyTwoText(expectedDate, actualDate);
//	}
//
//	@Test(description = "Verify that user is able to remove the gallery from Downloaded content",priority = 13)
//	public void AT_Dwncnt_013() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getOffline(),"Save Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getDownloadContentPhotoSec());
//		clickBtn(hamburgerMenu.getDeleteSavedPhoto(),"Delete Button");
//		isElementExist(hamburgerMenu.getNoPhotoGallerySavedMsg());
//
//	}
//
//	// 93
//	@Test(description = "Verify that when user clicks on any gallery get navigated to the photo detail page",priority = 14)
//	public void AT_Dwncnt_014() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getOffline(),"Save Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getDownloadContentPhotoSec());
//	    waituntilnewElementtobeClickable(hamburgerMenu.getActualSavedPhotoTitle(), 12);
//		waitTillElementNotPresent(hamburgerMenu.getprogressBar());
//		clickBtn(hamburgerMenu.getActualSavedPhotoTitle());
//		clickBtn(onboarding.getTikeSamajAgaya());
//		isElementExist(hamburgerMenu.getPhotoGalleryTitleVerification());
//	}
//
//	@Test(description = "Verify the message displayed when there is no Downloaded photos",priority = 15)
//	public void AT_Dwncnt_015() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getOffline(),"Save Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getDownloadContentPhotoSec());
//		clickBtn(hamburgerMenu.getDeleteSavedPhoto());
//		isElementExist(hamburgerMenu.getNoPhotoGallerySavedMsg());
//	}
//
//	@Test(description = "Verify that the user is able to clear all the photo galleries from the Downloaded content page by tapping on Sabhi Saaf Kare",priority = 16)
//	public void AT_Dwncnt_016() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//		clickBtn(hamburgerMenu.getOffline(),"Save Icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getDownloadContentPhotoSec());
//		clickBtn(hamburgerMenu.getSabhiSaafKarein());
//		clickBtn(hamburgerMenu.getYesSabhiSaafKarein());
//		String mesg = storyDetails.getToastMsg().getText();
//		verifyTwoText(mesg, "क्लीयर हुआ");
//		isElementExist(hamburgerMenu.getNoPhotoGallerySavedMsg());
//	}
//
//	@Test(description = "Verify the video section in downloaded content",priority = 17)
//	public void AT_Dwncnt_017() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getvideoOpt());
//		clickBtn(hamburgerMenu.getvideoOpt());
//		scrollToElement(hamburgerMenu.getOffline());
//		clickBtn(hamburgerMenu.getOffline(),"Save icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getvideoSection());
//		isElementExist(hamburgerMenu.getOfflineSavedvideo());
//	}
//
//	@Test(description = "Verify that the user is able to remove the video from Downloaded content section",priority = 18)
//	public void AT_Dwncnt_018() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getvideoOpt());
//		clickBtn(hamburgerMenu.getvideoOpt());
//		scrollToElement(hamburgerMenu.getOffline());
//		clickBtn(hamburgerMenu.getOffline(),"Save icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getvideoSection());
//		isElementExist(hamburgerMenu.getOfflineSavedvideo());
//		clickBtn(hamburgerMenu.getDeleteSavedvideo());
//		isElementExist(hamburgerMenu.getNoVideoGallerySavedMsg());
//	}
//	
//	@Test(description = "Verify that the title and time of video should appear below each of the section",priority = 19)
//	public void AT_Dwncnt_019() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getvideoOpt());
//		clickBtn(hamburgerMenu.getvideoOpt());
//		String expectedTitle = hamburgerMenu.getExcpectedSavedVideoTitle().getText();
//		String expectedDate = hamburgerMenu.getExpectedSavedVideoDate().getText();
//		clickBtn(hamburgerMenu.getOffline(),"Save icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getvideoSection());
//		// verify date and title
//		String actualTitle = hamburgerMenu.getActualSavedVideoTitle().getText();
//		String actualDate = hamburgerMenu.getActualSavedVideoDate().getText();
//		verifyTwoText(expectedTitle, actualTitle);
//		verifyTwoText(expectedDate, actualDate);
//	}
//	
//	@Test(description = "Verify that the user is able to navigated to the video detail page in downloaded content",priority = 20)
//	public void AT_Dwncnt_020()  throws InterruptedException 
//	{
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getvideoOpt());
//		clickBtn(hamburgerMenu.getvideoOpt());
//		scrollToElement(hamburgerMenu.getOffline());
//		clickBtn(hamburgerMenu.getOffline(),"Save icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getvideoSection());
//		isElementExist(hamburgerMenu.getOfflineSavedvideo());
//		//waitTillElementPresent(hamburgerMenu.getStoryFrame());
//		clickBtn(hamburgerMenu.getStoryTitleInDownloadedContent());
//		
//	}
//	
//		@Test(description = "Verify the message displayed when there is no videos displayed",priority =21)
//		public void AT_Dwncnt_023()  throws InterruptedException 
//		{
//			launchApp();
//			onboarding.compelteOnboarding();
//			clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//			clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//			clickBtn(hamburgerMenu.getvideoSection());
//			isElementExist(hamburgerMenu.getNoVideoGallerySavedMsg());
//		}
//		
//		@Test(description = "Verify that the user is able to Download the stories, photos or videos",priority = 22)
//		public void AT_Dwncnt_024()  throws InterruptedException 
//		{
//			launchApp();
//			onboarding.compelteOnboarding();
//			clickBtn(hamburgerMenu.getvideoOpt());
//			clickBtn(hamburgerMenu.getOffline());
//			String mesg1 = storyDetails.getToastMsg().getText();
//			verifyTwoText(mesg1, "सेव किया गया :)");
//			clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//			clickBtn(hamburgerMenu.getOffline());
//			String mesg2 =storyDetails.getToastMsg().getText();
//			verifyTwoText(mesg2, "सेव किया गया :)");
//			clickBtn(hamburgerMenu.getCoranaOpt());
//			clickBtn(hamburgerMenu.getOffline());
//			String mesg3 = storyDetails.getToastMsg().getText();
//			verifyTwoText(mesg3, "सेव किया गया :)");
//		}
//		
//		@Test(description = "Verify that as soon as user clicks on the button, it should appear in Downloaded content screen",priority = 23)
//		public void AT_Dwncnt_026()  throws InterruptedException 
//		{
//			launchApp();
//			onboarding.compelteOnboarding();
//			clickBtn(hamburgerMenu.getvideoOpt());
//			clickBtn(hamburgerMenu.getOffline());
//			clickBtn(hamburgerMenu.getPhotoInHorizontalSection());
//			clickBtn(hamburgerMenu.getOffline());
//			clickBtn(hamburgerMenu.getCoranaOpt());
//			clickBtn(hamburgerMenu.getOffline());
//			clickBtn(hamburgerMenu.getHamburgerIcon());
//			clickBtn(hamburgerMenu.getdownloadInHamburgerMenu());
//			clickBtn(hamburgerMenu.getstorySection());
//			isElementExist(hamburgerMenu.getStoryTitleInDownloadedContent());
//			clickBtn(hamburgerMenu.gettasvireSection());
//			isElementExist(hamburgerMenu.getPhotoTitleIndownloadContent());
//			clickBtn(hamburgerMenu.getvideoSection());
//			isElementExist(hamburgerMenu.getStoryTitleInDownloadedContent());
//		}
//
//	@Test(description = "Verify that user is navigated to previous screen by tapping on back button from Downloaded contents",priority = 24)
//	public void AT_Dwncnt_031() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Menu");
//		isElementExist(hamburgerMenu.getdownloadInHamburgerMenu(), " Downloaded Content ");
//		clickBtn(hamburgerMenu.getdownloadInHamburgerMenu(), " Downloaded Content ");
//		isElementExist(hamburgerMenu.getDwnloadPageTitle());
//		clickDeviceBackButton(1);
//		isElementExist(hamburgerMenu.getHamburgerIcon());
//
//	}
//	@Test(description = "Verify that the user is able to clear all the Video's from the Downloaded content page by tapping on Sabhi Saaf Kare",priority = 25)
//	public void AT_Dwncnt_033() throws InterruptedException {
//		launchApp();
//		onboarding.compelteOnboarding();
//		scrollToSections(hamburgerMenu.getvideoOpt());
//		clickBtn(hamburgerMenu.getvideoOpt());
//		scrollToElement(hamburgerMenu.getOffline());
//		clickBtn(hamburgerMenu.getOffline(),"Save icon");
//		clickBtn(hamburgerMenu.getHamburgerIcon(),"Hamburger Menu");
//		clickBtn(hamburgerMenu.getDownloadStoryInHamburgerMenu());
//		clickBtn(hamburgerMenu.getvideoSection());
//		clickBtn(hamburgerMenu.getSabhiSaafKarein());
//		clickBtn(hamburgerMenu.getYesSabhiSaafKarein());
//		String mesg = storyDetails.getToastMsg().getText();
//		verifyTwoText(mesg, "क्लीयर हुआ");
//		isElementExist(hamburgerMenu.getNoVideoSavedMsg());
//	}
//
//}
