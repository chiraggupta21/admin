package com.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Productservice {
	
	public void adddata(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public void getallbook(HttpServletRequest request, HttpServletResponse response)throws  Exception;
	public void viewbook(HttpServletRequest request, HttpServletResponse response)throws  Exception;
	public void deleteline(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
