/**
 * 
 */
package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author akalgutk
 *
 */
public class Main {

	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/demo/beans.xml");
		Service service=(Service)context.getBean("service");
		service.service();
	}

}
