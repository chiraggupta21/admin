package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	String jdbcURL,jdbcUSER,jdbcPassword;
	Connection con;
	public ConnectionManager() {
		// TODO Auto-generated constructor stub
	jdbcURL="jdbc:mysql://localhost:3306/gizzlystore";
	jdbcUSER="root";
	jdbcPassword="root";
	}
	public Connection connect() throws SQLException
	{
		if (con == null || con.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			con = DriverManager.getConnection(jdbcURL,jdbcUSER, jdbcPassword);
			System.out.println(con);
		}
		System.out.println("In:"+con);
		return con;
	}
	public void disconnect()  throws SQLException {
		// TODO Auto-generated method stub
		if (con != null && !con.isClosed()) {
			con.close();
		}}

}
