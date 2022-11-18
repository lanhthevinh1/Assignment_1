package com.vti.frontend;

import com.vti.backend.Ex5;
import com.vti.ultis.IOManager;

public class Program5 {
	public static void main(String[] args) throws Exception {
//		Ex5.Question1();
//		Ex5.Question2();
		System.out.println(IOManager.readFile("E:\\JAVA Doccument\\accountInfo.txt"));
	}
}
