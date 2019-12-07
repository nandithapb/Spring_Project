package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Login;
import com.spring.model.Register;

public class UserDaoImp implements UserDao {
	DataSource datasource;
	@Autowired
	//jdbc template object
	JdbcTemplate jdbcTemplate;
	// registration
	public void register(Register register) {
		String sql="insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,new Object[] {register.getUsername(),register.getPassword(),register.getFirstname(),register.getLastname(),register.getEmail(),register.getAddress(),register.getNumber()});
	}
	//user validation
	public Register validateuser(Login login) {
		String sql="select * from users where username='"+login.getUsername()+"' and password='"+login.getPassword()+"'";
		List<Register> users=jdbcTemplate.query(sql,new UserMapper());
			return users.size()>0?users.get(0): null;
		}
	}
	//usermapper class
	class UserMapper implements RowMapper<Register>
	{
		public Register mapRow(ResultSet rs,int arg1) throws SQLException
		{
			Register reg=new Register();
			reg.setUsername(rs.getString("username"));
			reg.setPassword(rs.getString("password"));
			reg.setFirstname(rs.getString("firstname"));
			reg.setLastname(rs.getString("lastname"));
			reg.setEmail(rs.getString("email"));
			reg.setAddress(rs.getString("address"));
			reg.setNumber(rs.getString("phone"));
			return reg;
		}
	}
	
	