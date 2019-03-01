package com.model;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginDao {

	void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ;
	public boolean validateuser(String username,String password,String status) throws SQLException;
}
