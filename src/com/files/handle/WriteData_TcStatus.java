package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteData_TcStatus {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		updateTestResult("TC_OHRM_0002", "PASS");
	}

	public static void updateTestResult(String tcid, String tesResult)
			throws FileNotFoundException, IOException {
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\Ohrm_Old.xls";

		// open work book
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(flPath));
		// get sheet
		HSSFSheet sht = wb.getSheet("Sheet1");

		for (int r = 1; r <= sht.getLastRowNum(); r++) {
			if (sht.getRow(r).getCell(0).toString().equalsIgnoreCase(tcid)) {
				sht.getRow(r).createCell(5).setCellValue(tesResult);
				break;
			}
		}

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream(flPath);
		wb.write(fileOut);
		fileOut.close();

		wb.close();
	}
}
