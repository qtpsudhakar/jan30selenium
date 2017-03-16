package com.files.handle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData_Txt {

	public static void main(String[] args) throws IOException {
		// filereader
		// bufferedreader
		// filewriter
		// bufferedwriter
		String flPath = "C:\\Users\\envy\\Desktop\\Selenium_Jan30_Notes\\Data\\Demo3.txt";

		//true will append the data to existing file
		//if you remove true it will override data each time
		FileWriter fw = new FileWriter(flPath,true);

		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("asdf");
		bw.newLine();
		bw.newLine();
		bw.write("qwerty");
		
		bw.close();
		fw.close();
	}

}







