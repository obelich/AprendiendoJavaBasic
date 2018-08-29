package com.novellius;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.novellius.pojo.Administrators;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		

		
		((ClassPathXmlApplicationContext  )applicationContext).close();
	}

}
