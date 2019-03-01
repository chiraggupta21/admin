package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.details;


public class ProductserviceImpl implements Productservice {
	ProductDaoImpl pdi=new ProductDaoImpl();
	@Override
	public void adddata(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		int id1=Integer.parseInt(request.getParameter("id"));
		String category=request.getParameter("category");
		String name=request.getParameter("name");
		String desciption=request.getParameter("description");
		int price=Integer.parseInt(request.getParameter("price"));
		
		System.out.println(id1+category+name+desciption+price);
		details b=new details(id1,category,name,desciption,price);
		pdi.insertdetail(b);
		getallbook(request, response);
		
	}

	@Override
	public void getallbook(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println("Bookservice");
		
		List<details> listBook1=new ArrayList<>();
		listBook1=pdi.listBook();
		System.out.println(listBook1);
		request.setAttribute("mybooklist", listBook1); //categorylist is an arraylist      contains object of class category  
		request.getRequestDispatcher("/Printing.jsp").forward(request,response);
	}
	@Override
	public void viewbook(HttpServletRequest request, HttpServletResponse response)throws  Exception {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		details existingBook=pdi.findabook(id);
		System.out.println(existingBook);
		
		request.setAttribute("listit", existingBook); //categorylist is an arraylist      contains object of class category  
		request.getRequestDispatcher("/view.jsp").forward(request,response);
		
		
	}

	@Override
	public void deleteline(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		pdi.deletelist(id);
		System.out.println(id);
	getallbook(request, response);
		
	}
	
	

}
