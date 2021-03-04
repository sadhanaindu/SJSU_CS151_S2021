/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>Executive Class</h1>
 * This is an abstract class that represents an executive at Target. This class extends Employee. 
 * A executive is an employee. So, any instance of Executive 
 * also has the attributes: first and last name, address, id, ssn, direct deposit status, and 
 * educational level. 
 * 
 */
public class Executive extends Employee {
	
	/**
	 * private Double attribute
	 */
	private Double yearlyBonus;
	/**
	 * private Double attribute
	 */
	private Double yearlyCompensation;
	
	/**
	 * Creates an executive with no parameters. Creates an instance of the Executive class. 
	 */
	public Executive()
	{
		super();
		setBonus(0.0);
		setCompensation(0.0);
	}
	
	/**
	 * Creates an executive with the given parameters. Creates an instance of the Executive class. 
	 * @param firstName is the first name of the executive
	 * @param lastName is the last name of the executive
	 * @param address is the address of the executive
	 * @param id is the identification number of the executive
	 * @param pay is the amount of money the executive earns in a year
	 * @param bonus is the extra money they earn in a year on top of an executive's pay
	 * @param ssn is their social security number of an executive
	 */
	public Executive(String firstName, String lastName, Address address, int id, Double pay, Double bonus, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		setBonus(bonus);
		setCompensation(pay);
	}

	
	/**
	 * getter method for the bonus earned by the executive
	 * @return he extra money they earn in a year on top of an executive's pay
	 */
	public Double getBonus() {
		return yearlyBonus;
	}

	/**
	 * setter method for the bonus earned by the executive
	 * @param yearlyBonus is the amount of extra money an executive earns
	 */
	public void setBonus(Double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	
	/**
	 * getter method for the amount of money earned by an executive per year
	 * @return the amount of money an executive earns in a year
	 */
	public Double getCompensation() {
		return yearlyCompensation;
	}

	/**
	 * setter method for the amount of money earned by an executive per year
	 * @param yearlyCompensation is the amount of money an executive earns in a year
	 */
	public void setCompensation(Double yearlyCompensation) {
		this.yearlyCompensation = yearlyCompensation;
	}
	
	/**
	 * a method that introduces the executive. Prints out all their attributes
	 * @param displaySSN will determine if the SSN of the executive will be displayed
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
	 * method that gives a string representation of the customer. This method overrides the toString method from the Person class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, ID, education level, direct deposit status, 
	 * yearly compensation, and yearly bonus. 
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nThis person is an executive" + "\nYearly Compensation: " + this.getCompensation() + "\nYearly Bonus: " + getBonus();
		return value;
	}
	
	/**
	 * method that calculates the total pay owed to executive
	 * @return a Double that represents the total amount in dollars owed to the executive
	 */
	public Double computePay()
	{
		Double totalPay = getCompensation() + getBonus();
		return totalPay;
	}
	
	

}
