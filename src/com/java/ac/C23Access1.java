package com.java.ac;

public class C23Access1 {

	//public members can be accessed from anywhere
	public String pb = "iam public";
	
	//protected members can be accessed from same package and through subclasses of other packages 
	protected String pr = "iam protected";
	protected static String pr1 = "iam static and protected"; 
	//default memebers can be accessed from same package
	String df = "iam default";
	//private memebers can be accessed from same class
	private String pv = " iam private";
	
	public void accMod(){
		System.out.println(pv);
	}
}







