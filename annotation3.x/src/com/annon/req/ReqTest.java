package com.annon.req;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/annon/req/req-annon-beans.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
