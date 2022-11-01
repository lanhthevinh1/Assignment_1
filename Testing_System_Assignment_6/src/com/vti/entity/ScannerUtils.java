package com.vti.entity;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner sc;
	public ScannerUtils() {
		sc = new Scanner(System.in);
	}
	public int inputInt(String errorMessage) throws Exception {
		
//		System.out.println("Nhập số nguyến: ");
		String resultString = sc.nextLine();
		try {
			int result = Integer.parseInt(resultString);
			return result;
		} catch (Exception e) {
			throw new Exception(errorMessage);
		}
	}
	
	public float inputFloat(String errorMessage) throws Exception {
		
//		System.out.println("Nhập: ");
		String resultString = sc.nextLine();
		try {
			float result = Float.parseFloat(resultString);
			return result;
		} catch (Exception e) {
			throw new Exception(errorMessage);
		}
	}
	
	public double inputDouble(String errorMessage) throws Exception {
		
//		System.out.println("Nhập:  ");
		String resultString = sc.nextLine();
		try {
			double result = Double.parseDouble(resultString);
			return result;
		} catch (Exception e) {
			throw new Exception(errorMessage);
		}
	}
	
	public String inputString() {
//		System.out.println("Nhập: ");
		String result = sc.nextLine();
		return result;
	}
	public int inputAge(String errorMessage) throws InvalidAgeInputException{
		while(true) {
			System.out.println("Nhập tuổi của bạn: ");
			String ageString = sc.nextLine();
			try {
				int age = Integer.parseInt(ageString);
				if(age>0) {
					return age;
				}
				else throw new  InvalidAgeInputException("The age must be greater than 0");
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}
}
