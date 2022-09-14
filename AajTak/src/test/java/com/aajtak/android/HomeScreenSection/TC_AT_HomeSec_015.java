package com.aajtak.android.HomeScreenSection;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that user is able to view inarticle links open in another tab
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_HomeSec_015 extends Aajtak_app_Util{
	
	@Test(description = "Description : Verify that the inarticle links open in another tab", priority=12)
	public void AT_HomeSec_015() throws InterruptedException, IOException {
		
		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Waiting till the daily capsule banner appears f0r 20 secs
		waitTillElementPresent(homescreen.getDailyCapsuleBanner(), 20);
		
		scrollToElement(homescreen.getOtherStoryTitle());
		clickBtn(homescreen.getOtherStoryTitle());
		
		//Scrolling till the story is present in homescreen
		scrollToElement(homescreen.getStoryInHomeScreen());
		
		//Clicking on photo story in homescreen
		clickBtn(homescreen.getStoryInHomeScreen());
		
		//Clicking on thike samaj agaya in story detail walkthrough screen
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//Waiting till the story loads for 2 mins
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
		
		//Scrolling till the in article link present
		scrollToElement(storyDetail.getInArticleLink1());
		
		// clicking in in article link presentin story detail
		clickBtn(storyDetail.getInArticleLink1());
		
		//validating in article link openeing in another tab
		Boolean check = (isElementDisplayed(storyDetail.getActionOverflowBtn())) || (isElementDisplayed(photoDetail.getTikeSamajAgaya())) || (isElementDisplayed(storyDetail.getNavigatebackFromAnystory()));
		Assert.assertTrue(check);
		/*
		 * if (!(isElementDisplayed(storyDetail.getActionOverflowBtn()))) {
		 * clickDeviceBackButton(1); swipeRight();
		 * scrollToElement(storyDetail.getInArticleLink1()); expectedTitle =
		 * storyDetail.getInArticleLink1().getText();
		 * clickBtn(storyDetail.getInArticleLink1()); }
		 * waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120); String
		 * actualTitle = storyDetail.getTitleOfAnyStory().getText();
		 * verifyStoryTitles(actualTitle, expectedTitle);
		 */
	}

}
