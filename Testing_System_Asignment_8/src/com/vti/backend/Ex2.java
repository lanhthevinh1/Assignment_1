package com.vti.backend;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.vti.entity.ComparatorStudent;
import com.vti.entity.Student;

public class Ex2 {
	public void Question1_2() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Lành Thế A",LocalDate.of(2019, 3, 12),4.2));
		students.add(new Student(1,"Lành Thế A",LocalDate.of(2019, 3, 12),5));
		students.add(new Student(1,"Lành Thế A",LocalDate.of(2019, 3, 12),2.2));
		students.add(new Student(1,"Lành Thế A",LocalDate.of(2019, 3, 12),7.2));
		students.add(new Student(1,"Lành Thế A",LocalDate.of(2019, 3, 12),1.2));
		Collections.sort(students, new ComparatorStudent());
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
}
