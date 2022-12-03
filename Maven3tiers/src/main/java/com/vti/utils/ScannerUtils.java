package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner sc = new Scanner(System.in);
	public ScannerUtils() {
		sc = new Scanner(System.in);
	}
	public static int inputInt(String errorMessage) throws Exception {
		
//		System.out.println("Nhập số nguyến: ");
		String resultString = sc.nextLine();
		try {
			int result = Integer.parseInt(resultString);
			return result;
		} catch (Exception e) {
			throw new Exception(errorMessage);
		}
	}
	
	public static float inputFloat(String errorMessage) throws Exception {
		
//		System.out.println("Nhập: ");
		String resultString = sc.nextLine();
		try {
			float result = Float.parseFloat(resultString);
			return result;
		} catch (Exception e) {
			throw new Exception(errorMessage);
		}
	}
	
	public static double inputDouble(String errorMessage) throws Exception {
		
//		System.out.println("Nhập:  ");
		String resultString = sc.nextLine();
		try {
			double result = Double.parseDouble(resultString);
			return result;
		} catch (Exception e) {
			throw new Exception(errorMessage);
		}
	}
	
	public static String inputString() {
//		System.out.println("Nhập: ");
		String result = sc.nextLine();
		return result;
	}
//	public static int inputAge(String errorMessage) throws InvalidAgeInputException{
//		while(true) {
//			System.out.println("Nhập tuổi của bạn: ");
//			String ageString = sc.nextLine();
//			try {
//				int age = Integer.parseInt(ageString);
//				if(age>0) {
//					return age;
//				}
//				else throw new  InvalidAgeInputException("The age must be greater than 0");
//			} catch (NumberFormatException e) {
//				System.out.println(errorMessage);
//			}
//		}
//	}
}

