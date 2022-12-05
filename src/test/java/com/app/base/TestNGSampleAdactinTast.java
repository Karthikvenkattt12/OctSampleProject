package com.app.base;

	import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


	public class TestNGSampleAdactinTast extends BaseClass {

		@BeforeSuite
		public void BeforeSuite()
		{
			System.out.println("Test Execution Started");
		}
		
			
		@BeforeClass
		public void BeforeClass()
		{
			BaseClass.browserlaunch();
		}

		@BeforeMethod
		public void BeforeMethod()
		{
			BaseClass.link("https://adactinhotelapp.com/");
			BaseClass.implicitWait();
		}
		
		@Test
		public void ValidCred()
		{
			BaseClass.sentdata(BaseClass.findElementname("username"),"kv1054330");
			BaseClass.sentdata(BaseClass.findElementname("password"),"Karthik12");
			BaseClass.clickdata(BaseClass.findElementid("login"));
		}
		
		@Test
		public void InvalidCred()
		{
			BaseClass.sentdata(BaseClass.findElementname("username"),"kv1054330");
			BaseClass.sentdata(BaseClass.findElementname("password"), "Karthik13");
			BaseClass.clickdata(BaseClass.findElementid("login"));
		}
	
		
		@AfterMethod
		public void AfterMethod() throws IOException
		{
			BaseClass.Screenshot();
		}
		
		@AfterClass
		public void AfterClass()
		{
			BaseClass.CloseBrowser();
		}
		
				
		@AfterSuite
		public void AfterSuite()
		{
			System.out.println("Test Execution Completed");
		}
		


}
