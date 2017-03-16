package com.files.handle;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadData_Excel_JXL {

	public static void main(String[] args) throws BiffException, IOException {
		/*
		 * jxl : only for xls apache poi : xls, xlsx, word, outlook, ppt hssf
		 * related classes: xls files Xssf related classes: xlsx files
		 */

		/*
		 * download jxl jar from
		 * https://sourceforge.net/projects/jexcelapi/files/jexcelapi/2.6.12/
		 * extract jexcelapi_2_6_12.zipAdd jxl.jar file to build path
		 */
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\Ohrm_Old.xls";
		// open work book
		Workbook wb = Workbook.getWorkbook(new File(flPath));
		// get sheet
		Sheet sht = wb.getSheet("Sheet1");
		// get row count
		int rc = sht.getRows();
		// get column count
		int cc = sht.getColumns();

		for (int r = 0; r < rc; r++) {

			if (sht.getCell(0, r).getContents()
					.equalsIgnoreCase("TC_OHRM_0002")) {
				for (int c = 0; c < cc; c++) {
					System.out.println(sht.getCell(c, r).getContents());
				}
			break;
			}

		}

		wb.close();
	}

}
