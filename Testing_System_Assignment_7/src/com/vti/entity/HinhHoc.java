package com.vti.entity;

public class HinhHoc {
	private static int count = 0;
	
	public HinhHoc() throws HinhHocException {
		if(count>=5) {
			throw new HinhHocException("Số lượng hình tối đa: "+Configs.getSoluong());
		}else {
			count++;
		}
		
	}
}