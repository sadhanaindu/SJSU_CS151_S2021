/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>Contractor Class</h1>
 * This is a class that represents a hourly paid contractor at Target. This class extends
 * Employee. Any hourly paid contractor is also an employee. So, any instance of Contractor 
 * also has the attributes: first and last name, address, id, ssn, direct deposit status, and 
 * educational level. 
 * 
 */
public class Contractor extends Employee{
	
	/**
	 * private Double attribute
	 */
	private Double basePay;
	
	/**
	 * Creates a hourly paid contractor with no parameters. Creates an instance of the Contractor class. 
	 */
	public Contractor()
	{
		super();
		this.setBasePay(0.0);
	}
	
	
	/** Creates a hourly paid contractor with the given parameters. Creates an instance of the Contractor class. 
	 * @param firstName is the first name of the hourly paid contractor
	 * @param lastName is the last name of the hourly paid contractor
	 * @param address is the address of thehourly paid contractor
	 * @param id is the id of the hourly paid contractor
	 * @param pay is the amount of money that the hourly paid contractor is paid per hour
	 * @param ssn is the social security number of the hourly paid contractor
	 */
	public Contractor(String firstName, String lastName, Address address, int id, Double pay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		this.setBasePay(pay);
	}

	
	/**
	 * setter method for the amount of money that the hourly paid contractor is paid per hour
	 * @return a double that represents the amount of money that the hourly paid contractor is paid per hour
	 */
	public Double getBasePay() {
		return basePay;
	}

	
	/**
	 * getter method for the amount of money that the hourly paid contractor is paid per hour
	 * @param basePay is the amount of money that the hourly paid contractor is paid per hour
	 */
	public void setBasePay(Double basePay) {
		this.basePay = basePay;
	}
	/**
	 * a method that introduces the hourly paid contractor. 
	 * This prints out not only the attributes of a person, but also the attributes of an employee. This includes:
	 * ID, education level, and direct deposit status.
	 * @param displaySSN will determine if the SSN of the contractor will be displayed
	 */
	public void introduce(boolean displaySSN)
	{
		String value = toString();
		if(displaySSN)
		{
			System.out.println(value);
		}
		
		else
		{
			int startIndex = value.indexOf("\nSSN");
			int endIndex = value.indexOf("\nID");
			String noSSN = value.substring(0,startIndex);
			noSSN+= value.substring(endIndex);
			System.out.println(noSSN);
		}
		
	}
	/**
	 * method that gives a string representation of the contractor. This method overrides the toString method from the Employee class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, direct deposit status, education level, 
	 * and the base pay of the contracter.
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nThis person is a hourly paid contractor" + "\nBase Pay: " + this.getBasePay();
		return value;
	}
	
	/**
	 * method that calculates the total pay owed to contractor
	 * @param numHrs  is the number of hours worked
	 * @return a Double that represents the total amount in dollars owed to the contractor
	 */
	public Double computePay(int numHrs)
	{
		Double totalPay = numHrs * getBasePay();
		return totalPay;
	}
	
	

}
