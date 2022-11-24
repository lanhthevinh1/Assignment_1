package com.vti.backend;

import com.vti.entity.CPU;
import com.vti.entity.CPU.Processor;
import com.vti.entity.CPU.Ram;
import com.vti.entity.Car;
import com.vti.entity.NgayThangNam;
import com.vti.entity.NgayThangNam.GioPhutGIay;
import com.vti.entity.OuterClass;
import com.vti.entity.Car.Engine;
import com.vti.entity.OuterClass.InnerClass;

public class Ex3 {
	public void Question1() {
		CPU cpu = new CPU();
		Processor processor = cpu.new Processor();
		Ram ram = cpu.new Ram();
		
		System.out.println(processor.getCache());
		System.out.println(ram.getClockSpeed());
	}
	
	public void Question2() {
		Car car = new Car("Mazda", "8WD");
		Engine engine = car.new Engine("Crysler");
		System.out.println(engine.toString());
	}
	
	public void Question3() {
		OuterClass outerClass = new OuterClass();
		outerClass.show();
		
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.show();
	}
	
	public void Question4() {
		NgayThangNam date = new NgayThangNam();
		date.ngay = 31;
		date.thang = 10;
		date.nam = 2017;
		
		GioPhutGIay time = date.new GioPhutGIay();
		time.gio = 10;
		time.phut = 15;
		time.giay = 30;
		
		time.xuatThongTin();
	}
}
