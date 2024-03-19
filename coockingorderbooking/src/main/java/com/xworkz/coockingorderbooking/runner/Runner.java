package com.xworkz.coockingorderbooking.runner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/submit")
public class Runner   extends GenericServlet {
	public Runner() {
	
	System.out.println("constructor");
	}
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	String userName=req.getParameter("enterName");
	System.out.println(userName);
	req.getContentType();
	res.setContentType("html");
	PrintWriter writer=res.getWriter();
	writer.print("Thank You for order");
	writer.close();
	
}

	
	

}
