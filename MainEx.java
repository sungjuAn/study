package com.naver;

public class MainEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		long Start = System.currentTimeMillis();
		t1.me1();
		long end = System.currentTimeMillis();
		System.out.println(end-Start);
		Start = System.currentTimeMillis();
		t1.me2();
		end = System.currentTimeMillis();
		System.out.println(end-Start);
		
	
	}
}
