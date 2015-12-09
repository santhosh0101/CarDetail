package com.agilecrm.car;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
public class SaveCarDetail {
	
	public SaveCarDetail(){}
	
	public static void saveCarDetail(String carId, String carName, String carPrice, String carColor, String carSpeed, String carMileage){
		
		Objectify ofy = ObjectifyService.begin();
			Car audi = new Car();							//Store the property of car in an Object
			audi.setCarId(carId);
			audi.setCarName(carName);
			audi.setCarColor(carColor);
			audi.setCarMileage(carMileage);
			audi.setCarPrice(carPrice);
			audi.setCarSpeed(carSpeed);
			
			ofy.put(audi);
			Car car = ofy.get(Car.class,audi.id);
			System.out.print(car.getCarName());
	//Car car = ofy.query(Car.class).filter("carId", "12311").get();
	//System.out.print(car.getCarName());
	

   }

	
}
