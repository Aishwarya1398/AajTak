package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :   Verify that the user is able to delete all the stories in the bookmark page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_009 extends Aajtak_app_Util{

	@Test(description = "Description : Verify that the user is able to delete all the stories in the bookmark page")
	public void AT_Bookmarkcontent_009() throws InterruptedException {

        //Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Clicking on corona news list section
		clickBtn(homescreen.getCoranaTab());
		
		//Scrolling till story is present
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//Waiting till bookmark icon element present for 15secs
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		
		//Clicking bookmark icon in newslist section
		clickBtn(newsList.getbookmarkIcon(),"Bookmark icon");
		
		//Clicking on hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Clicking on bookmark content in hambergur menu
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmark Content");
		
		//Clicking sabhi saf karen option in story section
		clickBtn(bookmarkContent.getSabhiSafKaren());
		
		//verifying the alert message on sabhi saf kare
		isElementExist(bookmarkContent.getAletrtMessageOnSabhiSafKaren());
		
		//cliking on yes option in alert message
		clickBtn(bookmarkContent.getHaanOptionForClearBookmarkContent());
		
		//validating the toast message after clearing the section
		String msg = bookmarkContent.getToastMsg().getText();
		verifyTwoText(msg,"क्लीयर हुआ");
		
		//validating the message when there is boookmarked stories
		isElementExist(bookmarkContent.getContentMessage());


	}

}
