import java.util.HashMap;
import java.util.Map;


public class RentCompany {
	private Map<Car, Boolean> allCars = new HashMap<Car, Boolean>();
	private Map<Car, Person> rentedCars = new HashMap<Car, Person>();
	
	public RentCompany(Map<Car, Boolean> allCars, Map<Car, Person> rentedCars) {
		this.allCars = allCars;
		this.rentedCars = rentedCars;
	}
	
	public int availableCars(String carType) {
		int count = 0;
		for (Map.Entry<Car, Boolean> entry : allCars.entrySet()) {
		    if((entry.getKey().getType().compareTo(carType) == 0) && !entry.getValue()) {
		    	count++;
		    }
		}
		return count;
	}
	
	public Map<Car, Person> getRentedCars() {
		return rentedCars;
	}
	
	public Car getCar(Person p) {
		Car rentedCar = null;
		for (Map.Entry<Car, Person> entry : rentedCars.entrySet()) {
		    if(entry.getValue().equals(p)) {
		    	rentedCar = entry.getKey();
		    }
		}
		return rentedCar;
	}
	
	public boolean issueCar(Person p, String carType) {
		if(availableCars(carType) == 0) {
			return false;
		}
		else {
			for (Map.Entry<Car, Boolean> entry : allCars.entrySet()) {
			    if((entry.getKey().getType().compareTo(carType) == 0) && !entry.getValue()) {
			    	if(getCar(p) != null) {
			    		
			    	}
			    	else {
			    		return false;
			    	}
			    }
			    else
			    	return false;
			}
		}
	}
}
