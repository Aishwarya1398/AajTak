package com.aajtak.android.AppLaunch;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;


public class ManTS0001 extends Aajtak_app_Util {
@Test
	public void Tc001() {
	
		pkg = properties.getProperty("appPackage");
		act = properties.getProperty("appActivity");
//		act = properties.getProperty("homeappActivity");
		try {
			runADBcmd("adb shell pm clear "+pkg);
			runADBcmd("adb shell am start -n "+pkg+"/"+act);
			logger.info("App launched Succesfully");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		}

}
