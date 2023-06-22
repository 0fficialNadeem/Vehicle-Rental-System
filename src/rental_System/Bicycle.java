package rental_System;

import java.time.LocalDateTime;

public class Bicycle extends Vehicle {

	private int numOfGears;
	private String typeOfBycicle;

	public Bicycle(String make, String model, String year, String type, int gears) {
		super(make, model, year);
		this.setNumOfGears(gears);
		this.setTypeOfBycicle(type);
	}

	@Override
	public void move() {
		System.out.println("Pedalling Faster!");

	}

	@Override
	public void rent() {
		super.setIsRented(true);
		LocalDateTime currentDateTime = LocalDateTime.now();
		super.setRentalDateAndTime(currentDateTime.toString());
		System.out.println("Rented Bike " + getMake() + getModel() + "at Rental rate: " + getRentalRate());

	}

	@Override
	public void returnVehicle() {
		super.setIsRented(false);
		System.out.println("Returning "+ getMake()+" " +getModel()+ " to Storage");

	}

	@Override
	public Boolean isRented() {
		return super.isVehicleRented();
	}

	public int getNumOfGears() {
		return this.numOfGears;
	}

	public void setNumOfGears(int numOfGears) {
		this.numOfGears = numOfGears;
	}

	public String getTypeOfBycicle() {
		return this.typeOfBycicle;
	}

	public void setTypeOfBycicle(String typeOfBycicle) {
		this.typeOfBycicle = typeOfBycicle;
	}

}
