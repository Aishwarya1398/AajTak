package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Photo_008 extends Aajtak_app_Util {
	
	                /* Test case- 298 */

	@Test(description = "Verify that the user is able to navigate to sub-categories by taping on the tab")
	public void AT_Photo_008() throws Exception {
		
		/* Launch The APP */
		launchApp();
		Aajtak_app_Util.compelteOnboarding();
		//reOpenApp();
		
		/* wait for home screen to load & tap on photo section */
		waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());
		
		/* Is sub categories Present in Photo Section */
		 isElementExist(photoList.getSubCategoriesOfPhotolistSection());
		 
		 		///print the list 
					
	}

}