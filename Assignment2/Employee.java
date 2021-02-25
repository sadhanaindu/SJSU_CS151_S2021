/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Employee Class</h1>
 * This is a class that represents an employee that works at Google. This class extends the class People. 
 * An Employee is a person. So, any instance of Employee will also have the attributes: first and last name,
 *  age, ssn, address, gender, and weight. 
 */
public class Employee extends Person {

	/**
	 * private primitive int attribute
	 */
	private int id;
	/**
	 * private String attribute
	 */
	private String status;
	/**
	 * private Double attribute
	 */
	private Double basePay;
	
	/**
	 * Creates an employee with the given parameters. Creates an instance of the employee class.
	 * @param firstName is the first name of the employee
	 * @param lastName is the last name of the employee
	 * @param age is the age of the employee in years
	 * @param ssn is the social security number of the employee. It should have nine digits
	 * @param address is the street that the employee lives on
	 * @param gender is the gender that the employee identifies as
	 * @param weight is the weight of the employee in pounds
	 * @param id is the identification number of the employee. It can be between 1-9 digits.
	 * @param status is the employment status of the employee. They can be part time, full time, or contract.
	 * @param basePay is the amount of pay an employee gets paid for a unit of time they work.
	 */
	public Employee(String firstName, String lastName, int age, String ssn, String address, String gender,
			Double weight, int id, String status, Double basePay) 
	{
		super(firstName, lastName, age, ssn, address, gender, weight);
		setId(id);
		setStatus(status);
		setBasePay(basePay);
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
	 * @return a primative int that is the identification number of the employee. It can be between 1-9 digits.
	 */
	public int getId() 
	{
		return id;
	}
	
	/**
	 * setter method for the employment status of the employee. 
	 * @param status is the employment status of the employee. They can be part time, full time, or contract.
	 */
	public void setStatus(String status) 
	{
		this.status = status;
	}

	/**
	 * getter method for the employment status of the employee. 
	 * @return a string that is the employment status of the employee. It can be part time, full time, or contract.
	 */
	public String getStatus() 
	{
		return status;
	}
	
	/**
	 * setter method for the amount of pay an employee gets paid for a unit of time they work.
	 * @param basePay is the amount of pay an employee gets paid for a unit of time they work. 
	 * For full time it's per year. For part time and contract, it's per hour.
	 */
	public void setBasePay(Double basePay) 
	{
		this.basePay = basePay;
	}

	/**
	 * getter method for the amount of pay an employee gets paid for a unit of time they work.
	 * @return a Double that is the amount of pay an employee gets paid for a unit of time they work. 
	 * For full time it's per year. For part time and contract, it's per hour.
	 */
	public Double getBasePay() 
	{
		return basePay;
	}
	
	/**
	 * a method that introduces the employee. This method overrides the introduce method from the person class. 
	 * This prints out not only the attributes of a person, but also the attributes of an employee. This includes:
	 * ID, employment status, and pay. 
	 */
	@Override
	public void introduce()
	{
		String personData = super.toString();
		String employeeData = "ID: " + this.id + " Status: " + this.status + " Pay: " + this.basePay;
		System.out.println(personData);
		System.out.println(employeeData);
	}
	
	/**
	 * A method that helps employees calculate the pay they are owed based off of the time they have worked and
	 * their employment status.
	 * @param unitsWorked is the number of units worked. Units for part timers and contractors is hourly.
	 * Units for full timers is yearly.
	 * @return a Double that is the amount of money they are owed from Google for the work they have done. 
	 */
	public Double calculatePay(Double unitsWorked)
	{
		if(getStatus().equalsIgnoreCase("contract") || getStatus().equalsIgnoreCase("part time"))
		{
			return unitsWorked * getBasePay();
		}
		else
			return unitsWorked * 1/52 * getBasePay();
	}
	
	
	
	

}
