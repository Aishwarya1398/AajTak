package com.aajtak.android.PermissionMessage;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is Permission message Module From Aaj Tak Application
 * Description : Verify that whether permission message is one time event
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_PermissionMessage_002 extends Aajtak_app_Util {

	@Test(description = "Description : Verify whether permission message is one time event", priority = 2)
	public void AT_PermissionMessage_002() throws InterruptedException {
		
		//Launching the app
		launchApp();
		
		//Waiting till the shuru kare element is present for 30 secs
		waitTillElementPresent(shuruKarienOnboarding.getShuruKarein(), 30);
//		waitTillElementPresent(shuruKarienOnboarding.getAageBado(), 30);
		
		//clicking on shuru karen button
		clickBtn(shuruKarienOnboarding.getShuruKarein());
//		clickBtn(shuruKarienOnboarding.getAageBado());
		
		//clicking one aage bade option
		clickBtn(notificatonPayeOnboarding.getAageBade());
		
		//Waiting till the element present where homescreen loading
		waitTillElementDisapper(homescreen.getHomeScreenLoading());
		
		//verifying allow button and clicking on allow button and validating whether loaction permsssion message is present 
		if (isElementDisplayed(permssionMessage.getAllowBtn())) {
			clickBtn(permssionMessage.getAllowBtn());
		}
		
		//If newsframe time is there we are closing the newspresso 
		if (isElementDisplayed(dailyHighlights.getCloseBtn())) {
			clickBtn(dailyHighlights.getCloseBtn(), "Daily hightlights Close Button");
		}
		if (isElementDisplayed(homescreenWalkthrough.getPullDownBtn())) {
			clickBtn(homescreenWalkthrough.getPullDownBtn(), "Pull Down Icon");
		}
		
		//Re opening the app and verifying whether user is able to view permission message again
		reOpenApp();
		boolean check = isElementDisplayed(permssionMessage.getAllowBtn());
		Assert.assertEquals(false,check);

	}
}
