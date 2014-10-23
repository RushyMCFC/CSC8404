import java.util.HashMap;
import java.util.Map;


public class RentalCompany {
	Map<SmallCar, Boolean> allSmallCars = new HashMap<SmallCar, Boolean>();
	Map<LargeCar, Boolean> allLargeCars = new HashMap<LargeCar, Boolean>();
	Map<SmallCar, Person> rentedSmallCars = new HashMap<SmallCar, Person>();
	Map<LargeCar, Person> rentedLargeCars = new HashMap<LargeCar, Person>();
	
	public RentalCompany(Map<SmallCar, Boolean> allSmallCars, Map<SmallCar, Person> rentedSmallCars, Map<LargeCar, Boolean> allLargeCars, Map<LargeCar, Person> rentedLargeCars) {
		this.allSmallCars = allSmallCars;
		this.allLargeCars = allLargeCars;
		this.rentedSmallCars = rentedSmallCars;
		this.rentedLargeCars = rentedLargeCars;
	}
	
	public int availableCars(String carType) {
		int count = 0;
		if(carType.compareTo("Small") == 0) {
			for (Map.Entry<SmallCar, Boolean> entry : allSmallCars.entrySet()) {
			    if(!entry.getValue()) {
			    	count++;
			    }
			}
			return count;
		}
		else if(carType.compareTo("Large") == 0) {
			for (Map.Entry<LargeCar, Boolean> entry : allLargeCars.entrySet()) {
			    if(!entry.getValue()) {
			    	count++;
			    }
			}
			return count;
		}
		else {
			return -1;
		}
	}
	
	public Map<Car, Person> getRentedCars() {
		return rentedCars;
	}
	
	public Car getCar(Person p) {
		boolean flag = false;
		for (Map.Entry<Car, Person> entry : rentedCars.entrySet()) {
		    if(entry.getValue().equals(p)) {
		    	flag = true;
		    	return entry.getKey();
		    }
		}
		if(flag == false) {
			return null;
		}
	}
}
