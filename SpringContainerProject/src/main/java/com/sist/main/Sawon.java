package com.sist.main;

import lombok.Data;

@Data
public class Sawon {
	private int sabun, pay;
	private String name, dept, job; 
	
	public void print() {
		System.out.println(sabun);
		System.out.println(name);
		System.out.println(dept);
		System.out.println(job);
		System.out.println(pay);
	}
}
