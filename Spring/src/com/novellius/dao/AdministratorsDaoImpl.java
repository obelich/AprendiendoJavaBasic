package com.novellius.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
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

	@Override
	public List<Administrators> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from administrators", new RowMapper<Administrators>() {

			@Override
			public Administrators mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Administrators administrator = new Administrators();
				
				administrator.setId(rs.getInt("id"));
				administrator.setRole(rs.getString("role"));
				administrator.setNames(rs.getString("names"));
				administrator.setCreated_at(rs.getTimestamp("created_at"));
				
				return administrator;
			}
		});
	}

}
