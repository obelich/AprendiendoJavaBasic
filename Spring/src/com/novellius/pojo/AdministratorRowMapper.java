package com.novellius.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdministratorRowMapper implements RowMapper<Administrators>{

	@Override
	public Administrators mapRow(ResultSet rs, int rowNum) throws SQLException {
		Administrators administrator = new Administrators();
		
		administrator.setId(rs.getInt("id"));
		administrator.setRole(rs.getString("role"));
		administrator.setNames(rs.getString("names"));
		administrator.setCreated_at(rs.getTimestamp("created_at"));
		
		return administrator;
	}

}
