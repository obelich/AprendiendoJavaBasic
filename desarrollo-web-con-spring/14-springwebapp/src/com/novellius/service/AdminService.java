package com.novellius.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novellius.dao.AdministratorDao;
import com.novellius.pojo.Administrator;

@Service
public class AdminService {
	
	@Autowired
	private AdministratorDao administratorDao;
	
	public boolean save(Administrator administrator) {
		
		Timestamp ts = new Timestamp(new Date().getTime());
		administrator.setCreated_at(ts);
		
		
		return administratorDao.save(administrator);
	}
	
	public List<Administrator> findAll(){
		return administratorDao.findAll();
	}

	public Administrator findById(int id) {
		// TODO Auto-generated method stub
		return administratorDao.findById(id);
	}

	public boolean saveOrUpdate(Administrator administrator) {
		// TODO Auto-generated method stub
		if (administrator.getId() == 0) {
			return administratorDao.save(administrator);
		} else {
			return administratorDao.update(administrator);
		}
		
	}

}
