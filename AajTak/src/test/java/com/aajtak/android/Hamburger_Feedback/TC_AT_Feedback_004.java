package com.aajtak.android.Hamburger_Feedback;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 1 July 2021 This is Hamburger_Feedback Module of AajTak Application.
 * 
 * Description:  Verify whether user is able to submit feedback by tapping on 'Submit Another Response' from confirmation message.
 * @author Archana George
 * @version 9.37(417)
 */
public class TC_AT_Feedback_004 extends Aajtak_app_Util{
	@Test(description="Verify whether user is able to submit feedback by tapping on 'Submit Another Response' from confirmation message")
	public void AT_Feedback_004() throws InterruptedException
	{
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		Aajtak_app_Util.compelteOnboarding();
		
		//Click on Hamburger Menu Icon
		clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Icon");
		
		//It will scroll till to settings option.
		scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//Click on settings option
		clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
		
		//It will scroll till to FeedBack option.
		scrollToElement(settings.getFeedBack());
		
		//Click on Feedback option
		clickBtn(settings.getFeedBack());
		
		//Fill all the required input values and click on submit
		submitFeedback("Tester", "tester.ty@gamil.com", "7483025620", "This is a test comment");
		
		//It will wait till the another response to be submitted
		waitTillElementPresent(feedBack.getSubmitAnotherRespone(), 10);
		
		//Click on another response
		clickBtn(feedBack.getSubmitAnotherRespone());
		
		//Fill all the required input values and click on submit
		submitFeedback("Tester", "tester.ty@gamil.com", "7483025620", "This is a test comment 2");
		
		//It will verify that feedback confirmation is present or not
		isElementExist(feedBack.getFeedbackConfirmation());
		
		//It will verify that submit another response form  is displayed or not
		isElementExist(feedBack.getSubmitAnotherRespone());
	}
}
