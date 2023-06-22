package rental_System;

import java.time.LocalDateTime;

public class Car extends Vehicle {

	private int numOfSeats;
	private boolean isConvertable;

	public Car(String make, String model, String year, int seats, boolean convertable) {
		super(make, model, year);
		this.setNumOfSeats(seats);
		this.setConvertable(convertable);
	}

	@Override
	public void move() {
		System.out.println("Vroom Vroom");

	}

	@Override
	public void rent() {
		super.setIsRented(true);
		LocalDateTime currentDateTime = LocalDateTime.now();
		super.setRentalDateAndTime(currentDateTime.toString());
		System.out.println("Rented Car " + getMake() + getModel() + "at Rental rate: " + getRentalRate());

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

	public boolean isConvertable() {
		return isConvertable;
	}

	public void setConvertable(boolean isConvertable) {
		this.isConvertable = isConvertable;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

}
