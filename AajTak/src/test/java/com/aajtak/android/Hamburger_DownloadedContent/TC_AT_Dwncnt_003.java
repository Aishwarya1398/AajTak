package com.aajtak.android.Hamburger_DownloadedContent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * 
 * Description : Verify the contents of the story page
 */
public class TC_AT_Dwncnt_003 extends Aajtak_app_Util {
	
		@Test(description = "Verify the contents of the story page",priority = 3)
		public void AT_Dwncnt_003() throws InterruptedException {
			
			//It will launch application
			launchApp();
			
			//It is used to load the complete Onboarding screen
			compelteOnboarding();
			
			//Click on Corona tab present in horizontal menu
			clickBtn(homescreen.getCoranaTab());
			
			//Scroll to first news title of Corona
			scrollToElement(newsList.getnewslistfirsttitle());
			
			//It will wait till first title is present
			waitTillElementPresent(newsList.getnewslistfirsttitle(), 15);
			
			//Fetch the text of first title 
			String expectedTitle = newsList.getnewslistfirsttitle().getText();
			
			//Click on offline or save icon
			clickBtn(newsList.getdownloadIcon(),"Download Icon");
			
			//Click on Hamburger Menu icon
			clickBtn(homescreen.getHamburgerIcon(),"Hamburger Menu");
			
			//Click on Downloaded content in Hamburger Menu
			clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(),"Downloaded Content");
			
			//Click on story section in downloaded content
			clickBtn(downloadedContent.getStorySection());
			
			//Fetch the text of saved story title
			String actualTitle = downloadedContent.getVerifyStoryTitle().getText();
			
			//Compare both the titles and it should be same 
			verifyStoryTitles(expectedTitle, actualTitle);
		}

}
