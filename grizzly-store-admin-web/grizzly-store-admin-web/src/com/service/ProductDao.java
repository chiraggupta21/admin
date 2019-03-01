package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.details;


public interface ProductDao {

	//public void getallProduct(HttpServletRequest request, HttpServletResponse response)throws  Exception;
	public List<details> listBook() throws Exception;
	public details findabook(int id)throws Exception;
	public int insertdetail(details b) throws  Exception;
	public int deletelist(int book_id) throws Exception;
}
