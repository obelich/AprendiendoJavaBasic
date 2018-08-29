package com.novellius.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.novellius.pojo.Administrators;

@Component("administratorsDao")
public class AdministratorsDaoImpl implements AdministratorsDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public boolean save(Administrators administrators) {
		// TODO Auto-generated method stub
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		paramMap.addValue("names", administrators.getNames());
		paramMap.addValue("role", administrators.getRole());
		paramMap.addValue("created_at", administrators.getCreated_at());
		
		return jdbcTemplate.update("insert into Administrators (names, role, created_at) values (:names, :role, :created_at)", paramMap) == 1;
	}

}
