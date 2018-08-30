package com.novellius;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.novellius.dao.AdministratorDao;
import com.novellius.pojo.Administrators;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");

		AdministratorDao administratorsDao = (AdministratorDao) applicationContext.getBean("administratorsDao");
		Timestamp ts = new Timestamp(new Date().getTime());
		Administrators administrator = new Administrators();
		administrator.setRole("Atencion a clientes");
		administrator.setNames("Oscar");
		administrator.setCreated_at(ts);

		try {
			System.out.println(administratorsDao.findById(1));
//			if (administratorsDao.save(administrator)) {
//				System.out.println("Si se guardo");
//				
//				List<Administrators> admins = administratorsDao.findAll();
//				
//				for (Administrators admin : admins) {
//					System.out.println(admin);
//					
//				}
//			}

		} catch (CannotGetJdbcConnectionException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		} catch (DataAccessException ex) {
			// TODO: handle exception
			ex.printStackTrace();

		}

		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
