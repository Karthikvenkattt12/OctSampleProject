package com.junit.exe;


import org.junit.BeforeClass;
import org.junit.Test;

import com.app.pageexe.LastpageExe;

public class SampleJunitExe extends LastpageExe {

	
	@BeforeClass
	public static void Browserlaunch()
	{
		browserlaunch();
	}
	
	@Test
	public void execute()
	{
		
		Website();
		username();
		password();
		loginButton();
		selectLocation();
		selectHotel();
		selectRoom();
		SelectNoofRooms();
		SelectCheckinDate();
		SelectCheckoutDate();
		SelectAdultperRoom();
		SelectChildperRoom();
		SearchButton();
		RadioButton();
		ContinueButton();
		firstName();
		lastName();
		address();
		ccdetails();
		cardtype();
		expDate();
		expYear();
		cvv();
		booking();
		
	}	
	
	
	
	
}
