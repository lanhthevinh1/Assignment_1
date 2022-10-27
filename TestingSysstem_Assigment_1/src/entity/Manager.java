package entity;

public class Manager extends User{

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return this.getSalaryRatio() * 520;
	}

}
