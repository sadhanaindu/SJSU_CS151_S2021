/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-3-2021
 * 
 * <h1>Employee Class</h1>
 * This is an abstract class that represents an Employee at Target. This class extends Person. 
 * A employee is also a person. 
 * 
 */
public abstract class Employee extends Person{

	/**
	 * private primitive int attribute
	 */
	private int id;
	
	/**
	 * private String attribute
	 */
	private String educationLevel;
	
	/**
	 * private boolean attribute
	 */
	private boolean directDeposit;
	
	/**
	 * Creates an employee with no parameters within a different class that extends Employee.
	 */
	public Employee()
	{
		super();
		this.setId(0);
		this.setEducationLevel("");
		this.setDirectDeposit(false);
	}
	
	
	/**
	 * Creates an employee with the given parameters within a different class that extends Employee.
	 * @param firstName is the first name of the employee
	 * @param lastName is the last name of the employee
	 * @param address is the address of the employee
	 * @param id is the id of the employee
	 * @param ssn is the social security number of the employee
	 */
	public Employee(String firstName, String lastName, Address address, int id, String ssn)
	{
		super(firstName, lastName, address, ssn);
		this.id = id;
		this.educationLevel = "";
		this.directDeposit = false;
		
	}

	
	/**
	 * getter method for the identification number of the employee. 
	 * @return a primative int that is the identification number of the employee. It can be between 1-9 digits.
	 */
	public int getId() {
		return id;
	}

	/**
	 * setter method for the identification number of the employee. 
	 * @param id is the identification number of the employee. It can be between 1-9 digits.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * getter method for the education level  of the employee. 
	 * @return a String that represents the education level  of the employee. 
	 */
	public String getEducationLevel() {
		return educationLevel;
	}

	/**
	 * setter method for the education level  of the employee. 
	 * @param educationLevel is the education level  of the employee. 
	 */
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	
	/**
	 * getter method for the direct deposit status of the employee. 
	 * @return a boolean that represents the direct deposit status  of the employee. 
	 */
	public boolean isDirectDeposit() {
		return directDeposit;
	}

	/**
	 * setter method for the direct deposit status of the employee. 
	 * @param directDeposit is the direct deposit status of the employee. 
	 */
	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	
	/**
	 * method that gives a string representation of the customer. This method overrides the toString method from the Person class.
	 * This representation includes their first and last name, 
	 * age, social security number, address, ID, education level, and direct deposit status. 
	 */
	@Override
	public String toString()
	{
		String value = super.toString();
		value += "\nID: " + id + "\nEducation Level: " + educationLevel
				+ "\nDirect Deposit: " + directDeposit;
		return value;
	}
	
	
}
