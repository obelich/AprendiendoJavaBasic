package com.novellius.dao;

import java.util.List;
import com.novellius.pojo.Administrators;

public interface AdministratorDao {
	
	public boolean save(Administrators administrators);
	public List<Administrators> findAll();
	public Administrators findById(int id);
	public List<Administrators> findByNames(String names);
	

}
