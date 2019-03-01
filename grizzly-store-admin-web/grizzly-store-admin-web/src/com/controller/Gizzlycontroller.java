package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.LoginDao;
import com.model.LoginDaoImp;

/**
 * Servlet implementation class Gizzlycontroller
 */
//@WebServlet("/Gizzlycontroller")
public class Gizzlycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       LoginDaoImp logindaoimp;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gizzlycontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init(ServletConfig config)
    {
    	logindaoimp=new LoginDaoImp();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action =request.getServletPath();
		System.out.print("a="+action);
		switch(action)
		{
		case "/":
			logindaoimp.showLoginForm(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
