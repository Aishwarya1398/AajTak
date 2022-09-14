package com.aajtak.android.Hamburger_AppMemoryClearKaren;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * Description :  Verify user is able to clear app memory by tapping Yes on pop up
 */
public class TC_AT_APPMem_002 extends Aajtak_app_Util {

	@Test(description = "Description : Verify user is able to clear app memory by tapping Yes on pop up")
	public void AT_APPMem_002() throws InterruptedException {

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
		
		//Click on save icon 
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
		
		//Click on YES option to clear app memory
		clickBtn(clearAppMemory.getHaanOptionForClearAppMemory());
		
		//Get the message like App cache cleared successfully
		String msg = clearAppMemory.getToastmsg().getText();
		
		//It compare and  it should be match
		verifyTwoText(msg, "सफलतापूर्वक ऐप कैशे क्लीयर हुआ");
		
		//Click on device back button
		clickDeviceBackButton(1);
		
		//Click on Downloaded content in hamburger menu
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		
		//It will verify that content is present or not
		isElementExist(downloadedContent.getContentMessage());
		
		//Click on Photo section in downloaded content
		clickBtn(downloadedContent.getTasvireSection());
		
		//It will verify that content is present or not
		isElementExist(downloadedContent.getContentMessage());
		
		//Click on Back button on downlaoded content
		clickBtn(downloadedContent.getBackArrowButton(), "Back Arrow button");
		
		//Click on hamburger menu icon
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//Click on Bookmark content in hamburger menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//It will verify that content is present or not
		isElementExist(bookmarkContent.getContentMessage());
		
		//Click on Photo section in bookmark content
		clickBtn(bookmarkContent.getTasvireSection());
		
		//It will verify that content is present or not
		isElementExist(bookmarkContent.getContentMessage());

	}

}