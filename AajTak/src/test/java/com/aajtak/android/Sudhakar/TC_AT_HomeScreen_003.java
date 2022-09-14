package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_003 extends Aajtak_app_Util {

	@Test(priority = 3)
	public void AT_Home_003() throws InterruptedException {


		launchApp();

		
		
		compelteOnboardingCopy();
		
		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);


		scrollToElement(homescreen.getFirstNews());

		scrollToElement(homescreen.getFirstNewstitle());
		scrollToElement(homescreen.getFirsttopvideoArticle());

	
		isElementExist(homescreen.getFirsttopvideoArticle(), "video article is present");
		
	}
}