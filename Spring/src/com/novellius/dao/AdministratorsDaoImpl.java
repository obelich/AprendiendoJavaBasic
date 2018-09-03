package com.novellius.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

import com.novellius.pojo.AdministratorRowMapper;
import com.novellius.pojo.Administrator;

@Component("administratorsDao")
public class AdministratorsDaoImpl implements AdministratorDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public boolean save(Administrator administrators) {
		//Seteamos los campos de modo manual que vamos a usar
		
			//MapSqlParameterSource paramMap = new MapSqlParameterSource();
			//paramMap.addValue("names", administrators.getNames());
			//paramMap.addValue("role", administrators.getRole());
			//paramMap.addValue("created_at", administrators.getCreated_at());   
			
		//Seteamos de modo automatico.
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(administrators); //Esto funciona si los seters tienen el mismo nombre 
		//que los campos en la abse de datos
		
		return jdbcTemplate.update("insert into Administrators (names, role, created_at) values (:names, :role, :created_at)", paramMap) == 1;
	}

	@Override
	public List<Administrator> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from administrators", new RowMapper<Administrator>() {

			@Override
			public Administrator mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Administrator administrator = new Administrator();
				
				administrator.setId(rs.getInt("id"));
				administrator.setRole(rs.getString("role"));
				administrator.setNames(rs.getString("names"));
				administrator.setCreated_at(rs.getTimestamp("created_at"));
				
				return administrator;
			}
		});
	}

	@Override
	public Administrator findById(int id) {
		// TODO Auto-generated method stub
		//Primer modo de hacer la consulta
//			return (Administrators) jdbcTemplate.query("SELECT * FROM Administrators WHERE id = :id", new MapSqlParameterSource("id", id), new AdministratorRowMapper());
		
		//Segundo modo de hacer la consulta sin tener que hacer un casting
		return jdbcTemplate.queryForObject("SELECT * FROM Administrators WHERE id = :id", new MapSqlParameterSource("id", id), new AdministratorRowMapper());
	}

	@Override
	public List<Administrator> findByNames(String names) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM Administrators WHERE names LIKE :names", new MapSqlParameterSource("names",  "%" + names + "%"), new AdministratorRowMapper());
	}

	@Override
	public boolean update(Administrator administrator) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update Administrators set names=:names, role=:role, created_at=:created_at  where id=:id", new BeanPropertySqlParameterSource(administrator)) == 1;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from Administrators where id=:id", new MapSqlParameterSource("id", id)) == 1;
	}

	@Override
	public void saveAll(List<Administrator> administrators) {
		// TODO Auto-generated method stub
		SqlParameterSource[] batchArgs = SqlParameterSourceUtils.createBatch(administrators.toArray());
		jdbcTemplate.batchUpdate("insert into Administrators (names, role, created_at) values (:names, :role, :created_at)", batchArgs);
	}

}
