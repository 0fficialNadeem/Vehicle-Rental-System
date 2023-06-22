package rental_System;

public class Main {
	public static void main(String[] args) {
		// set-up rental system and vehicles
		RentalSystem rs = new RentalSystem();
		Vehicle Nissan = new Car("Nissan", "GTR", "2023", 5, false);
		Vehicle ElectricBike = new Bicycle("Ebike", "Speedo", "2010", "electric", 5);
		Vehicle Motorbike = new Motorbike("Yamaha", "Speedster", "2005", 10);
		Nissan.setIsRented(false);
		Nissan.setRentalRate(500);
		ElectricBike.setIsRented(false);
		ElectricBike.setRentalRate(50);
		Motorbike.setIsRented(false);
		Motorbike.setRentalRate(100);
		// add vehicles that are available to be rented
		rs.addRentable(Nissan);
		rs.addRentable(ElectricBike);
		rs.addRentable(Motorbike);
		// display list of vehicles that can be rented
		rs.display();
		// renting the Motorbike should change availability to rent to false
		rs.rent("Yamaha Speedster");
		Motorbike.move();
		// displays list of vehicles to demonstrate that the Motorbike is no longer available to rent
		rs.display();
		// returning Motorbike makes it available to rent again
		Motorbike.returnVehicle();
		// displays list of vehicles to demonstrate that the Motorbike is now available to rent again.
		rs.display();
	}

}
