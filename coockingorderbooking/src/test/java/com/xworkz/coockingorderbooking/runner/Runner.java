package com.xworkz.coockingorderbooking.runner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class Runner extends GenericServlet {
	public Runner() {
		System.out.println("constructor");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String userName=req.getParameter("enterName");
		System.out.println("userName");
		String contactNumber=req.getParameter("enterNumber");
		System.out.println("contactNumber");
		String Email=req.getParameter("enteremail");
		System.out.println(" Email");
		String AlternativeNumber=req.getParameter("enterAlternativeNumber");
		System.out.println("AlternativeNumber");
		String Time=req.getParameter("enterTime");
		System.out.println("Time");
		String Amount=req.getParameter("enterAmount");
		System.out.println("Amount");
		String Place=req.getParameter("enterPlace");
		System.out.println("Place");
		String numberofpeople=req.getParameter("enternumberofpeople");
		System.out.println("numberofpeople");
		
		req.getContentType();
		res.setContentType("html");
		PrintWriter printWriter=res.getWriter();
				printWriter.print("<h1>"+"Thank for Booking </h1>"+" "+userName);
				
				
			
					
			}
				
				   
		
	}
	





