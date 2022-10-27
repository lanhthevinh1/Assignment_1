package entity;

public class Waiter extends User{

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return this.getSalaryRatio() * 220;
	}

}
