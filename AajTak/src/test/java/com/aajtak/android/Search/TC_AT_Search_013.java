package com.aajtak.android.Search;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;


/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description:  This test case is to verify the article detail screens after clicking on any popular search. 
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_013 extends Aajtak_app_Util{

	@Test(description = "Description : Verify the article detail screens")
	public void AT_Search_013() throws Exception {

		//It will launch the application.
		launchApp();

		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();

		//It will wait until search option to be visible to click.
		waituntilnewElementtobeClickable(search.getSearch(),10);

		//Click on Search Option
		clickBtn(search.getSearch(),"Search");
		
		//click on fifth popular search
		clickBtn(search.getFifthPopularSearch(),"Fifth Popular Search");

		//click on story option
		clickBtn(search.getStoryResults(),"Story");

		//It will verify whether title of first story is present or not
		isElementDisplayed(storyDetail.getFirstStoryTitle());

		//Click on title of first story
		clickBtn(storyDetail.getFirstStoryTitle());

		//click on tike samaj aagaya option
		clickBtn(storyDetail.getTikeSamajAgaya());
		
		//Wait till the story detail screen loads
		waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);

		//It will verify whether story title is present or not in the story detail page.
		isElementExist(storyDetail.getTitleOfAnyStory());

		//It will verify whether Updated time for story is displayed or not
		boolean check = isElementDisplayed(storyDetail.getStoryUpdatedTime());

		//verify popular searches is displayed.
		Assert.assertEquals(true, check);
	}

}
