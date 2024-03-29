package com.xworkz.govntapplication.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dto.GovntDto;
import service.GovntService;
import service.GovntServiceImpl;

@WebServlet(urlPatterns = "/view")

public class GoViewServlet extends HttpServlet {
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	RequestDispatcher dispatcher=req.getRequestDispatcher("/view.jsp");
	GovntService service=new GovntServiceImpl();
	List<GovntDto>  list=service.validRead();
	// System.out.println("This is view Class:"+list);
	 req.setAttribute("list", list);
		dispatcher.forward(req, resp);
}
}
