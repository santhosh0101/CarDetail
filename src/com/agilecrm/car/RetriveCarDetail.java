package com.agilecrm.car;

import java.util.ArrayList;
import java.util.List;

import com.google.appengine.repackaged.com.google.gson.Gson;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;

public class RetriveCarDetail {
	
	
	public static String getCarDetail(String carId, String carName, String carPrice, String carSpeed, String carMileage, String carColor, String carPrice1, String carSpeed1){
		String json="";
		Gson gson = new Gson();
		List <Car> carList=new ArrayList<Car>();
		Objectify ofy = ObjectifyService.begin();
		Query<Car> cars = ofy.query(Car.class);
		if((! carId.isEmpty())){
				cars = cars.filter("carId", carId);
		}
		if(! carSpeed.isEmpty()){
			cars = cars.filter("carSpeed <", carSpeed);

			}
		if(! carMileage.isEmpty()){System.out.println("cm "+carMileage);
			cars = cars.filter("carMileage >", carMileage);
		}
		if(! carPrice.isEmpty()){
			cars = cars.filter("carPrice ", carPrice);
		}
		if(! carColor.isEmpty()){
			cars = cars.filter("carColor", carColor);
		}
		if(! carName.isEmpty()){
			cars = cars.filter("carName", carName);
		}
			for (Car car: cars) {
				carList.add(car);
			}
		
		
		 json =gson.toJson(carList);
		System.out.println(json);
		return json;
	}
	
	public static String getAllCarDetail(){
		List <Car> carList=new ArrayList<Car>();		
		Objectify ofy = ObjectifyService.begin();
		Query<Car> q = ofy.query(Car.class);
		Gson gson = new Gson();
		for (Car car: q) {
			carList.add(car);
		}
		String json =gson.toJson(carList);
		System.out.println(json);
		return json;
		}
	}


