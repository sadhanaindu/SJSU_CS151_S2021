/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>PartTimeHourly Class</h1>
 * This is a class that represents a part time hourly employee at Target. This class extends Employee. 
 * A part time hourly employee is also an employee. So, any instance of PartTimeHourly 
 * also has the attributes: first and last name, address, id, ssn, direct deposit status, and 
 * educational level.
 * 
 */
public class PartTimeHourly extends Employee {
	
	/**
	 * private Double attribute
	 */
	private Double baseHourlyPay;
	
	/**
	 * Creates a part time hourly employee with no parameters. Creates an instance of the PartTimeHourly class. 
	 */
	public PartTimeHourly()
	{
		super();
		setHourlyPay(0.0);
		
	}
	
	/**
	 * Creates a part time hourly employee with no parameters. Creates an instance of the PartTimeHourly class. 
	 * @param firstName is the first name of the part time hourly employee
	 * @param lastName is the last name of the part time hourly employee
	 * @param address is the address of the part time hourly employee 
	 * @param id is the identification number of the part time hourly employee
	 * @param pay is the amount of money the part time hourly employee makes hourly
	 * @param ssn is the social security number of the part time hourly employee
	 */
	public PartTimeHourly(String firstName, String lastName, Address address, int id, Double pay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		setHourlyPay(pay);
	}

	/**
	 * getter method for the amount of money the part time hourly employee makes hourly
	 * @return the amount of money the part time hourly employee makes hourly 
	 */
	public Double getHourlyPay() {
		return baseHourlyPay;
	}

	/**
	 * setter method for the amount of money the part time hourly employee makes hourly
	 * @param baseHourlyPay is the amount of money the part time hourly employee makes hourly 
	 */
	public void setHourlyPay(Double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
	}
	
	/**
	 * a method that introduces the part time hourly employee. 
	 * This prints out not only the attributes of a person, but also the attributes of an employee.
	 * @param displaySSN will determine if the SSN of the part time hourly employee will be displayed
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
			int endIndex = value.indexOf("\nID:");
			String noSSN = value.substring(0,startIndex);
			noSSN+= value.substring(endIndex);
			System.out.println(noSSN);
		}
		
	}
	
	/**
	 * method that gives a string representation of the contractor. This method overrides the toString method from the Employee class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, direct deposit status, education level, 
	 * and the hourly pay of the part time hourly employee.
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nThis person is a part time hourly employee" + "\nHourly Pay: " + this.getHourlyPay();
		return value;
	}
	
	/**
	 * method that calculates the total pay owed to contractor
	 * @param numHrs  is the number of hours worked
	 * @return a Double that represents the total amount in dollars owed to the part time hourly employee.
	 */
	public Double computePay(int numHrs)
	{
		if(numHrs > 40)
		{
			return -1.0;
		}
		Double totalPay = numHrs * getHourlyPay();
		return totalPay;
	}

}
