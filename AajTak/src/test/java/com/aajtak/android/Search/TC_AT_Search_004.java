package com.aajtak.android.Search;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;
/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description: This test case is to verify that popular searches options are displayed in the search screen. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_004 extends Aajtak_app_Util {

	@Test(description = "Description: Verify that popular searches options are displayed in the search screen")
	public void AT_Search_004() throws Exception
	{
		//It will launch the application.
		launchApp();

		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();

		//It will wait until search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);

		//Click on Search Option
		clickBtn(search.getSearch(),"Search");

		//It will verify whether popular search is displayed or not in the search page 
		boolean check = isElementDisplayed(search.getPopularSearches());

		//verify popular searches is displayed.
		Assert.assertEquals(true, check);
	}
}

