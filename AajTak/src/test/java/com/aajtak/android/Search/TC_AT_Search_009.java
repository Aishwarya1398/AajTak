package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description:  This test case is to verify that user is able to view stories, photos and videos in the All tab. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_009 extends Aajtak_app_Util{

	@Test(description = " Description : Verify that user is able to view stories, photos and videos in the All tab.")
	public void AT_Search_009() throws Exception {

		//It will launch the application.
		launchApp();

		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();

		//It will wait until search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);

		//Click on Search Option
		clickBtn(search.getSearch(),"Search");

		//Click on third popular search
		clickBtn(search.getThirdPopularSearch(),"Third Popular Search");

		//Click on all results
		clickBtn(search.getAllResults(),"All");

		//It will verify whether title of the first story is present or not
		isElementExist(storyDetail.getFirstStoryTitle());

		//Click on story results
		clickBtn(search.getStoryResults(),"Story");

		//It will verify whether title of the first story is present or not
		isElementExist(storyDetail.getFirstStoryTitle());

		//Click on photo results.
		clickBtn(search.getPhotoResults(),"Photo");

		//It will verify whether number of results is present or not
		isElementExist(search.getResultsCount(),"Number of results");

		//click on Video results
		clickBtn(search.getVideoResults(),"Video");

		//It will verify whether Title of video 
		isElementExist(search.getExcpectedVideoTitle());
	}

}
