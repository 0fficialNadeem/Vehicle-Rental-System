package rental_System;

import java.time.LocalDateTime;

public class Motorbike extends Vehicle {
	private int numOfGears;

	public Motorbike(String make, String model, String year, int numOfGears) {
		super(make, model, year);
		this.setNumOfGears(numOfGears);
	}

	@Override
	public void move() {
		System.out.println("Popping a Wheelie!!");

	}

	@Override
	public void rent() {
		super.setIsRented(true);
		LocalDateTime currentDateTime = LocalDateTime.now();
		super.setRentalDateAndTime(currentDateTime.toString());
		System.out.println("Rented " + getMake() + getModel() + "at Rental rate: " + getRentalRate());

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
		return numOfGears;
	}

	public void setNumOfGears(int numOfGears) {
		this.numOfGears = numOfGears;
	}

}
