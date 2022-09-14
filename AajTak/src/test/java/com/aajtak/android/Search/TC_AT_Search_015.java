package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description:  This test case is to verify the video detail screens after clicking on any popular search. 
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_015 extends Aajtak_app_Util {

	@Test(description = "Description: Verify the video detail screens")
	public void AT_Search_015() throws Exception
	{
		//It will launch the application.
		launchApp();

		//It is used to load the complete Onboarding screen
		compelteOnboarding();
		
		//It will wait until search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);

		//Click on Search Option
		clickBtn(search.getSearch(),"Search");

		//Click on sixth popular Search Option
		clickBtn(search.getSixthPopularSearch(),"Sixth Popular Search");

		//Click on video Option
		clickBtn(search.getVideoResults(),"video");

		//Click on video title 
		clickBtn(search.getExcpectedVideoTitle());

		//It will verify whether video title is present or not in the vedio detail page.
		isElementExist(search.getActualVideoTitle());
	}

}
