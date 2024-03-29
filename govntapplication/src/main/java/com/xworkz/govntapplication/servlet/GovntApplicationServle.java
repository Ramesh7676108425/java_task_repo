package com.xworkz.govntapplication.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dto.GovntDto;
import service.GovntService;
import service.GovntServiceImpl;


@WebServlet(urlPatterns = "/ramesh" )
public class GovntApplicationServle extends HttpServlet {
	
	public GovntApplicationServle() {
		System.out.println("this is default constructor");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		GovntDto dto=new GovntDto();
		
		
		System.out.println("this is dopost method");
		
		String name=req.getParameter("enterName");
		dto.setName(name);
		System.out.println(name);
		
		String email=req.getParameter("enteremail");
		dto.setEmail(email);
		System.out.println(email);
		
		long number=Long.parseLong(req.getParameter("enterNumber"));
		dto.setContactNumber(number);
		System.out.println(number);
		
		int age=Integer.parseInt(req.getParameter("enterage"));
		dto.setAge(age);
		System.out.println(age);
		
		String dob=req.getParameter("enteDateOfBirth");
		
		System.out.println(dob);
		
		String blood=req.getParameter("enterBlood Group");
		System.out.println(blood);
		
		String mt=req.getParameter("enterMother tongue");
		dto.setMotherTounge(mt);
		System.out.println(mt);
		
		String gender=req.getParameter("male");
		dto.setGender(gender);
		System.out.println(gender);
		
		String ms=req.getParameter("enterMarital status");
		dto.setMaritalStatus(ms);
		System.out.println(ms);
		
		String nationality=req.getParameter("enterNationality");
		dto.setNationality(nationality);
		System.out.println(nationality);
		
		String religion=req.getParameter("enterReligion");
		dto.setReligion(religion);
		System.out.println(religion);
		
		String address=req.getParameter("enteraddress");
		dto.setAddress(address);
		System.out.println(address);
		
		
//		req.getContentType();
//		resp.setContentType("html");
//		PrintWriter writer=resp.getWriter();
//		writer.print("Thank You for Applying");
//		writer.close();
//		dto.setAddress(address);
		
		GovntService service=new GovntServiceImpl();
		service.validateandSave(dto);
//		if(validateandSave) {
//			RequestDispatcher dispatcher=req.getRequestDispatcher("Register.jsp");
//			req.setAttribute("msg", "saved");
//			dispatcher.forward(req, resp);
//			
//		}
//		

}
}
