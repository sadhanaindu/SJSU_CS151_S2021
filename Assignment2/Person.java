/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 02-24-2021
 * 
 * <h1>Person Class</h1>
 * This is a class that represents a person who lives in the United States of America. 
 *
 */
public class Person {
	/**
	 * private String attribute
	 */
	private String firstName;
	/**
	 * private String attribute
	 */
	private String lastName;
	/**
	 * private primative int attribute
	 */
	private int age;
	/**
	 * private String attribute
	 */
	private String ssn;
	/**
	 * private String attribute
	 */
	private String address;
	/**
	 * private String attribute
	 */
	private String gender;
	/**
	 * private Double attribute
	 */
	private Double weight;
	
	/**
	 * Creates a person with the given parameters. Creates an instance of the person class. 
	 * @param firstName is the first name of the person
	 * @param lastName is the last name of the person
	 * @param age is the age of the person in years
	 * @param ssn is the social security number of the person. It should have nine digits
	 * @param address is the street that the person lives on
	 * @param gender is the gender that the person identifies as
	 * @param weight is the weight of the person in pounds
	 */
	public Person(String firstName, String lastName, int age, String ssn, 
			String address, String gender, Double weight)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setSsn(ssn);
		setAddress(address);
		setGender(gender);
		setWeight(weight);
	}
	
	/**
	 * setter method for setting the first name of the person
	 * @param firstName is the first name of the person
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * getter method for getting the first name of the person
	 * @return a string that is the first name of the person
	 */
	public String getFirstName()
	{
		return this.firstName;
	}
	
	/**
	 * setter method for setting the last name of the person
	 * @param lastName is the last name of the person
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	 * getter method for getting the last name of the person
	 * @return a string that is the last name of the person
	 */
	public String getLastName()
	{
		return this.lastName;
	}
	
	/**
	 * setter method for setting the age of the person
	 * @param age is the age of the person in years
	 */
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	/**
	 * getter method for getting the age of the person
	 * @return a primative int that is the age of the person in years
	 */
	public int getAge() 
	{
		return this.age;
	}
	
	/**
	 * setter method for the social security number of the person
	 * @param ssn is the social security number of the person (9 digits)
	 */
	public void setSsn(String ssn) 
	{
		this.ssn = ssn;
	}
	
	/**
	 * getter method for the social security number of the person
	 * @return a string that is the 9 digit social security number of the person
	 */
	public String getSsn() 
	{
		return this.ssn;
	}
	
	/**
	 * setter method for the address of the person
	 * @param address is the street that the person lives on 
	 */
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	/**
	 * getter method for the address of the person
	 * @return a string that is the street that the person lives on
	 */
	public String getAddress() 
	{
		return this.address;
	}
	
	/**
	 * setter method for the gender of the person
	 * @param gender is the gender that the person identifies as
	 */
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	/**
	 * getter method for the gender of the person
	 * @return a string that is the gender of the person
	 */
	public String getGender() 
	{
		return this.gender;
	}
	
	/**
	 * setter method for the weight of the person
	 * @param weight is the weight of the person in pounds
	 */
	public void setWeight(Double weight) 
	{
		this.weight = weight;
	}

	/**
	 * getter method for the weight of the person
	 * @return a Double that is the weight of the person in pounds
	 */
	public Double getWeight() {
		return this.weight;
	}
	
	/**
	 * method that gives a string representation of the person. This representation includes their first and last name, 
	 * age, social security number, address, gender, and weight.
	 */
	@Override
	public String toString()
	{
		return "Name: " + this.firstName + " " + this.lastName + " Age: " + this.age + " SSN: " + this.ssn 
				+ " Address: " + this.address + " Gender: " + this.gender + " Weight: " + this.weight;
	}
	
	/**
	 * method that prints out the string representation of the student into the command line.
	 */
	public void introduce()
	{
		System.out.println(toString());
	}

}
