package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.details;
import com.mysql.jdbc.PreparedStatement;
import com.util.ConnectionManager;

public class ProductDaoImpl implements ProductDao{
	ConnectionManager cm=new ConnectionManager();
	Connection con;
	/**@Override
	public void getallProduct(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<details> listBook1=new ArrayList<>();
		String sql="SELECT * FROM product";
		con=cm.connect();
		Statement s= con.createStatement();
		ResultSet rs=s.executeQuery(sql);
		
		while(rs.next()){
			
			int id=rs.getInt("id");
			String category=rs.getString("category");
			String name=rs.getString("name");
			String description=rs.getString("desciption");
			int price=rs.getInt("price");
			details book=new details(id,category,name,description,price);
			listBook1.add(book);
			
		}
		System.out.println(listBook1);
		rs.close();
		s.close();
		cm.disconnect();
		System.out.println(listBook1);
		request.setAttribute("mybooklist", listBook1); //categorylist is an arraylist      contains object of class category  
		request.getRequestDispatcher("/Printing.jsp").forward(request,response);
		
	}*/
	@Override
	public List<details> listBook() throws Exception {
		List<details> listBook1=new ArrayList<>();
		String sql="SELECT * FROM product";
		con=cm.connect();
	
		Statement s= con.createStatement();
		ResultSet rs=s.executeQuery(sql);
		
		while(rs.next()){
			
			int id=rs.getInt("id");
			String category=rs.getString("category");
			String name=rs.getString("name");
			String desciption=rs.getString("desciption");
			int price=rs.getInt("price");
			details book=new details(id,category,name,desciption,price);
			listBook1.add(book);
			//System.out.println(book);
		}
		rs.close();
		s.close();
		cm.disconnect();
		
		return listBook1;
	}
	@Override
	public details findabook(int id) throws Exception {
		// TODO Auto-generated method stub
		details book=null;
		String sql="SELECT * FROM product WHERE id='"+id+"'";
		con=cm.connect();
		PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
		//ps.setInt(1,id);
		System.out.println("gOt it "+id);
		ResultSet rs=ps.executeQuery(sql);
		if(rs.next())
		{
			int id1=rs.getInt("id");
			String category=rs.getString("category");
			String name=rs.getString("name");
			String desciption=rs.getString("desciption");
			int price=rs.getInt("price");
			System.out.print(id1+category+name+desciption+price+"\n");
			book =new details(id1,category,name,desciption,price);
		}
		rs.close();
		ps.close();
		System.out.print("aefyueg yagtr \n"+book);
		
		return book;
	}
	@Override
	public int insertdetail(details b) throws Exception {
		
		String sql="insert into product (id,category,name,desciption,price) values (?,?,?,?,?)";
		int rowInserted=0;
		try {
			con=cm.connect();
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, b.getId());
			ps.setString(2, b.getCategory());
			ps.setString(3, b.getName());
			ps.setString(4, b.getdesciption());
			ps.setInt(5, b.getPrice());
				
				 rowInserted=ps.executeUpdate();

							ps.close();
							cm.disconnect();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowInserted;
	}
	@Override
	public int deletelist(int book_id) throws Exception {
		String sql="delete from product where id=?";
		con=cm.connect();
		PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
		ps.setInt(1,book_id);
		int rowDeleted=ps.executeUpdate();
						ps.close();
						cm.disconnect();
		
						return rowDeleted;
	}
	
	

	

}
