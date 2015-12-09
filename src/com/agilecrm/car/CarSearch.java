package com.agilecrm.car;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class CarSearch extends HttpServlet {
		
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		
    String carObject;
	String carId=request.getParameter("carId");
	String carName=request.getParameter("carName");
	String carColor=request.getParameter("carColor");
	String carMileage=request.getParameter("carMileage");
	String carPrice=request.getParameter("carPrice");
	String carSpeed=request.getParameter("carSpeed");
	String carSpeed1=request.getParameter("carSpeed1");
	String carPrice1=request.getParameter("carPrice1");
	System.out.println("Car id is= "+carId);
	
	try{
		ObjectifyService.register(Car.class);
		
	  }catch(Exception e){
		  System.out.println(e);
	  }
	finally {
		if(carId.equalsIgnoreCase("all"))
			carObject=RetriveCarDetail.getAllCarDetail();
		else{
			System.out.println(carId+"  l"+carSpeed1);
			carObject=RetriveCarDetail.getCarDetail(carId,carName,carPrice,carSpeed,carMileage,carColor,carPrice1,carSpeed1);
			System.out.println(carId+"  l"+carSpeed1);
		}
		response.setContentType("text/json");
		response.getWriter().write(carObject);
	  }
	
	}
}
