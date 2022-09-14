package com.aajtak.android.Hamburger_AppMemoryClearKaren;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * Description :  Verify if user is not able to clear App Memory by tapping on nahi (No) from pop up message
 */
public class TC_AT_APPMem_003 extends Aajtak_app_Util {

	@Test(description = "Verify if user is not able to clear App Memory by tapping on nahi (No) from pop up message")
	public void AT_APPMem_003() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Photo tab on  homescreen 
		clickBtn(homescreen.getPhotoTab());
		
		//It will wait untill bookmark icon is present
		waitTillElementPresent(photoList.getBookmarkIcon(), 30);
		
		//Click on Bookmark Icon
		clickBtn(photoList.getBookmarkIcon(), "Bookmark Icon");
		
		//Click on Save Icon
		clickBtn(photoList.getDownloadIcon(), "Save Icon");
		
		//Click on Corona Tab on homescreen
		clickBtn(homescreen.getCoranaTab());
		
		//It will wait untill bookmark icon is present
		waitTillElementPresent(newsList.getbookmarkIcon(), 30);
		
		//Click on Bookmark icon
		clickBtn(newsList.getbookmarkIcon(), "Bookmark Icon");
		
		//Click on offline or Save Icon
		clickBtn(newsList.getdownloadIcon(), "Save Icon");
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//It will click on bookmark content in hamburger menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//It will verify that bookmarked story title is present or not
		isElementExist(bookmarkContent.getVerifyStoryTitle());
		
		//Click on photo section in bookmark content
		clickBtn(bookmarkContent.getTasvireSection());
		
		//It will verify that photo title is present or not
		isElementExist(bookmarkContent.getVerifyPhotoTitle());
		
		//Click on back arrow to navigate back
		clickBtn(bookmarkContent.getBackArrowButton(), "Back arrow button");
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//Click on Downloaded content in hamburger menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//It will verify that whether the saved story is present or not
		isElementExist(downloadedContent.getVerifyStoryTitle());
		
		//Click on Photo section in Downloaded content
		clickBtn(downloadedContent.getTasvireSection());
		
		//It will verify that saved photo is present or not
		isElementExist(downloadedContent.getVerifyPhotoTitle());
		
		//Click on Back button on download content page
		clickBtn(downloadedContent.getBackArrowButton(), "Back Arrow button");
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//It will scroll till to settings option.
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//It will verify that settings option is present or not under anya category
		isElementExist(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on settings option
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//It will Scroll till to App memory clear karen
		scrollToElement(settings.getAppMemoryClearKaren());
		
		//It will verify whether App Memory Clear Karen is present or not
		isElementExist(settings.getAppMemoryClearKaren());
		
		//Click on App Memory Clear karen option
		clickBtn(settings.getAppMemoryClearKaren());
		
		//It will verify that Alert Title is present or not
		isElementExist(clearAppMemory.getAletrtTitleOnClearAppMemory());
		
		//It will verify that Alert message is present or not
		isElementExist(clearAppMemory.getAletrtMessageOnClearAppMemory());
		
		//Click on NO option to clear app memory
		clickBtn(clearAppMemory.getNahiOptionForClearAppMemory());
		
		//It will verify that Confirmed toast message is displayed or not
		Boolean check = isElementDisplayed(clearAppMemory.getToastmsg());
		
		//It will validate that it is not cleared any app memory
		Assert.assertEquals(false, check);
		
		//Click on device back button
		clickDeviceBackButton(1);
		
		//Click on Downloaded content in hamburger menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//It will verify that Downloaded content is displayed or not
		Boolean check1 = isElementDisplayed(downloadedContent.getContentMessage());
		
		//It will verify that downloaded content is present or not
		Assert.assertEquals(false, check1);
		
		//Click on Photo section in downloaded content
		clickBtn(downloadedContent.getTasvireSection());
		
		//It will verify that Downloaded content is displayed or not
		Boolean check2 = isElementDisplayed(downloadedContent.getContentMessage());
		
		//It will verify that downloaded content is present or not
		Assert.assertEquals(false, check2);
		
		//It will verify that downloaded content is present or not
		clickBtn(downloadedContent.getBackArrowButton(), "Back Arrow button");
		
		//Click on hamburger menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//Click on Bookmark content in hamburger menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//It will verify that Bookmarked content is displayed or not
		Boolean check3 = isElementDisplayed(bookmarkContent.getContentMessage());
		
		//It will verify that bookmarked content is present or not
		Assert.assertEquals(false, check3);
		
		//Click on Photo section in bookmark content
		clickBtn(bookmarkContent.getTasvireSection());
		
		//It will verify that Bookmarked content is displayed or not
		Boolean check4 = isElementDisplayed(bookmarkContent.getContentMessage());
		
		//It will verify that bookmarked content is present or not
		Assert.assertEquals(false, check4);
		
		//It will report the App memory has been cleared or not
		report(!check4, "App memory has not been cleared ", "App memory has been cleared");
	}
}
