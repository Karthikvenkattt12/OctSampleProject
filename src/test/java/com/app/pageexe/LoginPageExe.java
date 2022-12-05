package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.LastPageLocators;

public class LoginPageExe extends LastPageLocators {
	
	public static void Website()
	{
		BaseClass.link("http://adactinhotelapp.com/index.php");
	}
	
	public static void username()
	{
		BaseClass.sentdata(BaseClass.findElementid(username), "kv1054330");
	}
	public static void password()
	{
		BaseClass.sentdata(BaseClass.findElementid(password), "Karthik12");
	}
	public static void loginButton()
	{
		BaseClass.clickdata(BaseClass.findElementid(login));
	}
}
