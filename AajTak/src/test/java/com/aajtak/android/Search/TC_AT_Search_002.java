package com.aajtak.android.Search;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 18 June 2021 This is Search module of AajTak Application.
 * @author Janardhan P
 * @version 9.37(417)
 * Description: Verify that user is able to input text in the search text field 
 *
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_Search_002 extends Aajtak_app_Util {
	
	
	//Pending: Unable to enter From the keyBoard
	@Test(description = "Description : Verify that user is able to input text in the search text field")
	public void AT_Search_002() throws Exception
	{
		//Launching the app
		launchApp();
		
		//Complete on board set up
		Aajtak_app_Util.compelteOnboarding();
		
		//Clicking on search option in homescreen
		clickBtn(search.getSearch(),"Search");
		
		//Entering the required search option in search field
		search.getSearchArticles().sendKeys("aajtak");
//		search.getSearchArticles().sendKeys(Keys.ENTER);
		
	}

}
