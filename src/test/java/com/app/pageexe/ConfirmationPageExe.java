package com.app.pageexe;

import com.app.base.BaseClass;

public class ConfirmationPageExe extends BookingPageExe {

	public static void RadioButton()
	{
		BaseClass.clickdata(BaseClass.findElementname(radioButton));
	}
	public static void ContinueButton()
	{
		BaseClass.clickdata(BaseClass.findElementname(continuebutton));
	}
}
