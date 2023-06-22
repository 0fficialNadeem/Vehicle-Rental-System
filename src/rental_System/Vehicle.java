package rental_System;

public abstract class Vehicle implements Movable,Rentable {
	private String make;
	private String model;
	private String year;
	private int rentalRate;
	private boolean isRented;
	private String rentalDateAndTime;
	
	
	
	public Vehicle(String make, String model, String year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void setRentalRate(int rate) {
		this.rentalRate = rate;
	}
	public int getRentalRate() {
		return this.rentalRate;
	}
	
	public void setIsRented(boolean status) {
		this.isRented = status;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	public String getYear() {
		return this.year;
	}
	
	public Boolean isVehicleRented() {
		return this.isRented;
	}

	public String getRentalDateAndTime() {
		return rentalDateAndTime;
	}

	public void setRentalDateAndTime(String rentalDateAndTime) {
		this.rentalDateAndTime = rentalDateAndTime;
	}
	
	

}
