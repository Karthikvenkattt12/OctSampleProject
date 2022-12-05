package com.app.exe;

import com.app.pageexe.LastpageExe;

public class Exe extends LastpageExe {
	
	public static void main(String[] args) throws InterruptedException {
		browserlaunch();
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
		Thread.sleep(5000);
		OrderID();
			}
}
