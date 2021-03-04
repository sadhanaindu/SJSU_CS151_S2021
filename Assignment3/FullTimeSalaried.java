/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>FullTimeSalaried Class</h1>
 * This is a class that represents a full time salaried employee at Target. This class extends FullTimeEmployee. 
 * A full time salaried employee is also a full time employee. So, any instance of FullTimeSalaried 
 * also has the attributes of basePay.
 * 
 */
public class FullTimeSalaried extends FullTimeEmployee{
	
	/**
	 * Creates a a full time salary employee with no parameters. Creates an instance of the FullTimeSalaried class. 
	 */
	public FullTimeSalaried()
	{
		super();
	}
	
	/**
	 * Creates a full time salary employee with the given parameters. Creates an instance of the FullTimeSalaried class. 
	 * @param firstName is the first name of the full time salaried employee
	 * @param lastName is the last name of the full time salaried employee
	 * @param address is the address of the full time salaried employee
	 * @param id is the identification number of the full time salaried employee
	 * @param basePay is the amount of money the full time salaried employee earns hourly
	 * @param ssn is the social security number is the amount of money the full time salaried employee earns hourly
	 */
	public FullTimeSalaried(String firstName, String lastName, Address address, int id, Double salary, String ssn)
	{
		super(firstName, lastName, address, id, salary, ssn);
	}
	
	/**
	 * method that gives a string representation of a full time salaried employee. This method overrides the toString method from the FullTimeEmployee class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, ID, education level, direct deposit status, and base pay. 
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nThis person is a full time salaried employee";
		value = value.replace("\nBase Pay:", "\nSalary:");
		return value;
	}
	
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
	 * a method that introduces the full time salaried employee. 
	 * This prints out not only the attributes of a full time employee, but also the attributes of an employee and person. 
	 * @param numWeeks is the number of weeks worked
	 */
	public Double computePay(int numWeeks)
	{
		Double totalPay = getBasePay();
		totalPay = totalPay/52;
		totalPay *= numWeeks;
		return totalPay;
	}

}
