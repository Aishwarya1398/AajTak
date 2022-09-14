package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description:Verify that user is able to view the search results when user taps on enter/search button in the keyboard
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_003 extends Aajtak_app_Util {

	//Pending: Unable to enter From the keyBoard
	@Test(description = "Description: Verify that user is able to view the search results when user taps on enter/search button in the keyboard")
	public void AT_Search_003() throws InterruptedException
	{
		launchApp();
		Aajtak_app_Util.compelteOnboarding();
		clickBtn(search.getSearch(),"search");
	}

}
