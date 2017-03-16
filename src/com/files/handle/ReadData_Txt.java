package com.files.handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Txt {

	public static void main(String[] args) throws IOException {
		// filereader
		// bufferedreader
		// filewriter
		// bufferedwriter
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\Demo2.txt";

		FileReader fr = new FileReader(flPath);
		BufferedReader br = new BufferedReader(fr);

		String lnStr = br.readLine();

		while (lnStr != null) {
			System.out.println(lnStr);
			lnStr = br.readLine();
		}

		br.close();
		fr.close();
	}

}
