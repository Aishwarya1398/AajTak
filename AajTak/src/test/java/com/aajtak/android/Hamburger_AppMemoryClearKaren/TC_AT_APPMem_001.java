package com.aajtak.android.Hamburger_AppMemoryClearKaren;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * App version v9.37(417)
 * This is Hamburger_AppMemoryClearKaren Module From AajTak Application
 * Description :  Verify user is able to tap on Clear app memory
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_APPMem_001 extends Aajtak_app_Util{
	
	@Test(description = "Verify user is able to tap on Clear app memory")
	public void AT_APPMem_001() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//Click on Hamburger Menu icon 
		clickBtn(homescreen.getHamburgerIcon(), "Hambergur Menu");
		
		//It will scroll till to settings option.
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//It will verify that settings option is present or not under anya category
		isElementExist(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on settings option
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//It will Scroll till to App memory clear karen 
		scrollToElement(settings.getAppMemoryClearKaren());
		
		//It will verify whether App Memory Clear Karen is present or not
		isElementExist(settings.getAppMemoryClearKaren());
		
		//Click on App Memory Clear karen option
		clickBtn(settings.getAppMemoryClearKaren());
		
		//It will verify that Alert message is present or not
		isElementExist(clearAppMemory.getAletrtMessageOnClearAppMemory());
	}

}
