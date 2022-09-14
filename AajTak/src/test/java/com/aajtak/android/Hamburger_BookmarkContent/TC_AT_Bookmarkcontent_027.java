package com.aajtak.android.Hamburger_BookmarkContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Bookmark Section From Aaj Tak Application
 * Description :Verify that the user is able to remove the story/photo/video by clicking again on the icon
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Bookmarkcontent_027 extends Aajtak_app_Util {
	@Test(description="Description : Verify that the user is able to remove the story/photo/video by clicking again on the icon",priority = 17)
	public void  AT_Bookmarkcontent_027()  throws InterruptedException 
	{
		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Video Section
		//Clicking on video tab
		clickBtn(homescreen.getVideoTab());

		//Waiting till the bookmark icon present for 15 secs
		waitTillElementPresent(videoList.getBookmarkIcon(), 15);

		//Clicking on bookmark icon in video list
		clickBtn(videoList.getBookmarkIcon(), "Bookmark Icon");

		//Validating succesfull bookmark message
		String succesfulBookmarMsgVideo = videoList.getToastmsg().getText();

		//clicking on bookmark icon again on same video
		clickBtn(videoList.getBookmarkIcon(), "Bookmark Icon");

		//Validating removed bookmark message
		String removeBookmarkMsgVideo = videoList.getToastmsg().getText();

		//Validating two different messages 
		verifyTwodifferentString(succesfulBookmarMsgVideo, removeBookmarkMsgVideo);

		//Photo Section
		//Clicking on photo tab
		clickBtn(homescreen.getPhotoTab());

		//Waiting till the bookmark icon present for 15 secs
		waitTillElementPresent(photoList.getBookmarkIcon(), 15);

		//Clicking on bookmark icon in photo list
		clickBtn(photoList.getBookmarkIcon(), "Bookmark Icon");
		
		//Validating succesfull bookmark message
		String succesfulBookmarMsgPhoto = photoList.getToastmsg().getText();
		
		//clicking on bookmark icon again on same photo
		clickBtn(photoList.getBookmarkIcon(), "Bookmark Icon");
		
		//Validating removed bookmark message
		String removeBookmarkMsgPhoto = photoList.getToastmsg().getText();
		
		//Validating two different messages
		verifyTwodifferentString(succesfulBookmarMsgPhoto, removeBookmarkMsgPhoto);
		
		// Story Section
		//Clicking on corona newslit tab
		clickBtn(homescreen.getCoranaTab());
		
		//Waiting till the bookmark icon present for 15 secs
		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		
		//Clicking on bookmark icon in newslit
		clickBtn(newsList.getbookmarkIcon(), "Bookmark Icon");
		
		//Validating succesfull bookmark message
		String succesfulBookmarMsgStory = newsList.getToastMsg().getText();
		
		//clicking on bookmark icon again on same news / story
		clickBtn(newsList.getbookmarkIcon(), "Bookmark Icon");
		
		//Validating removed bookmark message
		String removeBookmarMsgStory = newsList.getToastMsg().getText();
		
		//Validating two different messagesSSS
		verifyTwodifferentString(succesfulBookmarMsgStory, removeBookmarMsgStory);
	}

}
