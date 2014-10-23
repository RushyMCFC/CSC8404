import java.util.Date;


public class DrivingLicence{
	private String firstPart;
	private String secondPart;
	private int thirdPart;
	private String licenceNumber;
	
	public DrivingLicence(Name fullName, Date dob, String firstPart, String secondPart, String thirdPart) {
		this.firstPart = firstPart;
		this.secondPart = secondPart;
		this.thirdPart = Integer.parseInt(thirdPart);
		this.licenceNumber = this.firstPart+"-"+this.secondPart+"-"+this.thirdPart;
	}
	
	public DrivingLicence(Name fullName, Date issueDate) {
		Name name = new Name(fullName.getFirstName(),fullName.getLastName());
		String fName = name.getFirstName();
		String lName = name.getLastName();
		firstPart = Character.toString(fName.charAt(0));
		firstPart += Character.toString(lName.charAt(0));
		firstPart.toUpperCase();
		Date date = (Date) issueDate.clone();
		String dateString = date.toString();
		secondPart = dateString.substring(dateString.lastIndexOf(' ')+1);
		thirdPart += (firstPart.charAt(0)-65) + (firstPart.charAt(1)-65);
		thirdPart += (secondPart.charAt(0)-48) + (secondPart.charAt(1)-48) + (secondPart.charAt(2)-48) + (secondPart.charAt(3)-48);
		licenceNumber = firstPart+"-"+secondPart+"-"+thirdPart;
	}
	
	public String getFirstPart() {
		return firstPart;
	}
	
	public String getSecondPart() {
		return secondPart;
	}
	
	public String getThirdPart() {
		return thirdPart+"";
	}
	
	public String getLicenceNumber() {
		return licenceNumber;
	}
}
