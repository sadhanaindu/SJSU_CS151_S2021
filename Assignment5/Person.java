/**
 * 
 * @author sadhanaindukuri
 * @version 1.0
 * @since 03-24-2021
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
	 * Creates a person with the given parameters. Creates an instance of the person class. 
	 * @param firstName is the first name of the person
	 * @param lastName is the last name of the person
	 * @param age is the age of the person in years

	 */
	public Person(String firstName, String lastName, int age)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
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
	 * prints out string value to represent the person object
	 */
	public String toString() 
	{
		return getFirstName() + " " + getLastName() + ", " + getAge(); 
	}

}
