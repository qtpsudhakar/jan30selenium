package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C20RegularExpressionsForVerification_Simple {

	public static void main(String[] args) {

		// https://docs.oracle.com/javase/tutorial/essential/regex/
		// pan card standard: 5c4n1c
		// . : anything in place of .
		// ab. :ab1,abc,

		// * : preceding character/number any number of times
		// ab*: a,ab,abbbbbbbb

		// .*: anything
		// ab.* :absklkfksjflkjslje

		// ab[0-9] : ab0,ab1,ab2....ab9
		// ab[^0-9]#ab0,ab1,ab2....ab9
		// [a-z]{2} : aa,ab,az,ss,dd,xx, : 2 times
		// [a-z]{2,} : aa,ab,az,ss,dd,xx,dasdasd,adas : minimum 2 times
		// [a-z]{2,4) : an,zoo
		// () : grouping regular expressions
		// | : or clause

		// \ : to escape regular expression
		// selenium.com : selenium\.com

		// PAN : regular expression for pan card : ABCDE1234Z

		// [A-Z]{5}[0-9]{4}[A-Z]
		
		//regular expression for time
		//([0-1][0-9]|2[0-3]):[0-5][0-9]
		//([0-2][0-3]|[0-1][4-9])
		
		//0[0-9]|1[0-2]
		
		
		// where to search
		// String content = "Hello how are you..hello ";

		String content = "ABCDE1211A";

		// regular expression
		String patternString = "[A-Z]{5}[0-9]{4}[A-Z]";
		
		if (Pattern.matches(patternString, content)) {
			System.out.println("Correct Pan number");
		} else {
			System.out.println("incorrect Pan number");
		}
	}

}
