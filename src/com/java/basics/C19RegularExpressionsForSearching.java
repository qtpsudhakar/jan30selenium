package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C19RegularExpressionsForSearching {

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

		
		// where to search		
		String content = "Hello how are you..hello ";

		// regular expression
		String patternString = "h..";

		// specify case sensitive condition
		Pattern pattern = Pattern.compile(patternString);

		// execute search
		Matcher matcher = pattern.matcher(content);

		while(matcher.find()){
			System.out.println(matcher.group(0));
		}

	}

}








