package com.app.pageexe;

import com.app.base.BaseClass;

public class PaymentPageExe extends ConfirmationPageExe {

	public static void firstName()
	{
		BaseClass.sentdata(BaseClass.findElementname(firstName),"Karthik");
	}
	public static void lastName()
	{
		BaseClass.sentdata(BaseClass.findElementname(lastName), "Venkateshan");
	}
	public static void address()
	{
		BaseClass.sentdata(BaseClass.findElementname(address), "DivyaVarshini Apartments");
	}
	public static void ccdetails()
	{
		BaseClass.sentdata(BaseClass.findElementname(creditcard),"1234567890123456");
	}
	public static void cardtype()
	{
		BaseClass.selectbyindex(BaseClass.findElementname(creditcardtype), 3);
	}
	public static void expDate()
	{
		BaseClass.selectbyindex(BaseClass.findElementname(expirydate), 12);
	}
	public static void expYear()
	{
		BaseClass.selectbyvalue(BaseClass.findElementname(expiryyear),"2022");
	}
	public static void cvv()
	{
		BaseClass.sentdata(BaseClass.findElementname(cvv), "1234");
	}
	public static void booking()
	{
		BaseClass.clickdata(BaseClass.findElementname(booking));
	}
	
}
