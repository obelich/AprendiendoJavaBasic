package com.novellius.dao;

import java.util.List;
import com.novellius.pojo.Administrator;

public interface AdministratorDao {
	
	public boolean save(Administrator administrators);
	public List<Administrator> findAll();
	public Administrator findById(int id);
	public List<Administrator> findByNames(String names);
	public boolean update(Administrator administrator);
	public boolean delete(int id);
	public int[] saveAll(List<Administrator> administrators);
	

}