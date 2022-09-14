package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_006 extends Aajtak_app_Util {
	
	                /* Test case- 301 */

	@Test(description = "Verify the user should be able to view the photos count of the gallery")
	public void AT_Photo_006() throws Exception {
		
		/* Launch The APP */
		 launchApp();
		Aajtak_app_Util.compelteOnboarding();
		//reOpenApp();
		
		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());
		
		/* wait for Photo Section to Load  */
		waitTillElementPresent(photoList.getDownloadIcon(), 15);
		isElementExist(photoList.getphotoCount(), "Photo Count");
		
		/* capture the photo count and Tap on the photo gallery */
		String count=photoList.getphotoCount().getText();
		clickBtn(photoDetail.getPhotoGalleryScreen(),"ImageGallery");
		clickBtn(photoDetail.getTikeSamajAgaya(),"Thik Hai Samajh Agya");
		String count1= photoDetail.getImageCountInPhotoDetail().getText();
		
		/* Validate */
		verifyTwoText(count, count1);
		
		/* Close The App */
		aDriver.closeApp();
		           
					
	}

}