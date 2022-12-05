package com.app.pageexe;

import com.app.base.BaseClass;

public class LastpageExe extends PaymentPageExe {

	public static void OrderID() 
	{
//	BaseClass.jsGetAttribute(BaseClass.findElementid(getAttribute), "value");
//		driver.quit();
//	
		BaseClass.getAttribute(BaseClass.findElementid(getAttribute), "value");
		driver.quit();
	}
}
