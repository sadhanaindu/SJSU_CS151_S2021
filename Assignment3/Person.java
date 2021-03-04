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
public abstract class Person {
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
	 * private Address attribute
	 */
	private Address address;
	
	/**
	 * Creates a person with no parameters within a different class that extends Person.
	 */
	public Person()
	{
		firstName = "";
		lastName = "";
		age = 0;
		
	}
	
	/**
	 * Creates a person with the given parameters within a different class that extends Person.
	 * @param firstName is the first name of the person
	 * @param lastName is the last name of the person
	 * @param address is the address of the person 
	 * @param ssn is the social security number of the person
	 */
	public Person(String firstName, String lastName, Address address, String ssn)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setSsn(ssn);
	}

	/**
	 * getter method for getting the first name of the person
	 * @return a string that is the first name of the person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * setter method for setting the first name of the person
	 * @param firstName is the first name of the person
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getter method for getting the last name of the person
	 * @return a string that is the last name of the person
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * setter method for setting the last name of the person
	 * @param lastName is the last name of the person
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getter method for getting the age of the person
	 * @return a primative int that is the age of the person in years
	 */
	public int getAge() {
		return age;
	}

	/**
	 * setter method for setting the age of the person
	 * @param age is the age of the person in years
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * getter method for the address of the person
	 * @return an address object that is represents the address where  the person lives on
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * setter method for the address of the person
	 * @param address is the address where  the person lives on
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * getter method for the social security number of the person
	 * @return a string that is the 9 digit social security number of the person
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * setter method for the social security number of the person
	 * @param ssn is the social security number of the person (9 digits)
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	/**
	 * method that gives a string representation of the person. This representation includes their first and last name, 
	 * age, social security number, and address.
	 */
	public String toString()
	{
		String value = "Person's name: " + firstName + " " + lastName 
				+ "\nAge: " + age + "\nAddress: " + address.toString() + " \nSSN: " + ssn;
		return value;
	}
	

}
