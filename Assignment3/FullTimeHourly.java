/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>FullTimeHourly Class</h1>
 * This is a class that represents a full time hourly employee at Target. This class extends FullTimeEmployee. 
 * A full time hourly employee is also a full time employee. So, any instance of FullTimeHourly 
 * also has the attributes of basePay.
 * 
 */
public class FullTimeHourly extends FullTimeEmployee{
	
	/**
	 * private Double attribute
	 */
	private Double overtimePay;
	
	/**
	 * Creates a a full time hourly employee with no parameters. Creates an instance of the FullTimeHourly class. 
	 */
	public FullTimeHourly()
	{
		super();
		setOvertimePay(0.0);
	}
	
	/**
	 * Creates a full time hourly employee with the given parameters. Creates an instance of the FullTimeHourly class. 
	 * @param firstName is the first name of the full time hourly employee
	 * @param lastName is the last name of the full time hourly employee
	 * @param address is the address of the full time hourly employee
	 * @param id is the identification number of the full time hourly employee
	 * @param basePay is the amount of money the full time hourly employee earns hourly
	 * @param overtime is the amount of money the full time hourly employee earns hourly after reaching 40 hours
	 * @param ssn is the social security number is the amount of money the full time hourly employee earns hourly
	 */
	public FullTimeHourly(String firstName, String lastName, Address address, int id, Double basePay, Double overtime, String ssn )
	{
		super(firstName, lastName, address, id, basePay, ssn);
		setOvertimePay(overtime);
	}

	/**
	 * getter method for the amount of money the full time hourly employee earns hourly after reaching 40 hours
	 * @return the amount of money the full time hourly employee earns hourly after reaching 40 hours
	 */
	public Double getOvertimePay() {
		return overtimePay;
	}

	/**
	 * setter method for the amount of money the full time hourly employee earns hourly after reaching 40 hours
	 * @param overtimePay is the amount of money the full time hourly employee earns hourly after reaching 40 hours
	 */
	public void setOvertimePay(Double overtimePay) {
		this.overtimePay = overtimePay;
	}
	
	/**
	 * a method that introduces the full time hourly employee. 
	 * This prints out not only the attributes of a full time employee, but also the attributes of an employee and person. 
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
	 * method that gives a string representation of a full time hourly employee. This method overrides the toString method from the FullTimeEmployee class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, ID, education level, direct deposit status, overtime pay and base pay. 
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nThis person is a full time hourly employee" + "\nOvertime Pay: " + this.getOvertimePay();
		return value;
	}
	
	/**
	 * method that calculates the total pay owed to full time hourly employee
	 * @param numHrs  is the number of hours worked
	 * @return a Double that represents the total amount in dollars owed to the full time hourly employee
	 */
	public Double computePay(int numHrs)
	{
		Double totalPay;
		
		if(numHrs > 40)
		{
			numHrs -= 40;
			totalPay = (40 * getBasePay()) + (numHrs * getOvertimePay());
			return totalPay;
		}
		totalPay = numHrs * getBasePay();
		return totalPay;
	}

}
