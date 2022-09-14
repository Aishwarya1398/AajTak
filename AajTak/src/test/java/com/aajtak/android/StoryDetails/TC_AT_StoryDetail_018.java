package com.aajtak.android.StoryDetails;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 1 June 2021 This is Story Detail module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that the user is able to play the embedded videos in the story detail screen.
 *
 */

public class TC_AT_StoryDetail_018 extends Aajtak_app_Util {

	@Test(description = "Verify that the user is able to play the embedded videos in the story detail screen")
	public void AT_StoryDetail_018() throws InterruptedException, IOException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Select the manoranjan option in horizontal menu
		selectSectionInHomeScreen(homescreen.getCoranaTab());
		
		//Scroll to first story title of manoranjan
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//Click on first story title
		clickBtn(newsList.getnewslistfirsttitle());
		
		//Click on tike samaj aagaya in story detail walkthrough page
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//It will wait until to story description gets loaded
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
		
		//Scroll till to embedded video
		scrollToElement(storyDetail.getEmbeddedVideo());
		
		//Click on that embedded video
		clickBtn(storyDetail.getEmbeddedVideo(),"Embedded video");
		
		//Thread.sleep(3000);
		//scroll(500, 1050, 500, 1100);
		//aDriver.findElementById("in.AajTak.headlines:id/exoPlayPauseButton").isDisplayed();
		/*
		 * aDriver.findElementById("in.AajTak.headlines:id/exo_content_frame").click();
		 * aDriver.findElementById("in.AajTak.headlines:id/exoPlayPauseButton").
		 * isDisplayed();
		 * aDriver.findElementById("in.AajTak.headlines:id/exo_progress").isDisplayed();
		 * aDriver.findElementById("in.AajTak.headlines:id/exo_content_frame").click();
		 */
		
		//It will check whether the arrow is present on embedded video player or not
		isElementExist(aDriver.findElementById("in.AajTak.headlines:id/iv_video_arrow"), "Embedded video player");
		
		//Click on arrow which is present on embedded video player
		aDriver.findElementById("in.AajTak.headlines:id/iv_video_arrow").click();
		
		//Verify that story detail page is displayed or not
		isElementExist(storyDetail.getActionOverflowBtn(), "Story Detail screen");
		//clickBtn(embedVideo.getProgressBar());
		//waitTillElementPresent(embedVideo.getProgressBar(), 30);
		//isElementExist(embedVideo.getProgressBar(), "Progress Bar");
	}
}

