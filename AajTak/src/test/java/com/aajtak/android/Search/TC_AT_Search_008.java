package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description:  This test case is to verify that user is able to view All, stories , Photos and Videos tabs  in the search results screen. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_008 extends Aajtak_app_Util{

	@Test(description = "Description: Verify that user is able to view All, stories , Photos and Videos tabs  in the search results screen.")
	public void AT_Search_008() throws Exception
	{
		//It will launch the application.
		launchApp();

		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();

		//It will wait until search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);

		//Click on Search Option
		clickBtn(search.getSearch(),"Search");

		//Click on first popular search
		clickBtn(search.getSecondPopularSearch(),"Second Popular Search");

		//It will verify whether All option is present or not
		isElementExist(search.getAllResults(),"All Results");

		//It will verify whether Story option is present or not
		isElementExist(search.getStoryResults(),"Story Results");

		//It will verify whether Photo option is present or not
		isElementExist(search.getPhotoResults(),"Photo Results");

		//It will verify whether Video option is present or not
		isElementExist(search.getVideoResults(),"Video Results");
	}

}

