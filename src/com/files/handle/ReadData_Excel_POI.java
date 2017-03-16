package com.files.handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData_Excel_POI {

	public static void main(String[] args) throws IOException {
		/*
		 * jxl : only for xls apache poi : xls, xlsx, word, outlook, ppt 
		 * hssf related classes: xls files 
		 * Xssf related classes: xlsx files
		 */

		/*
		 * goto https://poi.apache.org/download.html
		 * 
		 * download poi-bin-3.15-20160924.zip 
		 * 
		 * extract poi-bin-3.15-20160924.zip Add all jar files from all folders to build path
		 */
		
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\Ohrm_Old.xls";
		
		// open work book
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(flPath));				
		// get sheet
		HSSFSheet sht = wb.getSheet("Sheet1");		
		
		// get row count
		int rc = sht.getLastRowNum();
		
		for (int r = 1; r <= rc; r++) {
			int cc = sht.getRow(r).getLastCellNum();
			if (sht.getRow(r).getCell(0).toString()
					.equalsIgnoreCase("TC_OHRM_0002")) {

				for (int c = 0; c < cc; c++) {
					System.out.println(sht.getRow(r).getCell(c).toString());
				}
				break;
			}
		}

		wb.close();
	}

	public static HashMap<String, String> readDataFromTC(String tcID) throws FileNotFoundException, IOException{
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\Ohrm_Old.xls";
		
		// open work book
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(flPath));				
		// get sheet
		HSSFSheet sht = wb.getSheet("Sheet1");		
		
		// get row count
		int rc = sht.getLastRowNum();
		
		HashMap<String, String> tcData = new HashMap<String, String>();
		for (int r = 1; r <= rc; r++) {
			int cc = sht.getRow(r).getLastCellNum();
			if (sht.getRow(r).getCell(0).toString()
					.equalsIgnoreCase(tcID)) {

				for (int c = 0; c < cc; c++) {
					String kName = sht.getRow(0).getCell(c).toString();
					String kVal = sht.getRow(r).getCell(c).toString();
					tcData.put(kName, kVal);
				}
				break;
			}
		}
		wb.close();
		return tcData;
	}
}




