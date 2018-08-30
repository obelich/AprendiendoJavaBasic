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
import org.springframework.stereotype.Component;

import com.novellius.pojo.AdministratorRowMapper;
import com.novellius.pojo.Administrators;

@Component("administratorsDao")
public class AdministratorsDaoImpl implements AdministratorDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public boolean save(Administrators administrators) {
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

	@Override
	public Administrators findById(int id) {
		// TODO Auto-generated method stub
		//Primer modo de hacer la consulta
//			return (Administrators) jdbcTemplate.query("SELECT * FROM Administrators WHERE id = :id", new MapSqlParameterSource("id", id), new AdministratorRowMapper());
		
		//Segundo modo de hacer la consulta sin tener que hacer un casting
		return jdbcTemplate.queryForObject("SELECT * FROM Administrators WHERE id = :id", new MapSqlParameterSource("id", id), new AdministratorRowMapper());
	}

	@Override
	public List<Administrators> findByNames(String names) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM Administrators WHERE names LIKE :names", new MapSqlParameterSource("names",  "%" + names + "%"), new AdministratorRowMapper());
	}

}
