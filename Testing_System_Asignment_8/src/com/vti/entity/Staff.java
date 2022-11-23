package com.vti.entity;

public class Staff<K, V> extends MyMap<K,V> {
	public Staff() {
		super();
	}
	
	public Staff(K key, V value) {
		super(key, value);
	}
	
	public K getId() {
		return super.getKey();
	}
	
	public V getName() {
		return super.getValue();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
