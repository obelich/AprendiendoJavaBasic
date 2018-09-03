package com.novellius.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdministratorRowMapper implements RowMapper<Administrator>{

	@Override
	public Administrator mapRow(ResultSet rs, int rowNum) throws SQLException {
		Administrator administrator = new Administrator();
		
		administrator.setId(rs.getInt("id"));
		administrator.setRole(rs.getString("role"));
		administrator.setNames(rs.getString("names"));
		administrator.setCreated_at(rs.getTimestamp("created_at"));
		
		return administrator;
	}

}
