package com.aajtak.android.StoryDetails;

import java.io.IOException;

import org.testng.Assert;
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
 * This test case is to verify that the in-article links open in another tab.
 *
 */
public class TC_AT_StoryDetail_019 extends Aajtak_app_Util {

	@Test(description = "Description : Verify that the inarticle links open in another tab")
	public void AT_StoryDetail_019() throws InterruptedException, IOException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Select the manoranjan option in horizontal menu
		selectSectionInHomeScreen(homescreen.getManoranjanTab());
		
		//Scroll to first story title of manoranjan
		scrollToElement(newsList.getnewslistfirsttitle());
		
		//Click on first story title
		clickBtn(newsList.getnewslistfirsttitle());
		
		//Click on tike samaj aagaya in story detail walkthrough page
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//It will wait until to story description gets loaded
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
		
		//Scroll till to an in-article link
		scrollToElement(storyDetail.getInArticleLink1());
		
	//	String expectedTitle = storyDetail.getInArticleLink1Text().getText();
		
		//Click on in-article link
		clickBtn(storyDetail.getInArticleLink1());
		
		//It will verify that whether the action over flow button, Tike samaj aagaya or back button is present or not
		Boolean check = (isElementDisplayed(storyDetail.getActionOverflowBtn())) || (isElementDisplayed(photoDetail.getTikeSamajAgaya())) || (isElementDisplayed(storyDetail.getNavigatebackFromAnystory()));
		
		//It will verify either any of component is present
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
	/*
	 * @Test(description =
	 * "Description : Verify that the inarticle links open in another tab") public
	 * void AT_StoryDetail_0110() throws InterruptedException, IOException {
	 * launchApp(); compelteOnboarding();
	 * selectSectionInHomeScreen(homescreen.getManoranjanTab());
	 * scrollToElement(newsList.getnewslistfirsttitle());
	 * clickBtn(newsList.getnewslistfirsttitle());
	 * clickBtn(storyDetail.getTikeSamajAgaya());
	 * waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
	 * scrollToElement(storyDetail.getInArticleLink1()); String expectedTitle =
	 * storyDetail.getInArticleLink1Text().getText(); Boolean check =
	 * verifyInarticleLink(); if(check==true) {
	 * waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120); String
	 * actualTitle = storyDetail.getTitleOfAnyStory().getText();
	 * verifyStoryTitles(actualTitle, expectedTitle); } else
	 * System.out.println("Not found"); }
	 */
}