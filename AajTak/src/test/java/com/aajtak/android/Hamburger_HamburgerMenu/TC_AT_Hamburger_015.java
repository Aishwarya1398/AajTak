package com.aajtak.android.Hamburger_HamburgerMenu;


import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  Verify that the user is able to expand the Top Categories.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_015 extends Aajtak_app_Util {

	@Test(description = "Verify that the user is able to expand the Top Categories", priority = 15)
	public void AT_Hamburger_015() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//Click on Top Category in Hamburger Menu
		clickBtn(hamburgerMenu.getTopCategory());
		
		//Click on Anya Category in Hamburger Menu
		clickBtn(hamburgerMenu.getAnyaCategory());
		
		//It will verify that Home option is present or not in Top Category
		Boolean check = isElementDisplayed(hamburgerMenu.getHomeInTopCategory());
		
		//It will validate that Home option is not present
		Assert.assertEquals(false, check);
		
		//Click on Top Category in Hamburger Menu
		clickBtn(hamburgerMenu.getTopCategory());
		
		//It will wait till Home option to be loaded and displayed
		waitTillElementPresent(hamburgerMenu.getHomeInTopCategory(),20);
		
		//It will verify that Home Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getHomeInTopCategory());
		
		//It will verify that Live TV Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getLiveTVInTopCategory());
		
		//It will verify that Bharath Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getBharathInTopCategory());
		
		//It will verify that Photo Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getPhotoInTopCategory());
		
		//It will verify that Video Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getVideoInTopCategory());
		
		//It will verify that Manoranjan Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getManorajanInTopCategory());
		
		//It will verify that Aajtak HD Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getAajTakHDInTopCategory());
		
		//It will verify that DailyHighlightes Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getDailyHighlightesInTopCategory());
		
		//It will verify that Jurm Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getJurmInTopCategory());
		
		//It will verify that Technology Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getTechnologyInTopCategory());
		
		//It will scroll till Trading Option in Top Category
		scrollToElement(hamburgerMenu.getTradingInTopCategory());
		
		//It will verify that Khel Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getKhelInTopCategory());
		
		//It will verify that Dharm Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getDharmInTopCategory());
		
		//It will verify that Business Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getBusinessInTopCategory());
		
		//It will verify that Trading Option is Present or not in Top Category
		isElementExist(hamburgerMenu.getTradingInTopCategory());
	}


}