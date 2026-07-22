package com.sist.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		Member m=(Member)app.getBean("member");
		System.out.println(m);
		Student s=(Student)app.getBean("student");
		System.out.println(s);
	}
}
    