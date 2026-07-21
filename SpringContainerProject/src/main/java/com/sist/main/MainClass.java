package com.sist.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//ApplicationContext app=new ClassPathXmlApplicationContext("application.xml");
		
//		Sawon sa=(Sawon)app.getBean("sa");
//		sa.print();
//		System.out.println("--------");
//		Sawon sa1=(Sawon)app.getBean("sa1");
//		sa1.print();
//		System.out.println("--------");
//		Sawon sa2=(Sawon)app.getBean("sa2");
//		sa2.print();
//		System.out.println("--------");
//		Sawon sa3=new Sawon();
//		sa3.print();
//		System.out.println("--------");
		
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		
		Member m1=(Member)app.getBean("mem1");
		m1.print();
//		System.out.println("--------");
//		Member m2=(Member)app.getBean("mem2");
//		m2.print();
//		System.out.println("--------");
//		Member m3=app.getBean("mem3", Member.class);
//		m3.print();
//		System.out.println("--------");
//		Member m4=app.getBean("mem4", Member.class);
//		m4.print();
	}
}
