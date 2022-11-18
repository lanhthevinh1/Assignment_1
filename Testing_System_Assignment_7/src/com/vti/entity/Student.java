package com.vti.entity;

public class Student {
	private static int count = 0;
	private int id;
	private String name;
	private static String college;
	private static int groupMoney = 0;
	public Student() {
		if(count>=7) {
			System.out.println("Số học sinh tối đa là 7");
			return;
		}else {
			count++;
		}
	}
	public Student(int id, String name) {
		if(count>=7) {
			System.out.println("Số học sinh tối đa là 7");
			return;
		}else {
			count++;
		}
		this.setId(id);
		this.name = name;
	}
	public final void setId(int id) {
		this.id = id;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCollege() {
		return college;
	}
	@Override
	public String toString() {
		return "id: "+ id + ", Name=" + name;
	}
	
	public final void study() {
		System.out.println(this.name + " đang học bài!");
	}
	public void takeGroupMoney(int amountOfMoney,String reasonTakeMoney) {
		if(groupMoney<amountOfMoney) {
			System.out.println("Số tiền quỹ lớp còn lại không đủ!");
		}else {
			this.groupMoney -=amountOfMoney;
		System.out.println("Tiền quỹ lớp còn lại là: "+groupMoney);
		System.out.println("Lý do: "+reasonTakeMoney);
		}
	}
	public void  addGroupMoney(int amountOfMoney) {
		this.groupMoney +=amountOfMoney;
		System.out.println("Tiền quỹ lớp còn lại là: " + groupMoney);
		
	}
	public int getCount() {
		return count;
	}
}
