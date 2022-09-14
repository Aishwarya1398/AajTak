package com.aajtak.android.Hamburger_Feedback;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 1 July 2021 This is Hamburger_Feedback Module of AajTak Application.
 * 
 * Description:  Verify that the feedback screen is loaded in web view & all the options are aligned.
 * @author Archana George
 * @version 9.37(417)
 */
public class TC_AT_Feedback_002 extends Aajtak_app_Util{
		@Test(description = "Verify that the feedback screen is loaded in web view & all the options are aligned",priority = 2)
		public void AT_Feedback_002() throws InterruptedException {
			
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
			
			//It will verify that feedback page is displayed or not
			isElementExist(feedBack.getFeedbackInSettings());
			
			//Wait till the feedback screen is loaded
			waitTillElementPresent(feedBack.getNameEditable(), 10);
			 
			//It will verify that  another feedback form is displayed or not
			isElementExist(feedBack.getAnotherFeedBackForm());
			
			//It will verify that Name title is present or not in feedback form
			isElementExist(feedBack.getNameTitle());
			
			//It will verify that Name text field is present or not in feedback form
			isElementExist(feedBack.getNameEditable(),"Name Text field");
			
			//It will verify that Email title is present or not in feedback form
			isElementExist(feedBack.getEmailTitle());
			
			//It will verify that Email text field is present or not in feedback form
			isElementExist(feedBack.getEmailEditable(),"Email Text field");
			
			//It  will scroll up little 
			scrollUp();
			
			//It will verify that Phone Number title is present or not in feedback form
			isElementExist(feedBack.getPhoneTitle());
			
			//It will verify that Phone Number text field is present or not in feedback form
			isElementExist(feedBack.getPhoneNumberEditable(),"Phone Number Text field");
			
			//It will verify that title of prathikriya is present or not in feedback form
			isElementExist(feedBack.getCommentTitle());
			
			////It will verify that Prathikriya or comment text field is present or not in feedback form
			isElementExist(feedBack.getPrathikriyaEditable(),"Comment Text field");
			
			////It will verify that Submit button is present or not in feedback form
			isElementExist(feedBack.getSubmit());
			
		}
}
