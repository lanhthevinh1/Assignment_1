package com.vti.backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.management.Query;

import com.vti.entity.Student;

public class Ex1 {
	public static void Question1() {
//		Student student1 = new Student("Lành thế vinh");
//		Student student2 = new Student("Lành thế vinh");
//		Student student3 = new Student("Lành thế vinh");
//		Student student4 = new Student("Lành thế vinh");
//		Student student5 = new Student("Lành thế vinh");
//		Student student6 = new Student("Lành thế vinh");
		
		
//		System.out.println(student1.getId()+" "+student2.getId());
//		System.out.println(" "+student3.getId());
	
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Lành Thế Vinh"));
		students.add(new Student("Lành Thế Vinh"));
		students.add(new Student("Lành Thế Nam"));
		students.add(new Student("Lành Thế Vinh"));
		students.add(0, new Student("Lành Thế Vinh"));
		
		Collections.sort(students);
		
		List<Student> studentsTrungTen = students.stream()
										.filter(student -> student.getName().equals("Lành Thế Vinh"))
										.collect(Collectors.toList());
		
		 
		List<Student> studentsCopies = new ArrayList<Student>();
//		System.out.println(students.size());
//		System.out.println(students.get(3).toString());
		for(Student student:studentsTrungTen) {
			studentsCopies.add(student);
			if(student.getId() == 2) {
				student.setName(null);
			}
			if(student.getId()==4)
				students.remove(student);
		}
		
		for(Student student:students) {
			System.out.println(student.toString());
		}
		
		for(Student student:studentsCopies) {
			System.out.println(student.toString());
		}
		
		System.out.println("----------------------");
		Student id3 = students.stream()
				  .filter(student -> student.getId() == 3)
				  .findAny()
				  .orElse(null);
		System.out.println(id3.toString());
//		System.out.println(students.get(students.size()-1));
	}
	
	public static void Question2() {
		Stack<String> studentsStack = new Stack<String>();
		
		studentsStack.add("Nguyễn Văn Nam");
		studentsStack.add("Nguyễn Văn Huyên");
		studentsStack.add("Trần Văn Nam");
		studentsStack.add("Nguyễn Văn A");
		
		int n = (studentsStack.size());
		
//		System.out.println(studentsStack.pop());
		for(int i = 0;i<n;i++) {
			System.out.println(i);
			System.out.println(studentsStack.pop());
		}
		
		Queue<String> studentsQueue = new LinkedList<String>();
		
		studentsQueue.add("Nguyễn Văn Nam");
		studentsQueue.add("Nguyễn Văn Huyên");
		studentsQueue.add("Trần Văn Nam");
		studentsQueue.add("Nguyễn Văn A");
		
		System.out.println(studentsQueue.remove());
	}
	
	public static void Question3() {
		Set<Student> studentSet = new HashSet();
		
		studentSet.add(new Student("Nguyễn Văn Nam"));
		studentSet.add(new Student("Nguyễn Văn A"));
		studentSet.add(new Student("Nguyễn Văn B"));
		studentSet.add(new Student("Nguyễn Văn C"));
		studentSet.add(new Student("Nguyễn Văn D"));
		studentSet.add(new Student("Nguyễn Văn E"));
		
//		for(Student student:studentSet) {
//			System.out.println(student.toString());
//		}
		
		System.out.println(studentSet.size());
		
		Iterator<Student> iterator = studentSet.iterator();
		
		for(int i = 0;i<studentSet.size();i++) {
			if(i == 3) System.out.println(iterator.next());
			else iterator.next();
		}
		
//		System.out.println(studentSet.);
	}
	
	public static void Question4() {
		Set<Student> studentSet = new HashSet();
		studentSet.add(new Student("Nguyễn Văn Nam"));
		studentSet.add(new Student("Nguyễn Văn A"));
		studentSet.add(new Student("Nguyễn Văn A"));
		studentSet.add(new Student("Nguyễn Văn A"));
		studentSet.add(new Student("Nguyễn Văn D"));
		studentSet.add(new Student("Nguyễn Văn E"));
		
		Set<Student> studentSetNonSameName = new TreeSet();
		studentSetNonSameName.add(studentSet.iterator().next());
		for(Student student:studentSet) {
			System.out.println(student);
			boolean check = true;
			for(Student studentNon:studentSetNonSameName)  {
				if(student.getName().equals(studentNon.getName()))
					check = false;
			}
			if(check) studentSetNonSameName.add(student);
		}
		System.out.println("---------------------------------------------------");
		System.out.println(studentSetNonSameName.size());
		for(Student studentNon:studentSetNonSameName)  {
			System.out.println(studentNon);
		}
		
		
	}
}
