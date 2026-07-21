package com.sist.main;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
	private int mno;
	private String name, address, phone;
	
	public void print() {
		System.out.println("회원번호: "+mno);
		System.out.println("이름: "+name);
		System.out.println("주소: "+address);
		System.out.println("전화: "+phone);
	}
	
	public void init() {
		
	}
	
	public void destroy() {
		
	}
}
