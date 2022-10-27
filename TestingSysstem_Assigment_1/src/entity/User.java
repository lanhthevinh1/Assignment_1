package entity;

public abstract class User {
	private String name;
	private double salaryRatio;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaryRatio() {
		return salaryRatio;
	}
	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}
	public abstract double calculatePay();
	public void displayInfo() {
		System.out.println("Salary ratio: "+this.calculatePay());
		System.out.println("Name: "+ this.getName());
	}
	
}
