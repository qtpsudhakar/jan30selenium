package com.java.oops;

public interface C26IntTataMotors {

	// we will create method definitions in interface
	// we will not developing any code in interface
	// a method without implementation will become abstract method
	// Until java 7 we can't add implementation code to interface
	// from java 7 they gave feature to add implementation code as well

	// you cannot create instance for interface
	// You can create instance for implemented class and take it as interface
	// name
	// implemented class can have any number of methods but must have
	// implemented the methods of interface
	public void addAirBags();

	public void addGPS();

	public void addRearCamera();

}
