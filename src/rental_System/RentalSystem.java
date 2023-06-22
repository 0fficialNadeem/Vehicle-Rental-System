package rental_System;

import java.util.HashMap;
import java.util.Map;

public class RentalSystem {
	private Map<String, Rentable> rentableVehicles;

	public RentalSystem() {
		rentableVehicles = new HashMap<>();
	}

	// add vehicle to list
	public void addRentable(Vehicle v) {
		rentableVehicles.put(v.getMake() + " " + v.getModel(), v);
	}

	// displays list of vehicles available
	public void display() {
		int count = 1;
		for (String r : rentableVehicles.keySet()) {
			Rentable rentable = rentableVehicles.get(r);
			if (rentable instanceof Vehicle) {
				Vehicle v = (Vehicle) rentable;
				System.out.println(
						count + ". " + r + " " + "Rental Rate: " + v.getRentalRate() + " Available:" + !v.isRented());
				count++;
			}
		}
		count = 0;
	}

	public void rent(String vehicleName) {
		Rentable r = rentableVehicles.get(vehicleName);
		if (r instanceof Vehicle) {
			Vehicle v = (Vehicle) r;
			v.rent();
		}else if(r == null) {
			System.out.println("Sorry,We dont rent: "+ vehicleName);
		} 

	}

}
