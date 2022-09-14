package com.aajtak.android.PermissionMessage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is Permission message Module From Aaj Tak Application
 * Description : Verify that the user should be able to view location permission message
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_PermissionMessage_001 extends Aajtak_app_Util{
	
	@Test(description="Description : Verify that the user should be able to view location permission message",priority = 1)
	public void AT_PermissionMessage_001() throws InterruptedException {

		//launching the app
		launchApp();
		
		//Waiting till the element shuru karen button present for 30 secs
		waitTillElementPresent(shuruKarienOnboarding.getShuruKarein(), 30);
//		waitTillElementPresent(shuruKarienOnboarding.getAageBado(), 30);
		//Clicking on shuru karen button
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		clickBtn(shuruKarienOnboarding.getAageBado());
		
		//clicking on aage bade option
		clickBtn(notificatonPayeOnboarding.getAageBade());
		
		//Waiting till the element dissappear where homescreen will load
		waitTillElementDisapper(homescreen.getHomeScreenLoading());
		
		//Verifying whether allow button is present in permission message
		isElementExist(permssionMessage.getAllowBtn());
		
		//validating the permission messgae
		if(isElementDisplayed(permssionMessage.getAllowBtn())) {
			clickBtn(permssionMessage.getAllowBtn());
		}
		
		//If newsframe time is there we are closing the newspresso 
		if(isElementDisplayed(dailyHighlights.getCloseBtn())) {
			clickBtn(dailyHighlights.getCloseBtn(), "Daily hightlights Close Button");
		}
	  
	}

}
