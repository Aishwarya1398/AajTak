package com.aajtak.android.Hamburger_HamburgerMenu;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify that the user is able to expand the Anya Categories.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_017 extends Aajtak_app_Util {


	@Test(description = "Verify that the user is able to expand the Anya Categories", priority = 17)
	public void AT_Hamburger_017() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It will scroll till Anya Category in Hamburger Menu
		scrollToElement(hamburgerMenu.getAnyaCategory());
		
		//It will verify that Anya Category is present or not in Hamburger menu
		isElementExist(hamburgerMenu.getAnyaCategory());
		
		//It will verify that JobAndEducation Option is Present or not in Anya Category
		isElementExist(hamburgerMenu.getJobAndEducationInAnyaCategory());
		
		//It will verify that Karyakram Option is Present or not in Anya Category
		isElementExist(hamburgerMenu.getKaryakramInAnyaCategory());
		
		//It will scroll up little
		scrollUp();
		
		//It will verify that PhaiktChek Option is Present or not in Anya Category
		isElementExist(hamburgerMenu.getPhaiktChekInAnyaCategory());
		
		//It will verify that IndiaTodaygroupKeAnyaApps Option is Present or not in Anya Category
		isElementExist(hamburgerMenu.getIndiaTodaygroupKeAnyaAppsInAnyaCategory());
		
		//It will verify that Tez Option is Present or not in Anya Category
		//isElementExist(hamburgerMenu.getTezInAnyaCategory());
		
		//It will verify that Settings Option is Present or not in Anya Category
		isElementExist(hamburgerMenu.getSettingsInAnyaCategorys());// scrollUp();
		
		//It will verify that HamaareBaareMein Option is Present or not in Anya Category
		isElementExist(hamburgerMenu.getHamaareBaareMeinInAnyaCategory());
		
		//It will verify that IndiaTodaygroupKeAnyaApps Option is Present or not in Anya Category
		isElementExist(hamburgerMenu.getIndiaTodaygroupKeAnyaAppsInAnyaCategory());
	}
}