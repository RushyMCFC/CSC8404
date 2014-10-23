import java.util.Calendar;
import java.util.Date;


public class Person {
	private Name fullName;
	private Date dob;
	
	public Person(Name fullName, Date dob) {
		this.fullName = new Name(fullName.getFirstName(),fullName.getLastName());
		this.dob = (Date) dob.clone();
	}
	
	public Name getFullName() {
		return fullName;
	}
	
	public Date getDOB() {
		return dob;
	}
	
	public String toString() {
		return fullName+"\nDate of Birth : "+dob;
	}
	
	public static void main(String args[]) {
		Name n = new Name("Rushil","Ahuja");
		Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.YEAR, 1994);
	    cal.set(Calendar.MONTH, 10);
	    cal.set(Calendar.DAY_OF_MONTH, 24);
	    Date d = cal.getTime();
	    Person obj = new Person(n,d);
	    System.out.println(obj);
	    String x = d.toString();
	    System.out.println(x.substring(x.lastIndexOf(' ')+1));
	    String xxx = "HELLO5";
	    int y = xxx.charAt(0)-65 + xxx.charAt(1)-65 + xxx.charAt(5)-0;
	    System.out.println(y);
	}
}
