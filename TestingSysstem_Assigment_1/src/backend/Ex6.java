package backend;

import entity.Employee;
import entity.Manager;
import entity.VietnamesePhone;

public class Ex6 {
public static void main(String[] args) {
	
}
	public void Question1() {
		VietnamesePhone vnPhone1 = new VietnamesePhone();
		vnPhone1.insertContact("theVinh","0961972786");
		VietnamesePhone vnPhone2 = new VietnamesePhone();
		vnPhone2.insertContact("theVinh2", "0966276462");
		VietnamesePhone vnPhone3 = new VietnamesePhone();
		vnPhone3.insertContact("theVinh3", "0966276462");
		VietnamesePhone[] vnPhone = {vnPhone1,vnPhone2,vnPhone3};
		for(VietnamesePhone phone:vnPhone) {
			phone.updateContact("theVinh2", "0961972786");
			phone.searchContact("theVinh2");
		}
		System.out.println(vnPhone3.toString());
	}
	public void Question2() {
		Employee employee1 = new Employee();
		employee1.setName("Nam");
		employee1.setSalaryRatio(30);
		Manager manager1 = new Manager();
		manager1.setName("Đạt");
		manager1.setSalaryRatio(30);
		employee1.displayInfo();
		manager1.displayInfo();
	}
}
