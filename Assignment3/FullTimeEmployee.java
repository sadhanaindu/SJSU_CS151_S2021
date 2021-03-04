/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>FullTimeEmployee Class</h1>
 * This is an abstract class that represents a full time employee at Target. This class extends Employee. 
 * A full time employee is also an employee. 
 * 
 */
public abstract class FullTimeEmployee extends Employee {
	
	/**
	 * private Double attribute
	 */
	private Double basePay;
	
	/**
	 * Creates a full time employee with no parameters within a different class that extends FullTimeEmployee.
	 */
	public FullTimeEmployee()
	{
		super();
		setBasePay(0.0);
		
	}

	/**
	 * Creates a full time employee with the given parameters within a different class that extends FullTimeEmployee.
	 * @param firstName is the first name of the full time employee
	 * @param lastName is the last name of the full time employee
	 * @param address is the address of the full time employee
	 * @param id is the identification number of the full time employee
	 * @param basePay is the amount of money payed to the full time employee
	 * @param ssn is the social security number of the full time employee
	 */
	public FullTimeEmployee(String firstName, String lastName, Address address, int id, Double basePay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		setBasePay(basePay);
	}
	
	/**
	 * getter method for the amount of money payed to the full time employee
	 * @return the amount of money payed to the full time employee
	 */
	public Double getBasePay() {
		return basePay;
	}
	/**
	 * setter method for the amount of money payed to the full time employee
	 * @param basePay is the amount of money payed to the full time employee
	 */
	public void setBasePay(Double basePay) {
		this.basePay = basePay;
	}
	
	/**
	 * method that gives a string representation of a full time employee. This method overrides the toString method from the Employee class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, ID, education level, direct deposit status, and base pay. 
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nBase Pay: " + getBasePay();
		return value;
	}

}
