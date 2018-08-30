package com.novellius.dao;

import java.util.List;
import com.novellius.pojo.Administrators;

public interface AdministratorsDao {
	
	public boolean save(Administrators administrators);
	public List<Administrators> findAll();

}
