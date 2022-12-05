package com.app.pageexe;

import com.app.base.BaseClass;

public class BookingPageExe extends LoginPageExe {

	public static void selectLocation()
	{
		BaseClass.selectbyindex(BaseClass.findElementname(location), 1);
	}
	public static void selectHotel()
	{
		BaseClass.selectbyvalue(BaseClass.findElementname(hotels),"Hotel Creek");
	}
	public static void selectRoom()
	{
		BaseClass.selectbyindex(BaseClass.findElementname(roomtype), 1);
	}
	public static void SelectNoofRooms()
	{
		BaseClass.selectbyindex(BaseClass.findElementid(noofrooms), 2);
	}
	public static void SelectCheckinDate()
	{
		BaseClass.cleardata(BaseClass.findElementname(checkindate));
		BaseClass.sentdata(BaseClass.findElementname(checkindate), "31/10/2022");
	}
	public static void SelectCheckoutDate()
	{
		BaseClass.cleardata(BaseClass.findElementname(checkoutdate));
		BaseClass.sentdata(BaseClass.findElementname(checkoutdate), "1/11/2022");
	}
	public static void SelectAdultperRoom()
	{
		BaseClass.selectbyindex(BaseClass.findElementid(adultsperroom), 3);
	}
	public static void SelectChildperRoom()
	{
		BaseClass.selectbyindex(BaseClass.findElementid(childperroom), 2);
	}
	public static void SearchButton()
	{
		BaseClass.clickdata(BaseClass.findElementname("Submit"));
	}
	
}



