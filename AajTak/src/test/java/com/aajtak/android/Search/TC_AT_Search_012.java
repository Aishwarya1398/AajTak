package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description:  This test case is to verify the template of the search results. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_012 extends Aajtak_app_Util {

	@Test(description = "Description: Verify the template of the search results")
	public void AT_Search_012() throws Exception
	{
		//It will launch the application.
		launchApp();

		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();

		//It will wait until search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);

		//Click on Search Option
		clickBtn(search.getSearch(),"Search");

		//It will verify whether popular searches is present or not
		isElementExist(search.getPopularSearches(),"Popular Searches");

		//It will verify whether first popular search is present or not
		isElementExist(search.getFirstPopularSearch(),"First Pupular Search");

		//It will verify whether second popular search is present or not
		isElementExist(search.getSecondPopularSearch(),"Second Pupular Search");

		//It will verify whether third popular search is present or not
		isElementExist(search.getThirdPopularSearch(),"Third Pupular Search");

		//It will verify whether fourth popular search is present or not
		isElementExist(search.getFourthPopularSearch(),"Fourth Pupular Search");

		//It will verify whether fifth popular search is present or not
		isElementExist(search.getFifthPopularSearch(),"Fifth Pupular Search");

		//It will verify whether sixth popular search is present or not
		isElementExist(search.getSixthPopularSearch(),"Sixth Pupular Search");
	}


}
