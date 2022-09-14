package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description: This test case is to verify the photo detail screens after clicking on any popular search. 
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_014 extends Aajtak_app_Util{

	@Test(description = "Description : Verify the photo detail screens")
	public void AT_Search_014() throws Exception {

		//It will launch the application.
		launchApp();

		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();

		//It will wait until search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);

		//Click on Search Option
		clickBtn(search.getSearch(),"Search");

		//Click on fifth popular Search Option
		clickBtn(search.getFifthPopularSearch(),"Fifth Popular Search");

		//Click on photo Option
		clickBtn(search.getPhotoResults(),"Photo");

		//It will verify whether number of results is present or not
		isElementDisplayed(search.getResultsCount());

		//Get text of number of results.
		String allResults = search.getResultsCount().getText();

		//Print the number of results.
		System.out.println(allResults);
	}

}
