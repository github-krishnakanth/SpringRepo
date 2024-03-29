package com.annon.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annon/autowire/auto-annon-beans.xml");
		Robot robot = context.getBean("robot", Robot.class);

		System.out.println(robot);
	}
}
