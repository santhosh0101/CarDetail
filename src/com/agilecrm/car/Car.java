package com.agilecrm.car;

import javax.persistence.Id;

public class Car {
	
	@Id Long id;
	private String carId;
	private String carName;
	private String carPrice;
	private String carSpeed;
	private String carColor;
	private String carMileage;
	public String getCarMileage() {
		return carMileage;
	}
	public void setCarMileage(String carMileage) {
		this.carMileage = carMileage;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(String carSpeed) {
		this.carSpeed = carSpeed;
	}
	

}
