
public interface Car {
	double getFuel();
	RegistrationNumber getRegNo();
	String getType();
	boolean getRented();
	boolean checkTank();
	double addFuel(double addF);
	int drive(int km);
}
