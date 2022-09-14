package com.aajtak.android.InArticleLink;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 25 June 2021 This is In-Article Link module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that user is navigated to story detail screen when user taps on the story in article link. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_InArticleLink_001 extends Aajtak_app_Util{
	
	@Test(description = "Description: Verify that user is navigated to story detail screen when user taps on the story inarticle link")
	public void AT_InArticleLink_001() throws Exception
	{
		
		//It is used to launch the aajtak application
		launchApp();
		
		// It is used to load the complete Onboardig screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on corona section in horizontal menu bar in the home screen.
		clickBtn(homescreen.getCoranaTab());
		
		//It will srcoll to first story of corona
		scrollToElement(storyDetail.getFirstStoryTitle());
		
		//Click on first story of corona
		clickBtn(storyDetail.getFirstStoryTitle());
		
		//Click on tike Samaj Aagaya option
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//It will scroll till to in-article link in story detail page
		scrollToElement(storyDetail.getInArticleLink1());
		
		//Click on in-article link
		clickBtn(storyDetail.getInArticleLink1(),"inArticle Link");
		
		//It will verify in-article header in the in-article story detail page
		isElementExist(inArticlelink.getInarticleStoryHeader());
	}

}
