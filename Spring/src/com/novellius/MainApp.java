package com.novellius;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import com.novellius.dao.AdministratorDao;
import com.novellius.pojo.Administrator;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");

		AdministratorDao administratorDao = (AdministratorDao) applicationContext.getBean("administratorsDao");
//		Timestamp ts = new Timestamp(new Date().getTime());
//		Administrators administrator = new Administrators();
//		administrator.setRole("Atencion a clientes");
//		administrator.setNames("Oscar");
//		administrator.setCreated_at(ts);

		try {
			Administrator administrator = administratorDao.findById(1);
			
			System.out.println(administrator);
			administrator.setRole("Sub-gerente");
			administrator.setNames("Gonzalez");
			
			if (administratorDao.update(administrator)) {
				System.out.println("Administrador actualizado");
				
			}
			
			if (administratorDao.delete(administrator.getId())) {
				System.out.println("Administrador eliminadoo");
			}


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
