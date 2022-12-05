package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Users\\Administrator\\eclipse-workspace\\Oct_Sample2\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void link(String url) {
		driver.navigate().to(url);
	}

	public static void sentdata(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickdata(WebElement element) {
		element.click();
	}
	public static void cleardata(WebElement element) {
		element.clear();
	}
	

	public static void selectbyvalue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static void selectbyindex(WebElement element, int data) {
		Select s = new Select(element);
		s.selectByIndex(data);
	}
	
	public static  void handleTheWindow()
	{
	String Parentwindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for(String s:childwindow)
	{
		if(!Parentwindow.equals(s))
			driver.switchTo().window(s);
	}
	}
	// reusable methods for findelement
	public static WebElement findElementid(String id) {
		return driver.findElement(By.id(id));	
	}
	
	public static WebElement findElementxpath(String path) {
		return driver.findElement(By.xpath(path));	
	}
	
	public static WebElement findElementname(String name) {
		return driver.findElement(By.name(name));	
	}
	
	// Abstract class
	public static WebElement findElementBy(By by) {
		return driver.findElement(by);
		}
	public static void getAttribute(WebElement element, String data) 
	{
		String attrvalue = element.getAttribute(data);
		System.out.println(attrvalue);
	}
		public static void Screenshot () throws IOException
	{
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		File source = scrnshot.getScreenshotAs(OutputType.FILE); //image
		Date d = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("ddMMyyyyhhssmm");
		String date = sdf.format(d);
		File destination = new File("F:\\Users\\Administrator\\eclipse-workspace\\Oct_Sample2\\Screenshot\\TestNGProject'"+date+"'.jpg"); //space 
		FileHandler.copy(source, destination);
		
	}
		public static void CloseBrowser()
		{
			driver.close();
		}
		
		public static void implicitWait()
		{
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		
		public static void excelRead(int a , int b)

		{
			
		try {
			File f = new File("C:\\Users\\Administrator\\Documents\\Java Documents\\Project\\Oct_Sample2\\src\\test\\resources\\Testdata\\TestSource.xlsx");
			FileInputStream fis = new FileInputStream(f);
			try {
				Workbook wb = new XSSFWorkbook(fis);
				Sheet sh = wb.getSheet("Sheet1");
				Row ro = sh.getRow(a);
				Cell ce = ro.getCell(b);
				int celltype = ce.getCellType();
				if(celltype==1)
				{
					String value = ce.getStringCellValue();
				}
				else if(celltype==0) 
				{
					if (DateUtil.isCellDateFormatted(ce))
					{
						Date datevalue = ce.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String value = sdf.format(datevalue);
					}
					else
					{
						double numericvalue = ce.getNumericCellValue();
						long number = (long)numericvalue;
						String value = String.valueOf(number);
					}
				}
			} catch (IOException e) {
				
			}
			
		} catch (FileNotFoundException e) {
			
		}}	
		
		
		public static void jsGetAttribute(WebElement element, String attrName) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String value = (String) js.executeScript("return arguments[0].getAttribute('" + attrName + "')", element);
			System.out.println(value);

}}
	
	
	
	
	
