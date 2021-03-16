/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-15-2021
 * 
 * <h1>Employee Class</h1>
 * This is a class that represents an employee that works at Google.  
 */
public class Employee {
	
	/**
	 * private String attribute
	 */
	private String firstName;
	
	/**
	 * private String attribute
	 */
	private String lastName;

	/**
	 * private primitive int attribute
	 */
	private int id;
	
	/**
	 * private Double attribute
	 */
	private Double hourlyPay;
	
	
	/**
	 * Creates an employee with the given parameters. Creates an instance of the employee class.
	 * @param firstName is the first name of the employee
	 * @param lastName is the last name of the employee
	 * @param id is the identification number of the employee
	 * @param hourlyPay is the hourly pay of the employee
	 */
	public Employee(String firstName, String lastName, int id, Double hourlyPay)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.hourlyPay = hourlyPay;
	}
	
	/**
	 * setter method for setting the first name of the employee
	 * @param firstName is the first name of the employee
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * getter method for getting the first name of the employee
	 * @return a string that is the first name of the employee
	 */
	public String getFirstName()
	{
		return this.firstName;
	}
	
	/**
	 * setter method for setting the last name of the employee
	 * @param lastName is the last name of the employee
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	 * getter method for getting the last name of the employee
	 * @return a string that is the last name of the employee
	 */
	public String getLastName()
	{
		return this.lastName;
	}
	
	/**
	 * setter method for the identification number of the employee. 
	 * @param id is the identification number of the employee. It can be between 1-9 digits.
	 */
	public void setId(int id) 
	{
		this.id = id;
	}
	
	/**
	 * getter method  for the identification number of the employee. 
	 * @return a primitive int that is the identification number of the employee. It can be between 1-9 digits.
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * getter method for the hourly pay of the employee
	 * @return a double that is the amount of money that is earned by this employee per hour
	 */
	public Double getHourlyPay() {
		return hourlyPay;
	}

	/**
	 * setter method for the hourly pay of the employee 
	 * @param hourlyPay is the hourly pay of the employee
	 */
	public void setHourlyPay(Double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	public double computePay(int numOfHours)
	{
		double pay = 0;
		
		try
		{
			if(numOfHours < 0)
			{
				throw new NumberFormatException("No negative numbers can be used as input");
			}
			
		}catch(NumberFormatException e) {
			System.out.println(e);
			return pay;
		}
		
		try
		{
			if(numOfHours > 40)
			{
				throw new TooManyHoursWorkedException("You have worked too many hours. Input a number less than or equal to 40");
			}
			else
			{
				pay = getHourlyPay() * numOfHours;
			}
		}catch(TooManyHoursWorkedException e) {
			System.out.println(e);
		}
		
		return pay;
		
	}	

	
}

/**
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-15-2021
 * 
 * <h1>TooManyHoursWorkedException Class</h1>
 * This is custom exception that is used when more than 40 hours are worked. Extends Exception class
 */
class TooManyHoursWorkedException extends Exception
{
	TooManyHoursWorkedException(String s)
	{
		super(s);
	}
}


