package com.xworkz.govntapplication.servlet;

import java.util.List;

import Dto.GovntDto;
import service.GovntService;
import service.GovntServiceImpl;

public class Runner {
	public static void main(String[] args) {
		GovntService service=new GovntServiceImpl();
		List<GovntDto> dto=service.validRead();
		System.out.println(dto);
	}

}
