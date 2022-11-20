package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Student2;
import com.vti.ultis.FileManager2;
import com.vti.ultis.IOManager;
import com.vti.ultis.IOStream;

public class Ex5 {
	public static void Question1() throws Exception {
		Student2 student1 = new Student2(1,"Nguyen van A");
		Student2 student2 = new Student2(2,"Nguyen van B");
		Student2 student3 = new Student2(3,"Nguyen van C");
		Student2 students[] = {student1,student2,student3};
		
//		IOManager.writeObject(student1.toString(), "E:\\JAVA Doccument", "example.txt");
//		
////		IOManager.writeObject(students, "E:\\JAVA Doccument\\example.txt");
//		
//		System.out.println(IOManager.readFile("E:\\JAVA Doccument\\example.txt"));
		
		if(!FileManager2.fileIsExists("E:\\JAVA Doccument\\example.txt")) 
			FileManager2.createNewFile("E:\\JAVA Doccument\\example.txt");
//		
//		for(Student2 student:students) {
//			System.out.println(student.toString());
//			IOManager.writeFile("E:\\JAVA Doccument\\example.txt", true, student.toString() + "\n");
//
//		}
		
		System.out.println(IOManager.readFile("E:\\JAVA Doccument\\example.txt"));
		
		
	}
	
	public static void Question2() throws Exception {
		if(!FileManager2.fileIsExists("E:\\JAVA Doccument\\accountInfo.txt")) 
			FileManager2.createNewFile("E:\\JAVA Doccument\\accountInfo.txt");
		
		Account account1 = new Account();
		account1.dangKy();
		System.out.println(account1.toString());
	}
}
