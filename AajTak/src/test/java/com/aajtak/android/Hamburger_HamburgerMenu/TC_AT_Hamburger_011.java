package com.aajtak.android.Hamburger_HamburgerMenu;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 12 June 2021 This is Hamburger_HamburgerMenu Module of AajTak Application.
 * 
 * Description:  verify that the subcategories are listed below each category.
 * @author Archana George
 * @version 9.37(417)
 */

public class TC_AT_Hamburger_011 extends Aajtak_app_Util {

	@Test(description = "verify that the subcategories are listed below each category", priority = 14)
	public void AT_Hamburger_011() throws InterruptedException {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(homescreen.getHamburgerIcon(), "Hamburger Icon");
		
		//It fetch the all SubCategories of TopCategory
		List<AndroidElement> topCategoryList = hamburgerMenu.getSubCategoriesInTop();
		
		//It will verify that all sub categories are present or not
		for (AndroidElement list : topCategoryList) {
			isElementExist(list);
		}
		
		//It will Scroll to Anya category option
		scrollToElement(hamburgerMenu.getAnyaCategory());
		
		//It fetch the all SubCategories of AnyaCategory
		List<AndroidElement> anyaCategoryList = hamburgerMenu.getSubCategoriesInAnya();
		
		//It will verify that all sub categories are present or not
		for (AndroidElement list2 : anyaCategoryList) {
			isElementExist(list2);
		}

	}

}