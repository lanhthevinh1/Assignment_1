package com.vti.entity;

public class MyNumber<N extends Number> {
	private N a;
	private N b;
	public MyNumber() {}
	public MyNumber(N a, N b) {
		this.a = a;
		this.b = b;
	}
	public N getA() {
		return a;
	}
	public void setA(N a) {
		this.a = a;
	}
	public N getB() {
		return b;
	}
	public void setB(N b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "MyNumber " + a ;
	}
	
	public <N extends Comparable<N>> N timMax(N x,N y){
		N max = x;
		if(y.compareTo(x)> 0) {
			max = y;
		}
		return max;
	}
	
}
