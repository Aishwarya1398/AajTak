package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that user is able to navigate to photo detail in the gallery
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_005 extends Aajtak_app_Util{
	
	@Test(description="Description : Verify that user is able to navigate to photo detail in the gallery",priority = 5)
	public void AT_HomeSec_005() throws InterruptedException {

		//Launching the app
		launchApp();
		
		//Complete on board set up
		compelteOnboarding();
		
		//Scrolling till the Gallery element 
		scrollToElement(homescreen.getFirstGalleryInHomeScreen());
		
		//Verifying gallery is present in home screen
		isElementExist(homescreen.getFirstGalleryInHomeScreen(), "Photo Gallery");
		
		//Clicking on photo gallery in homescreen
		clickBtn(homescreen.getFirstGalleryInHomeScreen(), "Photo Gallery");
		
		//Waiting till the walk through screen present 
		waitTillElementPresent(photoDetail.getTikeSamajAgaya(), 40);
		
		//Clicking on thike samajh agaya in walk through screen
		clickBtn(photoDetail.getTikeSamajAgaya());
		
		//Verifying count of the photos in photo gallery
		isElementExist(photoDetail.getImageCountInPhotoDetail(), "Count of Photos");
		
		//Verifying image gallery source in photo detail
		isElementExist(photoDetail.getimageGallerySource(), "Image gallery source");
		
		//Clicking on device back button
		clickDeviceBackButton(1);

	}

}
