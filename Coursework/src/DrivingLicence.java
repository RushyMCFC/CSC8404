import java.util.Calendar;
import java.util.Date;


public class DrivingLicence extends Person {
	private String firstPart;
	private String secondPart;
	private int thirdPart;
	private String licenceNumber;
	
	public DrivingLicence(Name fullName, Date dob, String firstPart, String secondPart, int thirdPart) {
		super(fullName, dob);
		this.firstPart = firstPart;
		this.secondPart = secondPart;
		this.thirdPart = thirdPart;
		this.licenceNumber = this.firstPart+"-"+this.secondPart+"-"+this.thirdPart;
	}
	
	public DrivingLicence(Name fullName, Date dob) {
		super(fullName, dob);
		Name name = getFullName();
		String fName = name.getFirstName();
		String lName = name.getLastName();
		firstPart = Character.toString(fName.charAt(0));
		firstPart += Character.toString(lName.charAt(0));
		firstPart.toUpperCase();
		Date date = getDOB();
		String dateString = date.toString();
		secondPart = dateString.substring(dateString.lastIndexOf(' ')+1);
		thirdPart += (firstPart.charAt(0)-65) + (firstPart.charAt(1)-65);
		
	}
}
