package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description:  This test case is to verify that user is navigated to search screen when user taps on the search icon. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_001 extends Aajtak_app_Util {
	
	@Test(description = "Description : Verify that user is navigated to search screen when user taps on the search icon")
	public void AT_Search_001() throws Exception
	{
		//It will launch the application.
		launchApp();
				
		// It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//It will wait until to search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);
		
		//Click on Search Option
		clickBtn(search.getSearch(),"Search");
		
		//It will verify whether popular search is present or not in the search page
		isElementExist(search.getPopularSearches(),"Popular searches");
	}
}
