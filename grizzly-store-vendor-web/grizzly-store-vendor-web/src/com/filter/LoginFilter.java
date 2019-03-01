package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.model.LoginDaoImp;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/ProductController")
public class LoginFilter implements Filter {
	  int i=0;
    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		PrintWriter pw=response.getWriter();
		LoginDaoImp lb=new LoginDaoImp();
		String user=request.getParameter("uname");
		String password=request.getParameter("psw");
		System.out.println(user);
		String status="";
		boolean flag=false;
		try
		{flag=lb.validateuser(user, password, status);
		if(flag==true)
		{ System.out.println("I am validate login "+flag);
			chain.doFilter(request, response);
		}
		else
		{	i++;
		System.out.print(i);
	
			if(i>3)
			{	
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
				 //pw.write("<h2>Exceed the limit of accesing </h2>");
				pw.write("  <font color=\"red\"><h1 style=\"text-align:center;\">Exceed the limit !</h1></font>");
				rd.include(request,response);
				 
			}
			else{
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
				 //pw.write("<h2>Invalid User</h2>");
				pw.write(" <font color=\"red\"><h2 style=\"text-align:center;\">Invalid User !</h2></font>");
				rd.include(request,response);
			}
		
			System.out.println(" I am invalidate "+flag);
		}}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
