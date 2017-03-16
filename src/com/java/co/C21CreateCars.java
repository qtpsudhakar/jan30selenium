package com.java.co;

public class C21CreateCars {

	public static void main(String[] args) {
		
		C20TataCars.start();
		C20TataCars car2 = new C20TataCars();
		car2.start();
		car2.brand="abc";
		System.out.println(car2.brand);

	}

}
