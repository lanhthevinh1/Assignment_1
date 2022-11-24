package com.vti.entity;

public class MyMath<T extends Number> {
	private T a;
	private T b;
	public <T extends Number> T sum(T a, T b) {
		T sum = null ;
		
		if(a instanceof Double && b instanceof Double) {
			sum = (T) new Double(a.doubleValue() + b.doubleValue());
		}else if(a instanceof Long && b instanceof Long) {
			sum = (T) new Long(a.longValue() + b.longValue());
		}else if(a instanceof Integer && b instanceof Integer) {
			sum = (T) new Integer(a.intValue() + b.intValue());
		}else if(a instanceof Double && b instanceof Integer) {
			sum = (T) new Double(a.doubleValue() + b.intValue());
		}else if(a instanceof Long && b instanceof Integer) {
			sum = (T) new Double(a.longValue() + b.intValue());
		}else if(a instanceof Double && b instanceof Long) {
			sum = (T) new Double(a.doubleValue() + b.longValue());
		}
		
		return sum;
	}
	
	public <T extends Number> T sum(T a, T b, T c) {
		T sum = sum(sum(a,b),c);
		return sum;
	}
	public <T extends Number> T sum(T a, T b, T c,T d) {
		T sum = sum(sum(sum(a,b),c),d);
		return sum;
	} 
}
