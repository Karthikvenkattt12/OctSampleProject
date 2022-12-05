package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSample {
	public void sample()

	{
		
	try {
		File f = new File("C:\\Users\\Administrator\\Documents\\Java Documents\\Project\\Oct_Sample2\\src\\test\\resources\\Testdata\\TestSource.xlsx");
		FileInputStream fis = new FileInputStream(f);
		try {
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet("Sheet1");
			Row ro = sh.getRow(0);
			Cell ce = ro.getCell(1);
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
		
	}	
	}

}
