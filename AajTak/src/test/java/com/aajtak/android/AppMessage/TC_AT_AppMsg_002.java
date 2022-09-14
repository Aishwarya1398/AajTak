package com.aajtak.android.AppMessage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is App message Module From Aaj Tak Application
 * Description : Verify the user is able to view Leave Preferences Message In CustomizeSection
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_AppMsg_002 extends Aajtak_app_Util{
	
	@Test(description = "Description : Leave Preferences Message In CustomizeSection",priority = 3)
	public void AT_AppMsg_002() throws InterruptedException {
	    
		//Launching the app
		launchApp();
		
		//Complete onboard set up
		compelteOnboarding();
		
		//Clicking the hambergur menu icon in homescreen
		clickBtn(homescreen.getHamburgerIcon(),"Hambergurmenu Icon");
		
		//Scrolling till the settings element 
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Verifying the settings element is present
		isElementExist(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Clicking on settings element in hambergur menu
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Verifying the section customization element in settings screen
		isElementExist(settings.getCustomizeSection(), "Section Customization");
		
		//Clicking the section customization element
		clickBtn(settings.getCustomizeSection(),"Section Customization");
		
		//verifying khel section is present
		isElementExist(sectionCustomizeKaren.getKhel());
		
		//verifying check box is present
		isElementExist(sectionCustomizeKaren.getSelectKhel(),"Check Box");
		
		//clicking check box present
		clickBtn(sectionCustomizeKaren.getSelectKhel(), "Check Box");
		
		//Clicking back arrow button in section customization page
		clickBtn(sectionCustomizeKaren.getBackArrowButton(), "Arrow Button");
		
		//validating leave preference message 
		isElementExist(sectionCustomizeKaren.getPreferenceMessage());	
		
		//Clicking on device back button four times
		clickDeviceBackButton(4);
	}	

}
