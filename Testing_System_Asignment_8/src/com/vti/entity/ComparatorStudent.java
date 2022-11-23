package com.vti.entity;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		if(stu1 == null || stu2 == null)
			return -1;
		
		
//		if(stu1.id < stu2.id) {
//			return -1;
//		}else if(stu1.id > stu2.id) {
//			return 1;
//		}
		
		stu1.compareTo(stu2);
		
		if(stu1.getNgaySinh().isBefore(stu2.getNgaySinh())) {
			return -1;
		}else if(stu1.getNgaySinh().isAfter(stu2.getNgaySinh())) {
			return 1;
		}
		
		if(stu1.getDiem() < stu2.getDiem()) {
			return -1;
		}else if(stu1.getDiem() > stu2.getDiem()) {
			return 1;
		}
		
		return 0;
	}

}
