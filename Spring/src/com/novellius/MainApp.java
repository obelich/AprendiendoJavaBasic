package com.novellius;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.novellius.dao.AdministratorsDao;
import com.novellius.pojo.Administrators;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		
		AdministratorsDao administratorsDao = (AdministratorsDao) applicationContext.getBean("administratorsDao");
		Timestamp ts = new Timestamp(new Date().getTime());
		Administrators administrator = new Administrators();
		administrator.setRole("Gerente");
		administrator.setNames("Miguel Amezcua");
		administrator.setCreated_at(ts);
//		AdministratorsDao administratorsDao = applicationContext.getBean("administratorsDao");
		
		if (administratorsDao.save(administrator) ) {
			System.out.println("Si se guardo");
		} else {
			System.out.println("No se guardo");
		}
		
		((ClassPathXmlApplicationContext  )applicationContext).close();
	}

}
