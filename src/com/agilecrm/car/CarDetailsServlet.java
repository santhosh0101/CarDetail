package com.agilecrm.car;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
@SuppressWarnings("serial")
public class CarDetailsServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{		
		
		String carId=request.getParameter("carId");
		String carName=request.getParameter("carName");
		String carPrice=request.getParameter("carPrice");
		String carColor=request.getParameter("carColor");
		String carSpeed=request.getParameter("carSpeed");
		String carMileage=request.getParameter("carMileage");
		
		try{
			ObjectifyService.register(Car.class);
			
		  }catch(Exception e){
			  System.out.println(e);
		  }
		finally {
					SaveCarDetail.saveCarDetail(carId, carName, carPrice,carColor,carSpeed, carMileage);
		}
		//response.setContentType("text/json");
		//response.getWriter().write("<html>hello html</html>");
		
		}
	}
	

