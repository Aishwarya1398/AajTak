package com.aajtak.android.Hamburger_Feedback;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 1 July 2021 This is Hamburger_Feedback Module of AajTak Application.
 * 
 * Description:  Verify that user is able to 'Submit' the 'Feedback' form by providing valid details.
 * @author Archana George
 * @version 9.37(417)
 */
public class TC_AT_Feedback_003 extends Aajtak_app_Util{
	@Test(priority = 2, description="Verify that user is able to 'Submit' the 'Feedback' form by providing valid details")
	public void AT_Feedback_003() throws InterruptedException
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
		
		//Wait till the feedback screen is loaded
		waitTillElementPresent(feedBack.getNameEditable(), 10);
		
		//It will Enter the valid name into name text field
		feedBack.getNameEditable().sendKeys("nayana");
		
		//It will Enter the valid email into email text field
		feedBack.getEmailEditable().sendKeys("nayana.r@testyantra.in");
		
		//It  will scroll up little
		scrollUp();
		
		//It will Enter the valid phone number into phone number text field
		feedBack.getPhoneNumberEditable().sendKeys("95345764739");
		
		////It will Enter the comments into comment text field
		feedBack.getPrathikriyaEditable().sendKeys("Good Application with more number of options");
		
		//It will click on submit button
		clickBtn(feedBack.getSubmit());
		
		//It will wait till the another response to be submit
		waitTillElementPresent(feedBack.getSubmitAnotherRespone(), 10);
		
		//It will verify that whether the feed confirmation is displayed or not
		isElementExist(feedBack.getFeedbackConfirmation());
		
		//It will verify that whether the another response to be submit is present or not
		isElementExist(feedBack.getSubmitAnotherRespone());
	}
}
