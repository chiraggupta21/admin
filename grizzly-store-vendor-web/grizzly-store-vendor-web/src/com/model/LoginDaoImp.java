package com.model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ConnectionManager;

public class LoginDaoImp implements LoginDao{
	ConnectionManager cm;
	Connection jdbcconnect;
	@Override
	public void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		
	}

	public LoginDaoImp() {
	
	}

	@Override
	public boolean validateuser(String username, String password, String status) throws SQLException {
		// TODO Auto-generated method stub
		String sql="Select username,password from user where username =? and password =?";
		System.out.println("IN validateuser"+username+password);
		cm=new ConnectionManager();
	 jdbcconnect=cm.connect();
		System.out.println("jdbc connection validate"+jdbcconnect);
		PreparedStatement ps=jdbcconnect.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		boolean row;
		if(rs.next())
		{
			row=true;
		}
		else
		{
			row=false;
		}
		ps.close();
		cm.disconnect();
		return row;
	}
	
	

}
